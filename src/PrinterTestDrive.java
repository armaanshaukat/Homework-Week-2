
public class PrinterTestDrive {

	public static void main(String[] args) {
		PrinterShop order1 = new BaseInkPrinterStore();
		PrinterShop order2 = new PremiumInkPrinterStore();
		PrinterShop order3 = new EliteInkPrinterStore();
		
		PrinterShop order4 = new BaseLEDPrinterStore();
		PrinterShop order5 = new PremiumLEDPrinterStore();
		PrinterShop order6 = new EliteLEDPrinterStore();
		
		PrinterShop order7 = new BaseLaserPrinterStore();
		PrinterShop order8 = new PremiumLaserPrinterStore();
		PrinterShop order9 = new EliteLaserPrinterStore();
		
		// Ink Printer Products
		Printer printer = order1.orderPrinter("base ink");
		System.out.println(printer);
		
		Printer printer1 = order2.orderPrinter("premium ink");
		System.out.println(printer1);
		
		Printer printer2 = order3.orderPrinter("elite ink");
		System.out.println(printer2);
		
		// LED Printer Products
		Printer printer3 = order4.orderPrinter("base led");
		System.out.println(printer3);
		
		Printer printer4 = order5.orderPrinter("premium led");
		System.out.println(printer4);
		
		Printer printer5 = order6.orderPrinter("elite led");
		System.out.println(printer5);
		
		// Laser Printer Products
		Printer printer6 = order7.orderPrinter("base laser");
		System.out.println(printer6);
		
		Printer printer7 = order8.orderPrinter("premium laser");
		System.out.println(printer7);
		
		Printer printer8 = order9.orderPrinter("elite laser");
		System.out.println(printer8);
	}
}