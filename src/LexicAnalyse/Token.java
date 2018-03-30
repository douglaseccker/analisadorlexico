package LexicAnalyse;

import java.util.regex.Pattern;

public class Token {

		private String lexeme;
		private String pattern;
		private int line;
		private int colum;

		public Token(String lexeme) {
			super();
			this.lexeme = lexeme;
		}

		public String getLexeme() {
			return lexeme;
		}

		public void setLexeme(String lexeme) {
			this.lexeme = lexeme;
		}

		public String getPattern() {
			return pattern;
		}

		public void setPattern(String pattern) {
			this.pattern = pattern;
		}

		public int getLine() {
			return line;
		}

		public void setLine(int line) {
			this.line = line;
		}

		public int getColum() {
			return colum;
		}

		public void setColum(int colum) {
			this.colum = colum;
		}

		
		
}
