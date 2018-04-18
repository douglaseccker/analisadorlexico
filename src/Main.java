import java.io.IOException;
import java.util.Iterator;

import LexicAnalyse.*;
import LexicAnalyse.Contract.AnalyseContract;

public class Main {

	public static void main(String[] args) {
        final String path = "code.txt";

        String content = "";

		try {
            content = new FileHandler().read(path);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        AnalyseList<AnalyseContract> list = new AnalyseList<AnalyseContract>();
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
        list.add(deterministic);
        list.add(var);
        list.add(relational);
        list.add(arith);
        list.add(logic);
        list.add(string);
        list.add(ignored);
        list.add(caracter);

        content = ignored.removeComments(content);

        String lines[] = content.split("\\r?\\n");

        for (int j = 0; j < lines.length; j++) {
            lines[j] = addCaracter.addCaracter(lines[j]);
            //System.out.println(lines[j]);
        }

        TokenList<Token> tokens = new TokenList<Token>();

        for (int lineIdx = 0, columnIdx = 0; lineIdx < lines.length; lineIdx++, columnIdx = 0) {
            String[] line = lines[lineIdx].split("(\\$)");

            for (String column : line) {
                if (column.isEmpty()) continue;

                Token token = new Token(column);
                token.setLine(lineIdx);
                token.setLineFile(String.join(" ", line));

                Iterator<AnalyseContract> it = list.getList().iterator();

                while (it.hasNext()) {
                    AnalyseContract analyser = it.next();

                    try {
                        if (analyser.analyse(token.getLexeme(), line[(columnIdx + 1)])) {
                            token.setPattern(analyser.tokenValue);
                            token.setColum(columnIdx);
                            token.setName(analyser.tokenName);
                            token.setValue(analyser.tokenValue);

                            tokens.add(token);

                            //analyser.log();

                            break; // para no primeiro reconhecer só
                        }
                    } catch (Exception e) {
                    }
                }

                columnIdx++;
            }
        }

        System.out.print("+");
        for (int i = 1; i < 60; i++) {
            if (i == 15) {
                System.out.print("|");
                continue;
            }

            System.out.print("-");
        }
        System.out.println("+");

        System.out.format("|%10s%4s|%30s%14s|\n", "Entrada", "", "Informacoes", "");

        int idx = 1;

        for (Token token : tokens.getList()) {
            String ss = String.format(
                "%s - %s - %s:%s | %s",
                token.getLexeme(), token.getName(), token.getLine(), token.getColum(), token.getLineFile()
            );

            System.out.format(
                "|%7s%7s|%2s%42s|\n",
                idx, "", "", ss
            );

            idx++;
        }

        System.out.print("+");
        for (int i = 1; i < 60; i++) {
            if (i == 15) {
                System.out.print("|");
                continue;
            }

            System.out.print("-");
        }
        System.out.println("+");
	}
}
