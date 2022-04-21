/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import static imc.interpretaIMC.interpretaIMC;
import java.util.Scanner;

/**
 *
 * @author H
 */
public class Imc {
    
    public static void main(String[] args) {
        
        double peso, alt, valorImc;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o peso corporal (em kg):\n");
        peso = ler.nextDouble();
        System.out.printf("\nInforme a altura(em metros ex: 1,77):\n");
        alt = ler.nextDouble();
        valorImc = IMC(peso, alt);
        
        System.out.printf("\nResultados...:\n");
        System.out.printf("IMC..............: %.13f\n", valorImc);
        System.out.printf("Classificação: %s\n", interpretaIMC(valorImc));
    }

    private static double IMC(double peso, double alt) {
        return(peso / (alt*alt));
    }
    
    
}
