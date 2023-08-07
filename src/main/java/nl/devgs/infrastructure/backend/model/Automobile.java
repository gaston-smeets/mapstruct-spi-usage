package nl.devgs.infrastructure.backend.model;

public class Automobile {

    private Integer number_of_seats;

    private String manufacturer;

    private String model;

    private String fuel_technology;

    public Integer get_number_of_seats() {
        return number_of_seats;
    }

    public void set_number_of_seats(final Integer number_of_seats) {
        this.number_of_seats = number_of_seats;
    }

    public String get_manufacturer() {
        return manufacturer;
    }

    public void set_manufacturer(final String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String get_model() {
        return model;
    }

    public void set_model(final String model) {
        this.model = model;
    }

    public String get_fuel_technology() {
        return fuel_technology;
    }

    public void set_fuel_technology(final String fuel_technology) {
        this.fuel_technology = fuel_technology;
    }
}
