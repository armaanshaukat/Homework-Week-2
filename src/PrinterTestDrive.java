
public class PrinterTestDrive {

	public static void main(String[] args) {
		PrinterShop order1 = new InkPrinterStore();

		Printer printer = order1.orderPrinter("ink");
		System.out.println(printer);
	}

}
