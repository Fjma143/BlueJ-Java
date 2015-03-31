/**
 * Alumno: Ricardo Gottheil Flórez
 * 
 * Código: 201510001010
 */
import java.util.Scanner; // Se importó esta librería o paquete para poder leer datos con el teclado.

public class Taller6 
{
    public void SumAnidada(int n, int m) {  //3. Taller 3: punto 1c
        double b=0, j, x=0;
        int i;
        for (i=1;i<=m;i++) {
    for (j=1;j<=n;j++) {
        b=i+j+b;
        j=j+1;
    }
    x=i+b+x;
    i=i+1;
        }
        System.out.println(x);
    }
    
    public void  unoC () { //5. Taller 4: punto 1c
        int arr[];
        int i,j,k;
        boolean noEsPrimo;
        arr = new int[25];
        k = 0;
        for (i=2;i<=100;i++) {
            j = 0;
            noEsPrimo = false;
            while (!noEsPrimo && j<k && arr[j]<=Math.sqrt(i)) {
                noEsPrimo = i%arr[j]==0 || noEsPrimo;
                j = j+1;
            }
            if (!noEsPrimo) {
                arr[k] = i;
                System.out.println(arr[k]);
                k = k+1;
            }
        }    
    }
    
    public void lenguajeMarciano(){  // 7. Taller 4: punto 3
        char arr[] = new char[5];
        int j,i,k;
        arr[0]='g';
        arr[1]='a';
        arr[2]='t';
        arr[3]='o';
        arr[4]='s';
        
        for (i=0;i<=4;i++){
            for(j=0;j<=4;j++){
                for(k=0;k<=4;k++){
                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                }
            }
        }    
    }
    
    public void tableroAjedrez(){    // 10. Taller 5: punto 10
        Scanner sc = new Scanner(System.in);
        int i,t,x,u,j;
        int matriz[][] = new int[8][8];
        int a[]= new int[8];
        int b[]= new int[8];
        int c[]= new int[8];
        x=0;
        u=0;
        t=0;
        for(i=0;i<=7;i++){
            int n;
            System.out.print("Introduzca un número n entero: ");
            n = sc.nextInt();
            int m;
            System.out.print("Introduzca un número m entero: ");
            m = sc.nextInt();
            b[i]=7-m;
            c[i]=m;
            a[i]=n;
            if (c[i]==c[i] || a[i]==a[i]){
                if (x==0){
                    matriz[m][n]=1;
                    u=1;
                    x=1;
                } else {
                    for (j=0;j<=x-2;j++){
                        if (c[j]==c[i] || a[j]==a[i]){
                            matriz[m][n]=0;
                            u=0;
                        }else {
                            if (b[j]==b[i]){
                                matriz[m][n]=0;
                                u=0;
                            } else {
                                matriz[m][n]=1;
                                u=1;
                            }
                        }
                    }
                    x++;
                }
            }else {
                matriz[m][n]=0;
                u=0;
            }
            if (i==1){
                if (c[0]==b[i]){
                    matriz[m][n]=0;
                    u=0;
                }else {
                    if (b[0]==b[1]){
                        matriz[m][n]=0;
                        u=0;
                    }else {
                        matriz[m][n]=1;
                        u=1;
                    }
                }
            }
            t=t+u;
        }
        if (t==8){
            System.out.println("Verdadero");
        }else {
            System.out.println("Falso");
        }
    }
    
    public void notasRita(double P1, double P2,double P3, double Sgto){        // 1. Taller 1: punto 1n
        double Pr,notaN;
        Pr = P1*0.1+P2*0.15+P3*0.15+Sgto*0.35;
        notaN= (4.0-Pr)/0.25;
        System.out.println("La nota que usted necesita para pasar el curso es: "+notaN);
    }
    
    public void EjercicioDos (int v,int vh){      //2. Taller 2: punto 3
        int p=v*vh;
        if (p>1289300){
            if (p>1933950){
                System.out.println(" Seguridad "+p*0.20+" Solidaridad "+p*0.01+" Dian "+p*0.04+" Consignacion "+(p-(p*0.25)));
            }else{
                System.out.println(" Seguridad "+p*0.20+" Solidaridad "+p*0.01+" Dian "+p*0.02+" Consignacion "+(p-(p*0.23)));
            }
        }else{ 
            System.out.println(" Seguridad "+p*0.20+" Solidaridad "+0+" Dian "+p*0.02+" Consignacion "+(p-(p*0.22)));
        }
        {
            System.out.println(" Consignacion antes de impuestos "+p);
        }
    }
        public void EjercicioUnoJ (int n){       //4. Taller 3: punto 1j
        while(n>=0){
            n=(int) Math.sqrt(( Math.pow(n,2))+1);
            System.out.println(n);
        }
    }     
    public void ejercicioI(){  //6. Taller 4: punto i
        Scanner sc = new Scanner(System.in);
		String a[]= new String[20];
		double b[]= new double[20];
		int f;		
		int c;
		int t;
		double x;
		double z=0;			
		int y;
		int n;
				
		a[0] = "Nicolás ";
		a[1] = "David ";
		a[2] = "Santiago ";
		a[3] = "Felipe ";
		a[4] = "Sara ";
		a[5] = "Ricardo ";
		a[6] = "Salome ";
		a[7] = "Pablo ";
		a[8] = "Gustavo ";
		a[9] = "Valentina ";
		a[10] = "Andrea ";
		a[11] = "Luisa ";
		a[12] = "Sebastián ";
		a[13] = "Juan ";
		a[14] = "Pedro ";
		a[15] = "Manuela ";
		a[16] = "Manuel";
		a[17] = "Tomas ";
		a[18] = "Kelly ";
		a[19] = "Karen ";
		System.out.println(" Numero de Estudiantes que desea buscar. ");
		c = sc.nextInt();
		for (c=c-1;c>=0;c--) {
		    System.out.println(" Numero del estudiante ");
			n = sc.nextInt();
			System.out.println(a[n]);
		}
		b[0] = 5.0;
		b[1] = 2.3;
		b[2] = 4.9;
		b[3] = 3.1;
		b[4] = 2.9;
		b[5] = 0.1;
		b[6] = 1.7;
		b[7] = 3.8;
		b[8] = 2.2;
		b[9] = 1.2;
		b[10] = 5.0;
		b[11] = 4.8;
		b[12] = 3.5;
		b[13] = 5.0;
		b[14] = 3.9;
		b[15] = 3.4;
		b[16] = 4.2;
		b[17] = 2.5;
		b[18] = 4.1;
		b[19] = 4.9;
		System.out.println(" Numero de notas que desea cambiar");
		f = sc.nextInt();
		for (f=f-1;f>=0;f--) {
			System.out.println(" Nota que desea cambiar ");
			y = sc.nextInt();
			System.out.println(" Nota que desea ulitilzar para reemplazar ");
			x = sc.nextDouble();
			b[y] = x;
			System.out.println(b[y]+" Nota reemplazada ");
		}
		x = 0;
		System.out.println(" Media de todas las notas ");
		for (y=0;y<=19;y++) {
			x = x+b[y];
		}
		System.out.println(x/20);
		x = 0;
		t = 0;
		System.out.println(" Media de todas las notas a exepcion de 5 ");
		for (y=0;y<=19;y++) {
			if (b[y]<5) {
				x = x+b[y];
				t = t+1;
			} else {
				x = x;
			}
		}
		System.out.println(x/t);
		System.out.println(" Nota menor ");
		for (x=0;x<=5;x+=0.1) {
			for (y=0;y<=19;y++) {
				if (b[y]==x) {
					z = b[y];
				} else {
					x = x;
				}
			}
		}
		System.out.println(z);
		System.out.println(" Nota mayor ");
		for (x=5;x>=0;x-=0.1) {
			for (y=0;y<=19;y++) {
				if (b[y]==x) {
					z = b[y];
				} else {
					x = x;
				}
			}
		}
		System.out.println(z);
		System.out.println(" Nombres de alumnos y sus notas ");
		for (y=0;y<=19;y++) {
			System.out.println(a[y]+""+b[y]);
		}
	}
}