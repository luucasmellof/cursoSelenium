package cursoSelenium;

import org.junit.Test;

public class StudioTest {
	public void studioOpen(String pathStudio) {
		try {
		// Command to create an external process
	    String command = pathStudio;
	    // Running the above command
	    Runtime run  = Runtime.getRuntime();
	    Process p = run.exec(command);
	    p.waitFor();
	    p.
		}
		catch(Exception e){
			System.err.println("Erro:" + e.getMessage());
		}
	}
	@Test
	public void abrir() {
		studioOpen("C:\\Users\\Lucas\\AppData\\Local\\Programs\\RobotEasy Studio\\RobotEasy Studio.exe");
	}
}
