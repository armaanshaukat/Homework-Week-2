
public class LaserPrinter extends Printer {
PrinterComponentFactory componentFactory;
	
	public LaserPrinter(PrinterComponentFactory componentFactory) {
		this.componentFactory = componentFactory;
	}
	void recieveOrder() {
		System.out.println("Preparing to Build " + name);
		System.out.println("Gathering Drum, Toner and Laser");
		scanner = componentFactory.selectScanner();
		wire = componentFactory.selectWire();
		screen = componentFactory.selectScreen();
	}

}