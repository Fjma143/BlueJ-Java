/**
 * 
 * Nombre: Ricardo Gottheil Flórez
 * Código: 201510001010
 * 
 */
import java.util.Scanner;
public class Taller7
{
    public void factorial(int n){    // Punto 1   --- SIN TERMINAR ---
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
}
