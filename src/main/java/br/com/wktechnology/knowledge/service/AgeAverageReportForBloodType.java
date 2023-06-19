package br.com.wktechnology.knowledge.service;

import br.com.wktechnology.knowledge.repository.DonationRepository;
import br.com.wktechnology.knowledge.rest.dto.FormReport;
import br.com.wktechnology.knowledge.rest.dto.ReportResult;
import org.springframework.stereotype.Service;

@Service("age-average-report-for-blood-type")
public class AgeAverageReportForBloodType implements ReportService{

    private final DonationRepository repository;
    AgeAverageReportForBloodType(DonationRepository repository) {
        this.repository = repository;
    }
    @Override
    public ReportResult reportFactory(FormReport formReport) {
        double amount = repository.ageAverageForBloodType(formReport.getBloodType());
        ReportResult reportResult = new ReportResult();
        reportResult.setAvg(amount);
        return reportResult;
    }
}
