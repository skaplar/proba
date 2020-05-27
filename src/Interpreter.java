import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Interpreter {
	private Parser parser;
	private Scanner scan;
	private Map<String, Command> commands;
	Command cmd = null;
	
	public Interpreter(){
		parser = new Parser();
		commands = new HashMap<String, Command>();
		scan = new Scanner(System.in);
		initializeCommands();
	}
	
	private void initializeCommands() {
		cmd = new DirCommand();
		commands.put("dir", cmd);
		cmd = new CDCommand();
		commands.put("cd", cmd);
		cmd = new RDCommand();
		commands.put("rd", cmd);
		cmd = new CopyCommand();
		commands.put("copy", cmd);
	}
	
	public String getCommandLine(){
		return scan.nextLine();
	}
	
	private Command getCommand(String command) {
		return commands.get(command);
	}
	
	public void processCommandLine(String commandLine){
		String[] returnValue = parser.parse(commandLine);	
		String komanda = returnValue[0];
		String[] parameters = Arrays.copyOfRange(returnValue, 1, returnValue.length);
		if (komanda.equals("exit"))
			return;
		
		Command tmpCommand = getCommand(komanda);
		if (tmpCommand != null) {
			//Ovde obraditi i staviti odgovarajuce parametre
			tmpCommand.execute(parameters);
		} else {
			System.out.println("Ne postoji komanda");
		}
	}
}
