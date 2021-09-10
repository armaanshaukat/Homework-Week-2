
public abstract class PrinterShop {
	protected abstract Printer buildPrinter(String item);
	
	public Printer orderPrinter(String type) {
		Printer printer = buildPrinter(type);
		printer.recieveOrder();
		printer.getComponents();
		printer.assemble();
		printer.box();
		return printer;
	}
}