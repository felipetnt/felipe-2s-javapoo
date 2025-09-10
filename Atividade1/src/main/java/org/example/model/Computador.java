package org.example.model;

public class Computador {
    private int memoriaRAMA;
    private int SSD;
    private int nucleos;
    private int operacoesPorSegundo;

    public Computador(int memoriaRAMA, int SSD, int nucleos, int operacoesPorSegundo) {
        this.memoriaRAMA = memoriaRAMA;
        this.SSD = SSD;
        this.nucleos = nucleos;
        this.operacoesPorSegundo = operacoesPorSegundo;
    }

    public int getMemoriaRAMA() {
        return memoriaRAMA;
    }

    public void setMemoriaRAMA(int memoriaRAMA) {
        this.memoriaRAMA = memoriaRAMA;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public int getOperacoesPorSegundo() {
        return operacoesPorSegundo;
    }

    public void setOperacoesPorSegundo(int operacoesPorSegundo) {
        this.operacoesPorSegundo = operacoesPorSegundo;
    }
}
