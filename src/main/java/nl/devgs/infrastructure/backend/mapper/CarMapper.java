package nl.devgs.infrastructure.backend.mapper;

import nl.devgs.domain.model.Car;
import nl.devgs.infrastructure.backend.model.Automobile;
import nl.devgs.infrastructure.backend.model.Vehicle;
import nl.devgs.infrastructure.configuration.SharedMappingConfig;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = SharedMappingConfig.class, uses = FuelTypeMapper.class)
public interface CarMapper {

    @Mapping(target = "nrOfSeats", constant = "4")
    @Mapping(target = "fuelType", source = "fuel")
    Car toCar(Vehicle vehicle);

    @Mapping(target = "nrOfSeats", source = "number_of_seats")
    @Mapping(target = "model", source = "model")
    @Mapping(target = "manufacturer", source = "manufacturer")
    @Mapping(target = "fuelType", source = "fuel_technology")
    Car toCar(Automobile automobile);
}
