package prac04;

import java.util.ArrayList;

public class PrinterManager {
    private static PrinterManager printerManager = null;
    // 프린터 관리 배열
    private ArrayList<Printer> managedPrinter = new ArrayList<Printer>();

    // 3대의 프린터 생성
    private PrinterManager() {
        managedPrinter.add(new Printer());
        managedPrinter.add(new Printer());
        managedPrinter.add(new Printer());
    }
    public synchronized static PrinterManager getPrinterManager() {
        if (printerManager == null) {
            printerManager = new PrinterManager();
        }
        return printerManager;
    }

    public synchronized Printer getPrinter() {
        while(true) {
            for (Printer printer:managedPrinter) {
                if (printer.isAvailable()) {
                    printer.setAvailable(false);
                    return printer;
                }
            }
        }
    }
}
