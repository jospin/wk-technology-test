package br.com.wktechnology.knowledge.rest.controller;

import br.com.wktechnology.knowledge.facade.DonationFacade;
import br.com.wktechnology.knowledge.rest.dto.Candidate;
import br.com.wktechnology.knowledge.service.DonationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(path = "/wt-technology/donation/v1")
public class DonationController {

    private DonationFacade donationFacade;
    DonationController(DonationFacade donationFacade) {
        this.donationFacade = donationFacade;
    }

    @PostMapping(value = "/candidates")
    public ResponseEntity<String> insertCandidates(@RequestBody List<Candidate> candidates) {
        donationFacade.saveAll(candidates);
        return ResponseEntity.ok("Sucesso");
    }


}
