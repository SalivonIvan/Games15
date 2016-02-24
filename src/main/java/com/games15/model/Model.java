package com.games15.model;

import java.util.ArrayList;

public class Model {

    private ArrayList<Boolean> cell = new ArrayList<>();
    private int foundCell = 15;

    public Model() {
        init();
    }

    final public void init() {
        for (int i = 0; i < 16; i++) {
            if (i == 15) {
                cell.add(Boolean.TRUE);
            }
            cell.add(Boolean.FALSE);
        }

    }

    public int searchIndexCellTrue() {
        foundCell = cell.indexOf(Boolean.TRUE);
        return foundCell;
    }

    public void changeOfCellTrue(int index) {
      
    }
}
