
public class SpacedLogger implements Logger {

	@Override
	public void log(String str) {
		
		StringBuilder log = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			log.append(str.charAt(i) + " ");
		}
		
		System.out.println(log);
		
	}

	@Override
	public void error(String str) {
		System.out.print("Error: ");
		log(str);
	}

}
