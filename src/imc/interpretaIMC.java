/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author H
 */
public class interpretaIMC {
    
    public static String interpretaIMC(double valorIMC){
        if (valorIMC < 18.5)
            return("baixo peso");
        else if (valorIMC < 25.0)
            return("peso adequado");
        else if (valorIMC < 30)
        return("sobrepeso");
        else return ("obesidade");
       
    }
    
}
