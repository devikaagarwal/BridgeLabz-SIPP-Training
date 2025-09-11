interface ReportExporter {
    void exportCSV();
    void exportPDF();

    default void exportJSON() {
        System.out.println("Exporting report in JSON format (default).");
    }
}

class SalesReportExporter implements ReportExporter {
    public void exportCSV() {
        System.out.println("Exporting Sales Report in CSV.");
    }
    public void exportPDF() {
        System.out.println("Exporting Sales Report in PDF.");
    }
}

public class ExportDemo {
    public static void main(String[] args) {
        ReportExporter exporter = new SalesReportExporter();
        exporter.exportCSV();
        exporter.exportPDF();
        exporter.exportJSON();
    }
}

