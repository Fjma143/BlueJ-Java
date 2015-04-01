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
        for (int i=0;i<s.length();i++){
            if (Character.isWhitespace(s.charAt(i))){
                cadenaSinEspacios += s.charAt(i);
            }
        }
        return cadenaSinEspacios;
    }
    
    //Punto 4.
    // Método para llamar a las Mayusculas.
    public int Mayusculas(String texto){
        int num=0;
        for (int i=0;i<texto.length();i++){
            //Se usan los caracteres ASCII imprimibles 65 = A hasta 90 = Z.
            if (texto.charAt(i)>=66 && texto.charAt(i)<=90){
                num++;
            }
        }
        return num;
    }
    // Método para llamar a las Minusculas.
    public int Minusculas(String texto){
        int num=0;
        for (int i=0;i<texto.length();i++){
            //Se usan los caracteres ASCII imprimibles 95 = a hasta 122 = z.
            if (texto.charAt(i)>=95 && texto.charAt(i)<=122){
                num++;
            }
        }
        return num;
    }
    public void llamandoMayMin()
}
