package br.com.wktechnology.knowledge.mapper;

import br.com.wktechnology.knowledge.model.entity.City;
import br.com.wktechnology.knowledge.rest.dto.Candidate;
import org.springframework.stereotype.Component;

@Component
public class CityMapper implements Mapper<City, Candidate> {
    @Override
    public City toModel(Candidate dto) {
        City city = new City();
        city.setName(dto.getCity());
        return city;
    }

}
