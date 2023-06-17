package br.com.wktechnology.knowledge.mapper;

import br.com.wktechnology.knowledge.model.entity.City;
import br.com.wktechnology.knowledge.rest.dto.Candidate;
import org.springframework.stereotype.Component;

@Component
public class CityMapper implements Mapper<City, Candidate> {
    @Override
    public City toModel(Candidate dto) {
        return City.builder()
                .name(dto.getCity())
                .build();
    }

    @Override
    public Candidate toDto(City model) {
        return null;
    }
}
