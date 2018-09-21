
import javax.swing.JOptionPane;

/*
  
Faça um programa (utilizando recursividade) que peça para o utilizador digitar um
número, em seguida, faça a soma de todos os algarismos do número. Exemplos:
1111 = 1+1+1+1 = 4 2090 = 2+0+9+0 = 11.

 */

/**
 *
 * @author User
 */
public class ExercicioTres {
    public static void main(String[] args) {
        ExercicioTres exercicio = new ExercicioTres();
        
        String num;
       
        do{
           num = (JOptionPane.showInputDialog("Introduza o numero (INTEIRO) para Somar digitos: "));
           
        }while(Integer.parseInt(num) < 0);
        
       JOptionPane.showMessageDialog(null,"Numero: "+num+" | Soma == "+exercicio.calculaSoma(num));
       
       
    }
    
    int cont =0, sum;
    public int calculaSoma(String n){
        
        if (cont == n.length())
        return 0;
        
        
        sum = Integer.parseInt(String.valueOf(n.charAt(cont)));
        cont++;
        return sum + calculaSoma(n);
        
        
      
        
    }
}
