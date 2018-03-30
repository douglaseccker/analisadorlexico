import LexicAnalyse.Token;

public class SymbolTable implements SymbolTableInterface {

	private Token[] tokenTable;
	private int count;

	public SymbolTable(int size) {
		this.tokenTable = new Token[size];
		this.count = 0;
	}

	@Override
	public boolean addToken(Token token) {
		if (count <tokenTable.length) {
			tokenTable[count] = token;
			count++;
			return true;
		}
		return false;
	}

	@Override
	public boolean removeToken(int index) {
		if (tokenTable != null) {
			tokenTable[index] = null;
			return true;
		} 
		return false;
	}

	@Override
	public Token getToken(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
	
}
