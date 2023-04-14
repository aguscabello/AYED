package practica3.ejercicio1;
import tp02.ejercicio2.*;

public class ContadorArbol {
	
	private ArbolBinario<Integer> dato;
	
	public ContadorArbol(ArbolBinario<Integer> dato){
		this.dato = dato;
	}
	
	public ListaEnlazadaGenerica<Integer> contar()
	{
		ListaEnlazadaGenerica<Integer> list = new ListaEnlazadaGenerica<Integer>();
		numerosParesPostOrden(list,dato);
		return list;
	}
	
	public void numerosParesInOrden (ListaEnlazadaGenerica<Integer> list,ArbolBinario<Integer> dato){
		
		
		//proceso arbol izq
		if(dato.tieneHijoIzquierdo()) {
			numerosParesInOrden(list,dato.getHijoIzquierdo());
		}
		
		
		//proceso raiz
		if(dato.getDato() % 2 == 0) {
			list.agregarFinal(dato.getDato());
		}
		
		//proceso arbol der
		if(dato.tieneHijoDerecho()) {
			numerosParesInOrden(list,dato.getHijoDerecho());
		}
	}
		
		public void numerosParesPostOrden (ListaEnlazadaGenerica<Integer> list,ArbolBinario<Integer> dato){
			
			
			//proceso arbol izq
			if(dato.tieneHijoIzquierdo()) {
				numerosParesInOrden(list,dato.getHijoIzquierdo());
			}
			
			
			//proceso arbol der
			if(dato.tieneHijoDerecho()) {
				numerosParesInOrden(list,dato.getHijoDerecho());
			}
			
			//proceso raiz
			if(dato.getDato() % 2 == 0) {
				list.agregarFinal(dato.getDato());
			}
			
		
		
		
		
	}
	
	

}
