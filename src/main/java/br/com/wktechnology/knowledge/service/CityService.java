package br.com.wktechnology.knowledge.service;

import br.com.wktechnology.knowledge.mapper.CityMapper;
import br.com.wktechnology.knowledge.model.entity.City;
import br.com.wktechnology.knowledge.model.entity.State;
import br.com.wktechnology.knowledge.repository.CityRepository;
import br.com.wktechnology.knowledge.rest.dto.Candidate;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityService {

    private final CityMapper cityMapper;
    private final CityRepository cityRepository;

    public CityService(CityMapper cityMapper, CityRepository cityRepository) {
        this.cityRepository = cityRepository;
        this.cityMapper = cityMapper;
    }

    public City mapperToModel(Candidate candidate, State state) {
        Optional<City> cityOptional = cityRepository.findByName(candidate.getCity());
        if (cityOptional.isPresent()) {
            return cityOptional.get();
        }
        City city = cityMapper.toModel(candidate);
        city.setState(state);
        cityRepository.save(city);
        return city;

    }
}
