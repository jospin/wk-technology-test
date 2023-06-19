package br.com.wktechnology.knowledge.service;

import br.com.wktechnology.knowledge.rest.dto.FormReport;
import br.com.wktechnology.knowledge.rest.dto.ReportResult;

public interface ReportService {

    ReportResult reportFactory(FormReport formReport);
}
