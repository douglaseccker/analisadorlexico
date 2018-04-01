package LexicAnalyse;

import LexicAnalyse.Contract.AnalyseContract;

public class Analyse implements AnalyseContract {
	public String analyse(String lexeme) {
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
		System.out.println(token.getLexeme() + " " + value);
		
		//tabela de simbolos
		SymbolTable table = new SymbolTable(10);
		table.addToken(token);
		
		//reconhecedor de palavras reservadas
		token.setLexeme("if");
		
		AnalyseReservedWord deterministic = new AnalyseReservedWord();
		value = deterministic.analyse(token.getLexeme());
		System.out.println(token.getLexeme() +" " + value);

		//operadores relacionais
		AnalyseRelationalOP relational = new AnalyseRelationalOP();
		token.setLexeme("=");
		value = relational.analyse(token.getLexeme());
		System.out.println(token.getLexeme() + " " + value);
		
		//operadores aritmeticos
		AnalyseArithOP arith = new AnalyseArithOP();
		token.setLexeme("++");
		value = arith.analyse(token.getLexeme());
		System.out.println(token.getLexeme() + " " + value);
		
		//operadores logicos
		AnalyseLogicOP logic = new AnalyseLogicOP();
		token.setLexeme("||");
		value = logic.analyse(token.getLexeme());
		System.out.println(token.getLexeme() + " " + value);
		
		//strings
		AnalyseString string = new AnalyseString();
		token.setLexeme("\"string\"");
		value = string.analyse(token.getLexeme());
		System.out.println(token.getLexeme() + " " + value);
		
		//comentários
		AnalyseIgnored ignored = new AnalyseIgnored();
		token.setLexeme("//comentario");
		value = ignored.analyse(token.getLexeme());
		System.out.println(token.getLexeme() + " " + value);
		
		//comentários
		token.setLexeme("/* comentario \n mais comentario*/");
		value = ignored.analyse(token.getLexeme());
		System.out.println(token.getLexeme() + " " + value);
		
		//demais caracteres
		AnalyseCaracter caracter = new AnalyseCaracter();
		token.setLexeme("=");
		value = caracter.analyse(token.getLexeme());
		System.out.println(token.getLexeme() + " " + value);
		
		return "";
	}
}
