
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Escreva um método recursivo que dado um número n, gere todas as possíveis
combinações com as n primeiras letras do alfabeto. Ex.: n = 3. Resposta: ABC, ACB,
BAC, BCA, CAB, CBA.
 */

/**
 *
 * @author User
 */
public class ExercicioCincoDois {
    
    public static void main(String[] args){
        ExercicioCincoDois  exercicioCinco = new ExercicioCincoDois();
        int n= 2;
        ArrayList<Character> array = new ArrayList<>();
        String alfabeto = "ABCDEFGHIJKLMNOPKRSTUVWXYZ";
        String aux = "";
  
        for(int i = 0 ; i<n ; i++){
            aux += alfabeto.charAt(i);
            array.add(alfabeto.charAt(i));
            
        }
            
        
        
        auxiliar = aux;
     
        //exercicioCinco.sequencia(array);
        exercicioCinco.seq(n);
            
         
        
    }
    
    int cont1,cont2;
    String aux = "";
    public void seq(int n){
       
        String alfabeto = "ABCDEFGHIJKLMNOPKRSTUVWXYZ";
        char car =  alfabeto.charAt(cont1);
        if (n >= 0){
            System.out.print(alfabeto.charAt(n));
            aux+= alfabeto.charAt(n);
            seq(n-1);
           
        }
       
        
        
    }
    
    static String auxiliar;
    boolean passou = false;
//    public void sequencia(ArrayList<Character> caracteres){ 
//        char troca;
//        String alf="";
//        for(int i = 0; i<caracteres.size();i++)
//            alf += String.valueOf(caracteres.get(i));
//        
//        if (passou == true && alf.equals(auxiliar))
//            System.exit(0);
//    
//        if (cont != caracteres.size()){
//            System.out.println(alf);
//            
//            troca  = caracteres.get(cont);
//            caracteres.set(cont, caracteres.get(cont+1));
//            caracteres.set(cont+1, troca);
//            cont++;
//                    
//            if(cont == caracteres.size()-1)
//                cont = 0;
//            
//            passou = true;
//            sequencia(caracteres);  
//        }
//       
//           
//    }
    
}
