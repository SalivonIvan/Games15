package com.games15.model;

import java.util.ArrayList;

public class ModelCellFromEmpty {

    private ArrayList<Boolean> cells = new ArrayList<>();
    private int indexCellFromTrue = 15;

    public ModelCellFromEmpty() {
        init();
    }

    final public void init() {
        for (int i = 0; i < 16; i++) {
            if (i == 15) {
                cells.add(Boolean.TRUE);
            }
            cells.add(Boolean.FALSE);
        }

    }

    public int getIndexCellFromTrue() {
        indexCellFromTrue = cells.indexOf(Boolean.TRUE);
        return indexCellFromTrue;
    }

    public void setIndexCellFromTrue(int indexCellFromTrue) {
        this.indexCellFromTrue = indexCellFromTrue;
    }

    public void updateCells(int indexCellFromTrue) {
        cells.set(indexCellFromTrue, Boolean.TRUE);
        cells.set(this.indexCellFromTrue, Boolean.FALSE);
    }
}
