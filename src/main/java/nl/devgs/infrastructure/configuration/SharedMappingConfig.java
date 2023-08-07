package nl.devgs.infrastructure.configuration;

import org.mapstruct.MapperConfig;
import org.mapstruct.ReportingPolicy;

@MapperConfig(
        unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface SharedMappingConfig {
}
