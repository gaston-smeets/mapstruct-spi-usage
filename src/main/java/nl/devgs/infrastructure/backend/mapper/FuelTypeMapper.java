package nl.devgs.infrastructure.backend.mapper;

import nl.devgs.domain.model.FuelType;
import org.mapstruct.Mapper;
import org.mapstruct.ValueMapping;
import org.mapstruct.ValueMappings;

import static org.mapstruct.MappingConstants.ANY_REMAINING;
import static org.mapstruct.MappingConstants.THROW_EXCEPTION;

@Mapper
public interface FuelTypeMapper {

    @ValueMappings(
            @ValueMapping(source = ANY_REMAINING, target = THROW_EXCEPTION)
    )
    FuelType toFuelType(String fuel);
}
