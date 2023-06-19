package br.com.wktechnology.knowledge.service;

import br.com.wktechnology.knowledge.repository.DonationRepository;
import br.com.wktechnology.knowledge.rest.dto.FormReport;
import br.com.wktechnology.knowledge.rest.dto.ReportResult;
import org.springframework.stereotype.Service;

@Service("for-state-report")
public class ForStateReportService implements ReportService {

    private DonationRepository repository;

    ForStateReportService(DonationRepository repository) {
        this.repository = repository;
    }

    @Override
    public ReportResult reportFactory(FormReport formReport) {
        int amount = repository.donationWforState(formReport.getUf());
        ReportResult reportResult = new ReportResult();
        reportResult.setAmount(amount);
        return reportResult;
    }
}
