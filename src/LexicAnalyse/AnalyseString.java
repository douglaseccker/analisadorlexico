package LexicAnalyse;

import LexicAnalyse.Contract.AnalyseContract;

public class AnalyseString extends AnalyseContract {

	public boolean analyse(String lexeme) {
		boolean found = true;

		if (lexeme.matches("(\".*\")")) {
			this.tokenName = "string";
		} else {
			found = false;
		}

		return found;
	}
}
