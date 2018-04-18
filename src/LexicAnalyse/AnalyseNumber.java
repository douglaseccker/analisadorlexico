package LexicAnalyse;

import LexicAnalyse.Contract.AnalyseContract;

public class AnalyseNumber extends AnalyseContract {
	public boolean analyse(String lexeme, String next) {
		boolean found = true;
        boolean value = lexeme.matches("\\d{0,5}");

        if (lexeme.charAt(0) == '0')
        {
            System.out.println("oi");
        }

		if (value == true) {
			this.tokenName = "reserved_word";
			this.tokenValue = "int";
		} else {
			value = lexeme.matches("\\d+\\.\\d+");

			if (value == true) {
				this.tokenName = "reserved_word";
				this.tokenValue = "double";
			} else {
				found = false;
			}
		}

		return found;
	}

}
