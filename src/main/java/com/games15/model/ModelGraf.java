package com.games15.model;

import java.util.ArrayList;

public class ModelGraf {

    ArrayList<Integer> graf = new ArrayList<>();

    public ModelGraf() {
        init();
    }

    final public void init() {
        for (int i = 0; i < 16; i++) {

            graf.add(i + 1);

        }

    }
    public int getIndex(int numberButton){
        return graf.indexOf(numberButton);
    }
    public void updateGraf(){
        
    }
}
