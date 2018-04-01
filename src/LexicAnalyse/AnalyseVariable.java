package LexicAnalyse;

import LexicAnalyse.Contract.AnalyseContract;

public class AnalyseVariable extends AnalyseContract {

	public boolean analyse(String lexeme) {
		boolean value = lexeme.matches("^[A-Za-z]+[A-Za-z\\d]*");

		if (value == true) {
			this.tokenName = "variable";

			return true;
		}

		return false;
	}
}
