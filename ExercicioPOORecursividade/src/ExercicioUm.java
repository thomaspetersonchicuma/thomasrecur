
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * 1. Algoritmo que calcula o número de digitos binários de um número n (inteiro
positivo) ou seja converte um número inteiro positivo em um binário.
 */

/**
 *
 * @author User
 */
public class ExercicioUm {
    public static void main(String[] args) {
        ExercicioUm exercicio = new ExercicioUm();
        
       int num = 0;
       
        do{
           num = Integer.parseInt(JOptionPane.showInputDialog("Introduza o numero (INTEIRO) que deseja Converter"));
           
        }while(num < 0);
        exercicio.calculaBin(num);
        JOptionPane.showMessageDialog(null,num+"(decimal) == "+res+"(binario)");
       
       
    }
    
    static String res = "";
    public void calculaBin(int n){
        if (n != 0){
           calculaBin(n/2);
           res += ""+(n % 2);
          
            
        }
      
    }
    
    
}


 
