
public class BaseInkPrinterStore extends PrinterShop {

	protected Printer buildPrinter(String item) {
		Printer printer = null;
		PrinterComponentFactory componentFactory = new BaseInkPrinterFactory();
		
		if (item.equals("base ink")) {
			printer = new InkPrinter(componentFactory);
			printer.setName("Base Model Ink Printer");
		}
		return printer;
	}
}
