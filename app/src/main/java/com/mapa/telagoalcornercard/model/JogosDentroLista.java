package com.mapa.telagoalcornercard.model;

import com.google.gson.annotations.SerializedName;

public class JogosDentroLista {

    @SerializedName("nomeList")
    private String name;
    @SerializedName("placar")
    private int placar;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlacar() {
        return placar;
    }

    public void setPlacar(int placar) {
        this.placar = placar;
    }
}
