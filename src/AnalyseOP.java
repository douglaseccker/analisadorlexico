
public class AnalyseOP implements AnalyseToken {
	
	public AnalyseOP() {
	
	}

	@Override
	public String analyse(String lexeme) {
		if (lexeme.matches("\\=")) {
			return "igual";
		} else if (lexeme.matches("\\<")) {
			return "menor";
		} else if (lexeme.matches("\\>")) {
			return "maior";
		} else if (lexeme.matches("\\<=")) {
			return "menor_igual";
		} else if (lexeme.matches("\\>=")) {
			return "maior_igual";
		} else if (lexeme.matches("\\<>")) {
			return "maior";
		}
		return "false";
	}
	
	

}
