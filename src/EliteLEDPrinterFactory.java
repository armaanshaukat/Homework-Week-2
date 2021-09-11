
public class EliteLEDPrinterFactory implements PrinterComponentFactory {
	
	public Scanner selectScanner() {
		return new ScannerComponent();
	}
	
	public Wire selectWire() {
		return new WirelessConnection();
	}
	
	public Screen selectScreen() {
		return new TouchScreen();
	}
}