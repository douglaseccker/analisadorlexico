package LexicAnalyse;

import LexicAnalyse.Contract.AnalyseContract;

public class AnalyseArithOP extends AnalyseContract {

	public boolean analyse(String lexeme) {
		boolean found = true;

		if (lexeme.matches("\\+\\+?")) {
			this.tokenName = "Arith_Op";
			this.tokenValue = "++";
		} else if (lexeme.matches("\\-\\-?")) {
			this.tokenName = "Arith_Op";
			this.tokenValue = "--";
		} else if (lexeme.matches("\\/")) {
			this.tokenName = "Arith_Op";
			this.tokenValue = "/";
		} else if (lexeme.matches("\\*")) {
			this.tokenName = "Arith_Op";
			this.tokenValue = "*";
		} else if (lexeme.matches("\\%")) {
			this.tokenName = "Arith_Op";
			this.tokenValue = "%";
		} else {
			found = false;
		}

		return found;
	}

}
