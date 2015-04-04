/**
 * 
 * Nombre: Ricardo Gottheil Flórez
 * Código: 201510001010
 * 
 */
import java.util.Scanner;
import java.util.StringTokenizer;
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
    //Método para quitar los espacios de un texto.
    public String sinEspacios(String e){
        String esp="";
        char letra;
        for (int i=0;i<e.length();i++){
            letra=e.charAt(i);
            if(!Character.isWhitespace(letra)){
                esp=esp+letra;
            }
        }
        return esp;
    }
    public void textoSinEspacios(){
        Scanner hj = new Scanner(System.in);
        String texto;
        System.out.println("Ingrese un texto: ");
        texto = sinEspacios(hj.nextLine());
        System.out.println("La cadena sin espacios es: "+texto);
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
    public void llamandoMayMin(){
        Scanner sc = new Scanner(System.in);
        String texto;
        System.out.print("Ingrese una texto: ");
        texto = sc.nextLine();
        
        // Mensaje para mostrar el resultado.
        System.out.println("El número de mayusculas del texto es: "+Mayusculas(texto));
        System.out.println("El número de minusculas del texto es: "+Minusculas(texto));
        
    }
    
    //Punto 5.
    //Método para encontrar el numero de veces que se encuentra un caracter en un texto.
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
        System.out.println("El número de veces que se repite la "+letra+" es "+numLetra(texto,letra));
    }
    
    //Punto 6.
    //Método para detectar si el texto es palindrome.
    public boolean palindrome(String p){
        for (int i=0,j=p.length()-1;i<p.length()/2;i++,j--){
            if (p.charAt(i) != p.charAt(j)){
                return false;
            }
        }
         return true;   
    }
    public void textoPalindrome(){
        Scanner sc = new Scanner(System.in);
        String texto;
        System.out.println("Ingrese una oración: ");
        texto = sc.nextLine();
        if (palindrome(texto)){
            System.out.println("La oración es palindrome.");
        }else {
            System.out.println("La oración no es palindrome.");
        }
    }
    
    //Punto 7.
    //Método para reemplazar una letra de minuscula a mayuscula. 
    public String colocarMayusculas(String t,char min, char may){
        return t.replace(min,may);
    }
    public void replaceVariable(){
        Scanner fg = new Scanner(System.in);
        String texto;
        char letra;
        System.out.println("Ingrese un texto: ");
        texto = fg.nextLine();
        do {
            System.out.println("Ingrese una letra: ");
            letra = fg.next().charAt(0);
        }while(!Character.isLetter(letra));
        texto = colocarMayusculas(texto, Character.toLowerCase(letra),Character.toUpperCase(letra));
        System.out.println("El texto modificado es: "+texto);
    }
    
    //Punto 9.
    public void numPalabras(){
        Scanner kl= new Scanner(System.in);
        String texto;
        System.out.println("Introduce un texto: ");
        texto = kl.nextLine();
        StringTokenizer st = new StringTokenizer(texto);
        if(st.countTokens()==1){
             System.out.println("En el texto hay una palabra.");
        }else {
            System.out.println("En el texto hay "+st.countTokens()+" palabras.");
        } 
    }
    
    //Punto 10.
    public boolean isNumeric(String s){
        return s.matches("[-+]?\\d*\\.?\\d+");
    }
    public void numTelefono(){
        Scanner yu = new Scanner(System.in);
        String tel;
        System.out.println("Ingresa un número de telefono de 10 dígitos [Sin Espacios ni Guiones]: ");
        tel = yu.nextLine();
        if (!isNumeric(tel)){
            System.out.println("Esto no es un numero de telefono.");
        }else{
            if (tel.length() > 9 || tel.length() < 9)
                System.out.println("No es un número de 10 digitos.");
            else 
                System.out.println("("+tel.substring(0,2)+")-"+tel.substring(2,3)+"-"+tel.substring(3,10));
        }         
    }
    
    //Punto 3.
    public void a(){
        int b = 3;
        c(b);
        System.out.println(b);
    }
    public void c(int b){
        b=5;
    }
    
    //Punto 2.
    public void intercambiar(int n){
        int[] arr= new int[n];
        int x,b,j;
        int t=n;
        for(int c=0;c<n;c++){
            x=(int)(Math.random()*100)+1;
            arr[c]=x;
        }
        n=n-1;
        for(int i=1;i<=n;i++){
            for(j=0;j<=n-1;j++){
                if(arr[j]>arr[j+1]){
                   b=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=b;
                }
            }
            System.out.println (arr[t-i]);
            if (i==n){
                System.out.println (arr[0]);
            }
        }
    }
}
