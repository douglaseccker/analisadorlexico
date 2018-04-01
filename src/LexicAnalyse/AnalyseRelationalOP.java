package LexicAnalyse;

import LexicAnalyse.Contract.AnalyseContract;

public class AnalyseRelationalOP extends AnalyseContract {

	public boolean analyse(String lexeme) {
		boolean found = true;

		if (lexeme.matches("\\==")) {
			this.tokenName = "igual";
		} else if (lexeme.matches("\\<")) {
			this.tokenName = "menor";
		} else if (lexeme.matches("\\>")) {
			this.tokenName = "maior";
		} else if (lexeme.matches("\\<=")) {
			this.tokenName = "menor_igual";
		} else if (lexeme.matches("\\>=")) {
			this.tokenName = "maior_igual";
		} else if (lexeme.matches("\\!=")) {
			this.tokenName = "diferente";
		} else {
			found = false;
		}

		return found;
	}

}
