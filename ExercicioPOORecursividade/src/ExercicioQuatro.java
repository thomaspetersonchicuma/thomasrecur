/**
 *Escreva um método recursivo que determine quantas vezes um dígito K ocorre em um
número natural N. Por exemplo, o dígito 2 ocorre 3 vezes em 762021192.
 * /

/**
 *
 * @author Alfredo
 */
public class ExercicioQuatro {
    
    public static void main(String[] args){
        int k, num;
        
        k = 7;
        num = 17565480;
        
        numeroDeVezes(k,num);
        
        System.out.println("O Digito "+k+" Ocorre "+nrVezes+" vezes"+" em "+num);
        
    }
    
    static int nrVezes = 0, cont = 0;
    static String convertida;
    
    public static void numeroDeVezes(int n,int m){
        convertida = String.valueOf(m);
     
        if(cont  != convertida.length()){
            if (n == Integer.parseInt(String.valueOf(convertida.charAt(cont))))
                nrVezes++;
            
            cont++;
            numeroDeVezes(n, m);
        }
         
    }
}
