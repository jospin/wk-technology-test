package br.com.wktechnology.knowledge.facade;

import br.com.wktechnology.knowledge.model.entity.*;
import br.com.wktechnology.knowledge.repository.DonationRepository;
import br.com.wktechnology.knowledge.rest.dto.Candidate;
import br.com.wktechnology.knowledge.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class DonationFacade {
    private final DonationService donationService;
    private final AddressService addressService;
    private final StateService stateService;
    private final CityService cityService;

    private

    DonationFacade(DonationService donationService,
                   AddressService addressService,
                   StateService stateService,
                   CityService cityService) {
        this.donationService = donationService;
        this.addressService = addressService;
        this.cityService = cityService;
        this.stateService = stateService;

    }

    public void saveAll(List<Candidate> candidates) {
        List<Donator> donatorList = new ArrayList<>(List.of());
        for (Candidate candidate : candidates) {
            State state = stateService.mapperToModel(candidate);
            City city = cityService.mapperToModel(candidate, state);
            Address address = addressService.mapperToModel(candidate, city);
            Donator donator = donationService.mapperToModel(candidate, address);
            donatorList.add(donator);
            log.info("Donator object {} ", donator);
        }
        donationService.saveAll(donatorList);
    }
}
