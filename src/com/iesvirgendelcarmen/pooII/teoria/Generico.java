package com.iesvirgendelcarmen.pooII.teoria;

import java.util.ArrayList;
import java.util.List;

public class Generico <T>{
	
	private List<T> lista = new ArrayList<>();
		
	public List<T> getLista() {
		return lista;
	}

	public void addItem (T item) {
		lista.add(item);
	}
	
	public T getItem (int posicion) {
		if (posicion >= lista.size())
			return null;
		return lista.get(posicion);
	}
	
}
