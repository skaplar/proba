import java.io.File;


public class DirCommand extends Command {

	@Override
	public void execute(String[] params) {
		System.out.println("Dir komanda izvrsena");
//		try{
//			File f = new File(".");
//			File[] list = f.listFiles();
//			
//			for(int i=0; i < list.length; i++)
//				if(list[i].isDirectory())
//					System.out.println("<" + list[i].getName() + ">");
//				else
//					System.out.println(list[i].getName());
//		} catch(Exception ex){
//			ex.printStackTrace();
//		}
	}

}
