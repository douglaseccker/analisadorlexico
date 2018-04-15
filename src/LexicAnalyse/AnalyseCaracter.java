package LexicAnalyse;

import LexicAnalyse.Contract.AnalyseContract;

public class AnalyseCaracter extends AnalyseContract {

	public boolean analyse(String lexeme, String next) {
		boolean found = true;

		this.tokenValue = lexeme;
		if (lexeme.matches("\\=")) {
			this.tokenName = "igual";
		} else if (lexeme.matches("\\(")) {
			this.tokenName = "l_paren";
		} else if (lexeme.matches("\\)")) {
			this.tokenName = "r_paren";
		} else if (lexeme.matches("\\{")) {
			this.tokenName = "l_bracket";
		} else if (lexeme.matches("\\}")) {
			this.tokenName = "r_bracket";
		} else if (lexeme.matches("\\,")) {
			this.tokenName = "comma";
		} else if (lexeme.matches("\\;")) {
			this.tokenName = "semicolon";
		} else {
			found = false;
		}

		return found;
	}
}
