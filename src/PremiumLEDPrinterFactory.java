
public class PremiumLEDPrinterFactory implements PrinterComponentFactory {
	
	public Scanner selectScanner() {
		return new ScannerComponent();
	}
	
	public Wire selectWire() {
		return new WiredConnection();
	}
	
	public Screen selectScreen() {
		return new TouchScreen();
	}
}