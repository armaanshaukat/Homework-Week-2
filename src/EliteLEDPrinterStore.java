
public class EliteLEDPrinterStore extends PrinterShop {
	
	protected Printer buildPrinter(String item) {
		
		Printer printer = null;
		PrinterComponentFactory componentFactory = new EliteLEDPrinterFactory();
		
		if (item.equals("elite led")) {
			printer = new LEDPrinter(componentFactory);
			printer.setName("Elite Model LED Printer");
		}
		return printer;
	}
}