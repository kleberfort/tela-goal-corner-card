package com.mapa.telagoalcornercard.model;

import com.google.gson.annotations.SerializedName;

public class Partida {

    @SerializedName("descricao")
    private String description;
    @SerializedName("rodada")
    private int round;
    @SerializedName("data")
    private String date;
    @SerializedName("mandante")
    private Time homeTime;
    @SerializedName("visitante")
    private Time awayTime;
    @SerializedName("EstatisticaCartoesMandante")
    private Cartoes homeCartoes;
    @SerializedName("EstatisticaCartoesVisitante")
    private Cartoes awayCartoes;
    @SerializedName("escanteiosPrimeiroMandante")
    private PrimeiroMarcarEscanteios homeTimeEscanteios;
    @SerializedName("escanteiosPrimeiroVisitante")
    private PrimeiroMarcarEscanteios awayTimeEscanteios;
    @SerializedName("estatistiticaJogoMandante")
    private EstatisticaJogo homeEstatisticaJogo;
    @SerializedName("estatisticaJogoVisitante")
    private EstatisticaJogo awayEstatisticaJogo;

    public Cartoes getHomeCartoes() {
        return homeCartoes;
    }

    public void setHomeCartoes(Cartoes homeCartoes) {
        this.homeCartoes = homeCartoes;
    }

    public Cartoes getAwayCartoes() {
        return awayCartoes;
    }

    public void setAwayCartoes(Cartoes awayCartoes) {
        this.awayCartoes = awayCartoes;
    }

    public EstatisticaJogo getHomeEstatisticaJogo() {
        return homeEstatisticaJogo;
    }

    public void setHomeEstatisticaJogo(EstatisticaJogo homeEstatisticaJogo) {
        this.homeEstatisticaJogo = homeEstatisticaJogo;
    }

    public EstatisticaJogo getAwayEstatisticaJogo() {
        return awayEstatisticaJogo;
    }

    public void setAwayEstatisticaJogo(EstatisticaJogo awayEstatisticaJogo) {
        this.awayEstatisticaJogo = awayEstatisticaJogo;
    }

    public String getName() {
        return description;
    }

    public void setName(String name) {
        this.description = name;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Time getHomeTime() {
        return homeTime;
    }

    public void setHomeTime(Time homeTime) {
        this.homeTime = homeTime;
    }

    public Time getAwayTime() {
        return awayTime;
    }

    public void setAwayTime(Time awayTime) {
        this.awayTime = awayTime;
    }

    public PrimeiroMarcarEscanteios getHomeTimeEscanteios() {
        return homeTimeEscanteios;
    }

    public void setHomeTimeEscanteios(PrimeiroMarcarEscanteios homeTimeEscanteios) {
        this.homeTimeEscanteios = homeTimeEscanteios;
    }

    public PrimeiroMarcarEscanteios getAwayTimeEscanteios() {
        return awayTimeEscanteios;
    }

    public void setAwayTimeEscanteios(PrimeiroMarcarEscanteios awayTimeEscanteios) {
        this.awayTimeEscanteios = awayTimeEscanteios;
    }
}
