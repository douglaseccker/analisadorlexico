package LexicAnalyse;

public class AnalyseCaracter extends Analyse {

	public String analyse(String lexeme) {
		if (lexeme.matches("\\=")) {
			return "igual";
		} else if (lexeme.matches("\\(")) {
			return "l_paren";
		} else if (lexeme.matches("\\)")) {
			return "r_paren";
		} else if (lexeme.matches("\\{")) {
			return "l_bracket";
		} else if (lexeme.matches("\\}")) {
			return "r_bracket";
		} else if (lexeme.matches("\\,")) {
			return "comma";
		} else if (lexeme.matches("\\;")) {
			return "semicolon";
		}
		return "false";
	}
}
