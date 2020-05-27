

public class App {

	public static void main(String[] args) {
		System.out.println("Hello: World");
		Interpreter interpreter = new Interpreter();
	    String text = "";
	
	    while(!text.equalsIgnoreCase("exit")){
	    	System.out.println(">> ");
	    	text = interpreter.getCommandLine();
	    	interpreter.processCommandLine(text);
	    }
	    System.out.println("Exited");
	}

}
