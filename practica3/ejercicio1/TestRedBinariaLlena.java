package practica3.ejercicio1;


public class TestRedBinariaLlena {
	
	
	public static void main(String[] args) {
		ArbolBinario<Integer> a = new ArbolBinario<Integer>(0); 
		ArbolBinario<Integer> b = new ArbolBinario<Integer>(1); 
		ArbolBinario<Integer> c = new ArbolBinario<Integer>(1); 
		ArbolBinario<Integer> d = new ArbolBinario<Integer>(2); 
		ArbolBinario<Integer> e = new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> f = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> g = new ArbolBinario<Integer>(8);
		ArbolBinario<Integer> h = new ArbolBinario<Integer>(3);
		
		a.agregarHijoIzquierdo(b);
		a.agregarHijoDerecho(c);
		b.agregarHijoIzquierdo(d);
		b.agregarHijoDerecho(e);
		c.agregarHijoIzquierdo(f);
		c.agregarHijoDerecho(g);
		//c.agregarHijoDerecho(f);
		
		RedBinariaLlena red = new RedBinariaLlena(a);
		
		System.out.println(red.retardoReenvio() + " SEGUNDOS");

	}


}
