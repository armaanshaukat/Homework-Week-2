
public class PrinterTestDrive {

	public static void main(String[] args) {
		PrinterShop order1 = new BaseInkPrinterStore();
		PrinterShop order2 = new PremiumInkPrinterStore();
		PrinterShop order3 = new EliteInkPrinterStore();
		
		Printer printer = order3.orderPrinter("elite ink");
		System.out.println(printer);
	}

}
