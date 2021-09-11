
public class EliteLaserPrinterStore extends PrinterShop {

	protected Printer buildPrinter(String item) {
		Printer printer = null;
		PrinterComponentFactory componentFactory = new EliteLaserPrinterFactory();
		
		if (item.equals("elite laser")) {
			printer = new LaserPrinter(componentFactory);
			printer.setName("Elite Model Laser Printer");
		}
		
		return printer;
	}
}