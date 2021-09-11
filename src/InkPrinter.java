
public class InkPrinter extends Printer {
	PrinterComponentFactory componentFactory;
	
	public InkPrinter(PrinterComponentFactory componentFactory) {
		this.componentFactory = componentFactory;
	}
	void recieveOrder() {
		System.out.println("Preparing to Build " + name);
		System.out.println("Gathering Ink Cartridges and Print Head");
		scanner = componentFactory.selectScanner();
		wire = componentFactory.selectWire();
		screen = componentFactory.selectScreen();
	}
}