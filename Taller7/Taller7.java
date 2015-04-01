/**
 * 
 * Nombre: Ricardo Gottheil Flórez
 * Código: 201510001010
 * 
 */
import java.util.Scanner;
public class Taller7
{
    // Punto 1.  
    public void factorial(int n){     
        int f = 1;
        int i=0;
        while(n != 0){
            f*=n;
            n--;
            i++;
        }
        System.out.println("El factorial de "+i+" es "+f);
    }
    
    public void potencia(int base, int n){
       int r = (int) Math.pow(base,n);
        System.out.println(base+" elevado a la "+n+" es "+r+".");
    }
    
    // public double sen(double x, int n){     --- TODAVÍA ERRORES ---
    //    double acum=0;
    //    for (int i=0;i<n;i++){
    //        acum += Math.pow(x,2*i+1)*Math.pow(-i,1)/(factorial(2*i+1));
    //    }
    //    return acum;
    //}
    
    // Punto 8.
    public String sinEspacios(String s){
        String cadenaSinEspacios = "";
        for (int i=0;i<s.length();i++)
            if (Character.isWhitespace(s.charAt(i)))
                cadenaSinEspacios += s.charAt(i);
        return cadenaSinEspacios;
    }    
}
