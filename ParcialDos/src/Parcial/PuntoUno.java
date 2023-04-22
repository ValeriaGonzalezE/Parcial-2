package Parcial;
import java.util.Scanner;
public class PuntoUno {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		String frase;
		System.out.println("digite una frase");
		frase =sc.next();
		
		
		
		String [] arreglo = new String [15];
		
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[0]=frase;
			arreglo[1]=frase;
			arreglo[2]=frase;
			arreglo[3]=frase;
			arreglo[4]=frase;
			arreglo[5]=frase;
			arreglo[6]=frase;
			arreglo[7]=frase;
			arreglo[8]=frase;
			arreglo[9]=frase;
			arreglo[10]=frase;
			arreglo[11]=frase;
			arreglo[12]=frase;
			arreglo[13]=frase;
			arreglo[14]=frase;
			
			System.out.println(arreglo[i]);
			
		}
	}
	
}
