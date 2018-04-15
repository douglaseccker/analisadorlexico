import java.io.IOException;
import java.util.Iterator;

import LexicAnalyse.*;
import LexicAnalyse.Contract.AnalyseContract;

public class Main {

	public static void main(String[] args) {
		try {
			FileHandler fh = new FileHandler();

			String path = "code.txt";

			String content;

			content = fh.read(path);

			AnalyseList list = new AnalyseList();
			//numeros
			AnalyseNumber num = new AnalyseNumber();
			//variaveis
			AnalyseVariable var = new AnalyseVariable();
			//palavras reservadas
			AnalyseReservedWord deterministic = new AnalyseReservedWord();
			//operadores relacionais
			AnalyseRelationalOP relational = new AnalyseRelationalOP();
			//operadores aritmeticos
			AnalyseArithOP arith = new AnalyseArithOP();
			//operadores logicos
			AnalyseLogicOP logic = new AnalyseLogicOP();
			//strings
			AnalyseString string = new AnalyseString();
			//comentários
			AnalyseIgnored ignored = new AnalyseIgnored();
			//demais caracteres
			AnalyseCaracter caracter = new AnalyseCaracter();
			//adiciona caracter
			PlusCaractere addCaracter = new PlusCaractere();

			list.add(num);
			list.add(var);
			list.add(deterministic);
			list.add(relational);
			list.add(arith);
			list.add(logic);
			list.add(string);
			list.add(ignored);
			list.add(caracter);

			content = ignored.removeComments(content);
			
			String lines[] = content.split("\\r?\\n");
			
			for (int j =0; j < lines.length; j++) {
				lines[j] = addCaracter.addCaracter(lines[j]);
				//System.out.println(lines[j]);
			}			

			for	(int i = 0; i < lines.length; i++)
			{
				//String[] line = lines[i].trim().split("( )|(?<=\\()|(?=\\()|(?<=\\))|(?=\\))|(?<=;)|(?=;)|(?<=,)|(?=,)|(?<=\\{)|(?=\\})|(?<=\\*)|(?=\\*)");
				String[] line = lines[i].split("(\\$)");
				for(String s : line) {
					Token token = new Token(s);
	
					Iterator iter = list.getList().iterator();
	
					while (iter.hasNext()) {
						AnalyseContract next = (AnalyseContract) iter.next();
	
						try {
							if (next.analyse(token.getLexeme())) {
								next.log();
								//System.out.print(lines[i].trim());
							}
						} catch (Exception e) {
							//TODO: handle exception
						}
					}
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
