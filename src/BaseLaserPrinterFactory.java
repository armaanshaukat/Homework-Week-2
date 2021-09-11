
public class BaseLaserPrinterFactory implements PrinterComponentFactory {
	
	public Scanner selectScanner() {
		return new NoScannerComponent();
	}
	
	public Wire selectWire() {
		return new WiredConnection();
	}
	
	public Screen selectScreen() {
		return new NoTouchScreen();
	}
}