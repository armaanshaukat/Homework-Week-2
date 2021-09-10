
public abstract class Printer {
	String name;
	
	Scanner scanner;
	Wire wire;
	Screen screen;
	
	abstract void recieveOrder();
	
	void getComponents() {
		System.out.println("Gathering components for assembly");
	}
	
	void assemble() {
		System.out.println("Assembling components to specification");
	}
	
	void box() {
		System.out.println("Boxing complete printer for shipping");
	}
	
	void setName (String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + "----\n");
		
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
