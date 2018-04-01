package LexicAnalyse;

public class AnalyseString extends Analyse {

	public String analyse(String lexeme) {
		if (lexeme.matches("(\".*\")")) {
			return "string";
		} 

		return "false";
	}
}
