package br.com.wktechnology.knowledge.rest.controller;

import br.com.wktechnology.knowledge.rest.dto.FormReport;
import br.com.wktechnology.knowledge.service.ReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping(path = "/wt-technology/reports/v1")
public class ReportForStateController {

    private final ReportService reportService;

    ReportForStateController(@Qualifier("for-state-report") ReportService forStateService) {
        this.reportService = forStateService;
    }

    @PostMapping(value = "/for-state-report")
    public ResponseEntity<?> forStateReport(@RequestBody FormReport formReport) {
        return ResponseEntity.ok(reportService.reportFactory(formReport));
    }
}
