package nl.devgs.domain.model;

import lombok.Data;

@Data
public class Car {

    private String manufacturer;

    private String model;

    private FuelType fuelType;

    private Integer nrOfSeats;
}
