
public class InkPrinter extends Printer {
	PrinterComponentFactory componentFactory;
	
	public InkPrinter(PrinterComponentFactory componentFactory) {
		this.componentFactory = componentFactory;
	}
	void recieveOrder() {
		System.out.println(name);
		scanner = componentFactory.selectScanner();
		wire = componentFactory.selectWire();
		screen = componentFactory.selectScreen();
	}
}
