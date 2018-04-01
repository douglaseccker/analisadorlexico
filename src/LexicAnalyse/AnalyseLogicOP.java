package LexicAnalyse;

public class AnalyseLogicOP extends Analyse {
	
	public String analyse(String lexeme) {
		if (lexeme.matches("\\&{2}")) {
			return "e";
		} else if (lexeme.matches("\\|{2}")) {
			return "ou";
		} else if (lexeme.matches("\\!")) {
			return "nao";
		}
		return "false";
	}

}
