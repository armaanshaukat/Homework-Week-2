
public class PremiumLEDPrinterStore extends PrinterShop {
	
	protected Printer buildPrinter(String item) {
		
		Printer printer = null;
		PrinterComponentFactory componentFactory = new PremiumLEDPrinterFactory();
		
		if (item.equals("premium led")) {
			printer = new LEDPrinter(componentFactory);
			printer.setName("Premium Model LED Printer");
		}
		
		return printer;
	}
}