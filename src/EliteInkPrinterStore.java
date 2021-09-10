
public class EliteInkPrinterStore extends PrinterShop {

	protected Printer buildPrinter(String item) {
		Printer printer = null;
		PrinterComponentFactory componentFactory = new EliteInkPrinterFactory();
		
		if (item.equals("elite ink")) {
			printer = new InkPrinter(componentFactory);
			printer.setName("Elite Model Ink Printer");
		}
		return printer;
	}
}
