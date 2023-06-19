package br.com.wktechnology.knowledge.service;

import br.com.wktechnology.knowledge.model.entity.IMvcCalculate;
import br.com.wktechnology.knowledge.repository.DonationRepository;
import br.com.wktechnology.knowledge.rest.dto.FormReport;
import br.com.wktechnology.knowledge.rest.dto.RangeAverage;
import br.com.wktechnology.knowledge.rest.dto.ReportResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("imc-report-for-age")
@Slf4j
public class ImcReportForAgeService implements ReportService{

    private final DonationRepository repository;
    ImcReportForAgeService(DonationRepository repository) {
        this.repository = repository;
    }
    @Override
    public ReportResult reportFactory(FormReport formReport) {

        List<IMvcCalculate> mvcCalculate = repository.imcDonationForAge();
        log.info("calcular valor: {}", mvcCalculate.get(0).getAverage());
        ReportResult reportResult = new ReportResult();
        RangeAverage rangeAverage = new RangeAverage();
        reportResult.setRangeAverageList(new ArrayList<>());
        for(IMvcCalculate iMvcCalculate: mvcCalculate) {
            rangeAverage.setRange(iMvcCalculate.getRange());
            rangeAverage.setAverage(iMvcCalculate.getAverage());
            reportResult.getRangeAverageList().add(rangeAverage);
        }

        return reportResult;
    }
}
