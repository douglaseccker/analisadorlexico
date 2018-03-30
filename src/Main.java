import LexicAnalyse.*;

public class Main {

	public static void main(String[] args) {
		// Token
		Token token = new Token("1500.0");

		//teste para reconhecer numeros int ou double 
		AnalyseNumber num = new AnalyseNumber();
		String value = num.analyse(token.getLexeme());
		System.out.println(token.getLexeme() + " " + value);
		
		//teste para reconhecer variaveis

		token.setLexeme("variavel2");
		
		AnalyseVariable var = new AnalyseVariable();
		value = var.analyse(token.getLexeme());
		System.out.println(token.getLexeme() +" "+ value);
		
		//tabela de simbolos
		SymbolTable table = new SymbolTable(10);
		
		//reconhecedor de palavras reservadas
		token.setLexeme("void");
		AnalyseReservedWord deterministic = new AnalyseReservedWord();
		value = deterministic.analyse(token.getLexeme());
		System.out.println(token.getLexeme() +" "+ value);

		//operadores logicos
		AnalyseOP op = new AnalyseOP();
		token.setLexeme("=");
		value = op.analyse(token.getLexeme());
		System.out.println(token.getLexeme() + " "+ value);
	}

}
