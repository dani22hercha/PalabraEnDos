package palabraendos;

import java.util.Scanner;

public class PalabraEnDos {
    static Scanner texto = new Scanner (System.in);

    public static void main(String[] args) {
        String n1, n2, m;        
        
        System.out.println("Ingrese la primera palabra:");
        n1= texto.next().toLowerCase();
        
        System.out.println("Ingrese la segunda palabra:");
        n2= texto.next().toLowerCase();
        
        System.out.println("Ingrese la palabra intermedia");
        m= texto.next().toLowerCase();
        
        //Se extrae la primera letra de la 1ra palabra
        char c1 = n1.charAt(0);        
        
        //Se extrae la primera letra de la 2ra palabra
        char c2 = n2.charAt(0);
        
        //Se extrae la primera letra de la intermedia palabra
        char b = m.charAt(0);
        
        System.out.println(c1+"   "+c2+"   "+b);

        System.out.println((int)c1+"   "+(int)c2+"   "+(int)b);
        
        if(b>c1&&b<c2){
            System.out.println(n1+"-->"+m+"<--"+n2);
        }
        
    }
    
}
