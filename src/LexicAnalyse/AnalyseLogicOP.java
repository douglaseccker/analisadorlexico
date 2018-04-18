package LexicAnalyse;

import LexicAnalyse.Contract.AnalyseContract;

public class AnalyseLogicOP extends AnalyseContract {

	public boolean analyse(String lexeme, String next) {
		boolean found = true;

		if (lexeme.matches("\\&{2}")) {
			this.tokenName = "e";
		} else if (lexeme.matches("\\|{2}")) {
			this.tokenName = "ou";
		} else if (lexeme.matches("\\!")) {
			this.tokenName = "nao";
		} else {
			found = false;
		}

		return found;
	}

}
