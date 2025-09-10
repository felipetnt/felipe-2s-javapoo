package org.example.model;

public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }

    public boolean executarPrograma(Programa p){

        if(p == null){
            System.out.println("Programa nulo...");
            System.out.println("ERRO na execucao do programa...");
            return false;
        }

        if(p.getSSDOcupado() > computador.getSSD()){
            System.out.println("SSD ocupado maior que SSD permitido na maquina...");
            System.out.println("ERRO na execucao do programa...");
            return false;
        }

        if(p.getMemoriaRAMAlocada() > computador.getMemoriaRAMA()){
            System.out.println("memoria RAM alocada maior que RAM permitido na maquina...");
            System.out.println("ERRO na execucao do programa...");
            return false;
        }

        System.out.println("Memoria alocada: " + p.getMemoriaRAMAlocada());
        System.out.println("SSD ocupado: " + p.getSSDOcupado());
        System.out.println("Quantidade nucleos: " + p.getNucleos());
        System.out.println("Quantidade de operacoes: " + p.getQtdOperacoes());

        int tempoExecucao = computador.getOperacoesPorSegundo() * computador.getNucleos();
        System.out.println("O tempo de execucao eh: " + tempoExecucao);
        System.out.println("Programa finalizado com sucesso...");
        return true;
    }
}
