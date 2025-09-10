package org.example.model;

public class Programa {
    private int memoriaRAMAlocada;
    private int SSDOcupado;
    private int nucleos;
    private int qtdOperacoes;

    public Programa(int memoriaRAMAlocada, int SSDOcupado, int nucleos, int qtdOperacoes) {
        this.memoriaRAMAlocada = memoriaRAMAlocada;
        this.SSDOcupado = SSDOcupado;
        this.nucleos = nucleos;
        this.qtdOperacoes = qtdOperacoes;
    }

    public int getMemoriaRAMAlocada() {
        return memoriaRAMAlocada;
    }

    public void setMemoriaRAMAlocada(int memoriaRAMAlocada) {
        this.memoriaRAMAlocada = memoriaRAMAlocada;
    }

    public int getSSDOcupado() {
        return SSDOcupado;
    }

    public void setSSDOcupado(int SSDOcupado) {
        this.SSDOcupado = SSDOcupado;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public int getQtdOperacoes() {
        return qtdOperacoes;
    }

    public void setQtdOperacoes(int qtdOperacoes) {
        this.qtdOperacoes = qtdOperacoes;
    }
}
