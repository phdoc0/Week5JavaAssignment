
public class App {

	public static void main(String[] args) {
		
		Logger asteriskLogger = new AsteriskLogger();
		
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.log("asterisk log error");
		
		asteriskLogger.error("asterisk error error");
		
		System.out.println();
		
		spacedLogger.log("spaced log error");
		
		spacedLogger.error("spaced error error");

	}

}
