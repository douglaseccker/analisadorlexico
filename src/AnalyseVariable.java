
public class AnalyseVariable implements AnalyseToken {

	public AnalyseVariable() {
		
	}

	@Override
	public String analyse(String lexeme) {
		boolean value = lexeme.matches("[A-Za-z0-9]*");
		if (value == true) {
			return "variable";
		}
		return "false";
	}

}
