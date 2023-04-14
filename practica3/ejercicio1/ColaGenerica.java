package practica3.ejercicio1;
import tp02.ejercicio2.*;

public class ColaGenerica <T> {
	private ListaEnlazadaGenerica<T> dato = new ListaEnlazadaGenerica <T>();
	
	
	
	public void encolar(T elem)
	{
		this.dato.agregarFinal(elem);
	}
	
	public T desencolar() {
		T ult = this.dato.elemento(1);
		this.dato.eliminarEn(1);
		return ult;
	}
	
	public T tope() {
		return this.dato.elemento(1);
	}
	
	public boolean esVacia() {
		return this.dato.tamanio() == 0;
	}
}
