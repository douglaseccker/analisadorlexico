package LexicAnalyse;

public class AnalyseIgnored extends Analyse {

	public String analyse(String lexeme) {
		if (lexeme.matches("//.*$")) {
			return "comment";
		} else if (lexeme.matches("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)")) {
			return "comment";
		}
		return "false";
	}
}
