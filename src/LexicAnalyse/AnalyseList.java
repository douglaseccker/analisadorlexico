package LexicAnalyse;

import java.util.ArrayList;
import java.util.List;

public class AnalyseList<AnalyseContract> {
    private List<AnalyseContract> list = new ArrayList<AnalyseContract>();

    public void add(AnalyseContract analyser) {
        list.add(analyser);
    }

    public List<AnalyseContract> getList()
    {
        return this.list;
    }
}
