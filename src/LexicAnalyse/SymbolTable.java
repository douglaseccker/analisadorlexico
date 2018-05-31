package LexicAnalyse;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable<T> {

	private List<T> tokenTable;

	public SymbolTable() {
		this.tokenTable = new ArrayList<T>();
	}

	public void add(T token) {
        tokenTable.add(token);
    }

	public void removeToken(int index) {
		tokenTable.remove(index);
	}

	public List<T> getList() {
        return this.tokenTable;
    }
	
	public String toString() {
    	
    	String object = "+";
        for (int i = 1; i < 60; i++) {
            if (i == 15) {
                object += "|";
                continue;
            }
            object += "-";
        }
        object +="+\n";

        object += "Entrada" + " : " + "Informacoes" + "\n";

        for (int i = 0; i < tokenTable.size(); i++) {
        	object += tokenTable.get(i).toString() + "\n";
        }

        object += "+";
        for (int i = 1; i < 60; i++) {
            if (i == 15) {
            	object += "|";
                continue;
            }
            object += "-";
        }
        object += "+";
        
        return object;
    }	
}
