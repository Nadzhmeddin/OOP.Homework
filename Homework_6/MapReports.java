package Homework_6;

import java.util.Map;
import java.util.NoSuchElementException;

public class MapReports {

    protected final Map<String, Report> reports;

    public MapReports(Map<String, Report> reports) {
        this.reports = reports;
    }

    public byte[] createReport(Document document, String docType) {
        Report report = reports.get(docType);
        if(report == null) {
            throw new NoSuchElementException("Данный тип файла не найден" + docType);
        }
        return report.createReport(document);
    }
}
