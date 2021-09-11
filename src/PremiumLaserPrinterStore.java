
public class PremiumLaserPrinterStore extends PrinterShop {

	protected Printer buildPrinter(String item) {
		Printer printer = null;
		PrinterComponentFactory componentFactory = new PremiumLaserPrinterFactory();
		
		if (item.equals("premium laser")) {
			printer = new LaserPrinter(componentFactory);
			printer.setName("Premium Model Laser Printer");
		}
		
		return printer;
	}
}