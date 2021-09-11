
public abstract class Printer {
	String name;
	
	Scanner scanner;
	Wire wire;
	Screen screen;
	
	abstract void recieveOrder();
	
	void getComponents() {
		System.out.println("Gathering Custom Components for Assembly");
	}
	
	void assemble() {
		System.out.println("Assembling Components into Unit");
	}
	
	void box() {
		System.out.println("Boxed and Ready for Shipping");
	}
	
	void setName (String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " Custom Features----\n");
		
		if (scanner != null) {
			result.append(scanner);
			result.append("\n");
		}
		
		if (wire != null) {
			result.append(wire);
			result.append("\n");
		}
		
		if (screen != null) {
			result.append(screen);
			result.append("\n");
		}
		
		return result.toString();
	}
}