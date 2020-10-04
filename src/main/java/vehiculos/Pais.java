package vehiculos;

import java.util.*;


public class Pais {
	String nombre;
	int ventasPais;
	static LinkedList <Pais> pais = new LinkedList<Pais>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
		pais.add(this);
	}
	
	public static Pais paisMasVendedor() {
		int mayor = 0;
		Pais paisVendedor = null;
		for (int i= 0; i < pais.size(); ) {
		if (pais.get(i).ventasPais > mayor) {
			mayor = pais.get(i).ventasPais;
			paisVendedor = pais.get(i);
		}
		}
		return paisVendedor;
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
