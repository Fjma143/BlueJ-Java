/**
 * 
 * Nombre: Ricardo Gottheil Fl�rez
 * C�digo: 201510001010
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
    
    // public double sen(double x, int n){     --- TODAV�A ERRORES ---
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
    // M�todo para llamar a las Mayusculas.
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
    // M�todo para llamar a las Minusculas.
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
    public void llamandoMayMin(){
        Scanner sc = new Scanner(System.in);
        String texto;
        System.out.print("Ingrese una texto: ");
        texto = sc.nextLine();
        
        // Mensaje para mostrar el resultado.
        System.out.println("El n�mero de mayusculas del texto es: "+Mayusculas(texto));
        System.out.println("El n�mero de minusculas del texto es: "+Minusculas(texto));
        
    }
    
    //Punto 5.
    //M�todo para encontrar el numero de veces que se encuentra un caracter en un texto.
    public int numLetra(String cadena, char letra){
        int v = 0;
        int s = -1;
        while ((s=cadena.indexOf(letra,s+1))>-1){
            v++;
        }
        return v;
    } 
    
    public void repeticionesLetra(){
        Scanner x= new Scanner(System.in);
        String texto;
        char letra;
        System.out.println("Ingrese un texto: ");
        texto = x.nextLine();
        System.out.println("Ingrese una letra: ");
        letra = x.next().charAt(0);
        System.out.println("El n�mero de veces que se repite la "+letra+" es "+numLetra(texto,letra));
    }
}
