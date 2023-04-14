package practica3.ejercicio1;



public class RedBinariaLlena {
	
	ArbolBinario<Integer> a = new ArbolBinario<Integer>();
	
	public RedBinariaLlena(ArbolBinario<Integer> arbol)
	{
		this.a = arbol;
	}
	
	
	
	
	
	
	public int esMayor(int a,int b)
	{
		if(a>b) {
			return a;
		}
		else
			return b;
		
	}
	
	public int retardoReenvio()
	{
		return retardoReenvio(a);
	}

	
	private int retardoReenvio(ArbolBinario<Integer> a)
	{
		if (a.esVacio())
		{
			return -1;
		}
		
		int cant = -1;
		
		if(a.esHoja())
		{
			return a.getDato(); 
		}
		else
		{
			if(a.tieneHijoIzquierdo()) {
				cant = esMayor(cant, retardoReenvio(a.getHijoIzquierdo()));
			if(a.tieneHijoDerecho()) {
				cant = esMayor(cant, retardoReenvio(a.getHijoDerecho()));
			}
			}
		}
		
		return cant;
	}
	
	
	
}
