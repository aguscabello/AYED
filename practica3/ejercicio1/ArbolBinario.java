package practica3.ejercicio1;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}
	
	

	public int contarHojas() {
		int hojas = 0;
		if (this.esHoja()) {
			return 1;
		}
		else {
			if (this.tieneHijoIzquierdo()) {
				hojas = hojas + this.getHijoIzquierdo().contarHojas();
			}
			else {
				if (this.tieneHijoDerecho()) {
					hojas = hojas + this.getHijoDerecho().contarHojas();
				}
			}
		}
		return hojas;
	}
	

    public ArbolBinario<T> espejo() {
		
		T dato = this.getDato();
		ArbolBinario<T> arb = new ArbolBinario<T>();
		arb.setDato(dato);
		
		if (this.tieneHijoIzquierdo()) {
			arb.agregarHijoDerecho(this.getHijoIzquierdo().espejo());
		}
	
		if (this.tieneHijoDerecho()) {
				arb.agregarHijoIzquierdo(this.getHijoDerecho().espejo());
		}
			
		
    	
    	return arb;
		
	}


	public void entreNiveles(int n, int m){
		
		ArbolBinario<T> arb = new ArbolBinario<T>();
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		cola.encolar(this);
		cola.encolar(null);
		int nivel = 0;
		
		while(!cola.esVacia() & nivel <= m) {
			arb = cola.desencolar();
			if (arb != null) {
		
		    if (nivel >= n)
				System.out.println(arb.getDato());	
			if(this.tieneHijoIzquierdo()) 
				cola.encolar(arb.getHijoIzquierdo());
			
			if (this.tieneHijoIzquierdo()) 
				cola.encolar(arb.getHijoDerecho());
			
			}
			else {if(!cola.esVacia()) {
				System.out.println();
				cola.encolar(null);
				nivel++;
			}
				
			}
			
			
			
		}
		
	}

	

}
