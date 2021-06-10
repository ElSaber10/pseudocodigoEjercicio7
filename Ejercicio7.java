import java.util.*;
import java.util.Random;
public class Ejercicio7 {
	public static void main(String[] args){
	int pares = 0, impares = 0, ceros = 0, sumapar=0,sumaimpar=0;
	double par=0,impar=0,cero=0;
	for(int i = 0; i < 15; i++){
	int numero = (int)(Math.random()*36+0);
	System.out.println(numero);
	if (numero % 2 == 0){
	sumapar+=numero;
	pares++;
	}
	if (numero % 2 != 0){
	impares++;
	sumaimpar+=numero;
	}
	}
	par = (pares*100/15);
	impar = (impares*100/15);
	cero = (100 -(par + impar));
	System.out.println("Pares son: " + (par));
	System.out.println("Impares son: " + impar);
		System.out.println("ceros son: " + cero);
}
}
