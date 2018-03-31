package LexicAnalyse;

public class AnalyseArithOP extends Analyse{
	
	public String analyse(String lexeme) {
		if (lexeme.matches("\\+\\+?")) {
			return "Arith_Op";
		} else if (lexeme.matches("\\-\\-?")) {
			return "Arith_Op";
		} else if (lexeme.matches("\\/")) {
			return "Arith_Op";
		} else if (lexeme.matches("\\*")) {
			return "Arith_Op";
		} else if (lexeme.matches("\\%")) {
			return "Arith_Op";
		}
		return "false";
	}
	

}
