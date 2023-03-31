package practica1;

import java.util.Scanner;

public class Ejer2 {
	
//metodo que devuelve num ingresado	
public static int asknum ( ) {
	
System.out.println("Ingrese un numero");	
Scanner s = new Scanner(System.in) ;
return s.nextInt();

}

public static int[] getMultiples(int n) {
    int[] multiples = new int[n];
    for (int i = 0; i < n; i++) {
        multiples[i] = n * (i + 1);
    }
    return multiples;
}

public static void main(String[]args) {
	
	int num = asknum();
	int[] mul = getMultiples(num);
	for(int i = 0; i<mul.length;i++ ) {
		System.out.println(mul[i]);
	}
}

}
