
public class PremiumInkPrinterStore extends PrinterShop {

	protected Printer buildPrinter(String item) {
		Printer printer = null;
		PrinterComponentFactory componentFactory = new PremiumInkPrinterFactory();
		
		if (item.equals("premium ink")) {
			printer = new InkPrinter(componentFactory);
			printer.setName("Premium Model Ink Printer");
		}
		
		return printer;
	}
}