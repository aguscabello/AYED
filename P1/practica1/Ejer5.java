package practica1;

public class Ejer5 {
	
	public static void main (String[]args) {
		 int[] arr = {1, 2, 3, 4, 5};
	     System.out.println("Máximo: " + max(arr));
	     System.out.println("Mínimo: " + min(arr));
	     System.out.println("Promedio: " + promedio(arr));
	}
	
	public static int max(int[] arr) {
		int aux = -999;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>aux) {
				aux=arr[i];
			}
		}
		return aux;
	}
	
	public static int min(int[] arr) {
		int aux = 999;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<aux) {
				aux=arr[i];
			}
		}
		return aux;
	}
	
	public static double promedio(int[] arr) {
		double sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		return sum/arr.length;
	}


}
