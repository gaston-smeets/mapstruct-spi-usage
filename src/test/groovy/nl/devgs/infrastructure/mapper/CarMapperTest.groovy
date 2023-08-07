package nl.devgs.infrastructure.mapper

import nl.devgs.domain.model.Car
import nl.devgs.domain.model.FuelType
import nl.devgs.infrastructure.backend.mapper.CarMapper
import nl.devgs.infrastructure.backend.model.Automobile
import nl.devgs.infrastructure.backend.model.Vehicle
import org.mapstruct.factory.Mappers
import spock.lang.Specification
import sun.awt.OverrideNativeWindowHandle

class CarMapperTest extends Specification {

    def mapper = Mappers.getMapper(CarMapper.class)

    def 'whenCamelCaseIsMapped_ThenTheCarIsCorrect'() {
        given: 'A vehicle'
        def vehicle = new Vehicle().tap {
            manufacturer = 'Tesla'
            model = 'Model Y'
            fuel = 'ELECTRIC'
        }

        when: 'The vehicle is mapped to a car'
        def car = mapper.toCar(vehicle)

        then: 'The car is correct'
        car.manufacturer == 'Tesla'
        car.model == 'Model Y'
        car.fuelType == FuelType.ELECTRIC
    }

    def 'whenSnakeCaseIsMapped_ThenTheMappingIsCorrect()'() {
        given: 'An automobile'
        def automobile = new Automobile().tap {
            set_manufacturer('Kia')
            set_model('Sportage')
            set_fuel_technology('GASOLINE')
            set_number_of_seats(3)
        }

        when: 'The automobile is mapped'
        def car = mapper.toCar(automobile)

        then: 'The car is correct'
        car.nrOfSeats == 3
        car.manufacturer == 'Kia'
        car.model == 'Sportage'
        car.fuelType == FuelType.GASOLINE
    }
}
