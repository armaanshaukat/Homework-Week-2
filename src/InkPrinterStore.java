
public class InkPrinterStore extends PrinterShop {

	protected Printer buildPrinter(String item) {
		Printer printer = null;
		PrinterComponentFactory componentFactory = new InkPrinterFactory();
		
		if (item.equals("ink")) {
			printer = new InkPrinter(componentFactory);
			printer.setName("Ink Printer");
		}
		return printer;
	}

}
