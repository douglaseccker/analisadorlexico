import LexicAnalyse.Token;

public interface SymbolTableInterface {

	public boolean addToken(Token token);
	public boolean removeToken(int index);
	public Token getToken(int index);
}
