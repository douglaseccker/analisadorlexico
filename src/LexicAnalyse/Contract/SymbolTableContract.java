package LexicAnalyse.Contract;

import LexicAnalyse.Token;

public interface SymbolTableContract {

	public boolean addToken(Token token);
	public boolean removeToken(int index);
	public Token getToken(int index);
}
