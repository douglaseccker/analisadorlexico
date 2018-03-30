

public class AnalyseNumber implements AnalyseToken {


	public AnalyseNumber() {
		
	}

	@Override
	public String analyse(String lexeme) {
		boolean value = lexeme.matches("\\d{0,5}");
		if (value == true) {
			return "int";
		} else {
			value = lexeme.matches("\\d+\\.\\d+");
			if (value == true) {
				return "double";
			}
		}
		return "false";
	}

}
