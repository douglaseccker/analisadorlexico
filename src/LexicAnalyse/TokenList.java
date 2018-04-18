package LexicAnalyse;

import java.util.ArrayList;
import java.util.List;

public class TokenList<Token> {
    private List<Token> list = new ArrayList<Token>();

    public void add(Token token) {
        list.add(token);
    }

    public List<Token> getList()
    {
        return this.list;
    }
}
