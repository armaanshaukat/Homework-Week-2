
public class LEDPrinter extends Printer{

	PrinterComponentFactory componentFactory;
	
	public LEDPrinter(PrinterComponentFactory componentFactory) {
		this.componentFactory = componentFactory;
	}
	void recieveOrder() {
		System.out.println("Preparing to Build " + name);
		System.out.println("Gathering Drum, Toner and LED Array");
		scanner = componentFactory.selectScanner();
		wire = componentFactory.selectWire();
		screen = componentFactory.selectScreen();
	}
}