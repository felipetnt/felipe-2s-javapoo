package org.example.App;

import org.example.model.Computador;
import org.example.model.Programa;
import org.example.model.SistemaOperacional;

public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador(16, 250, 2, 1700);
        System.out.println("\n------------------------------------------\n");
        SistemaOperacional sistemaOperacional = new SistemaOperacional(pc);
        Programa p = new Programa(7, 78, 1, 1000); // Compilacao com sucesso
        boolean b = sistemaOperacional.executarPrograma(p);
        System.out.println("\n------------------------------------------\n");
        Programa p2 = new Programa(10, 300, 2, 1500); // ERRO POR EXCESSO DE SSD
        boolean b2 = sistemaOperacional.executarPrograma(p2);
        System.out.println("\n------------------------------------------\n");
        Programa p3 = new Programa(24, 200, 2, 1900); // ERRO POR EXCESSO DE RAM
        boolean b3 = sistemaOperacional.executarPrograma(p3);
        System.out.println("\n------------------------------------------\n");
        Programa p4 = null; // ERRO POR PROGRAMA NULO
        boolean b4 = sistemaOperacional.executarPrograma(p4);
        System.out.println("\n------------------------------------------\n");

        System.out.println("Resultado 1: " + b);
        System.out.println("Resultado 2: " + b2);
        System.out.println("Resultado 3: " + b3);
        System.out.println("Resultado 4: " + b4);


    }
}