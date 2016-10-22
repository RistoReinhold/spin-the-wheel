package com.reinhold;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ristor on 18.10.2016.
 */
public class Results {
    private List<Result> list;

    public Results() {
        list = new ArrayList<Result>();
    }

    public void addResult(Result r){
        list.add(r);
    }

    public Iterator resultsIter(){
        return list.iterator();
    }
}
