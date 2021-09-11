
public class BaseLEDPrinterStore extends PrinterShop {

	protected Printer buildPrinter(String item) {
		Printer printer = null;
		PrinterComponentFactory componentFactory = new BaseLEDPrinterFactory();
		
		if (item.equals("base led")) {
			printer = new LEDPrinter(componentFactory);
			printer.setName("Base Model LED Printer");
		}
		
		return printer;
	}
}
