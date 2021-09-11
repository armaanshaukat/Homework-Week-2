
public class BaseLaserPrinterStore extends PrinterShop {

	protected Printer buildPrinter(String item) {
		Printer printer = null;
		PrinterComponentFactory componentFactory = new BaseLaserPrinterFactory();
		
		if (item.equals("base laser")) {
			printer = new LaserPrinter(componentFactory);
			printer.setName("Base Model Laser Printer");
		}
		
		return printer;
	}
}