package vehiculos;

import java.util.LinkedList;


public class Fabricante {
	String nombre;
	Pais pais;
	int ventasFabricante;
	static LinkedList <Fabricante> fabricante = new LinkedList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricante.add(this);
	}
	
	public static Fabricante fabricaMayorVentas() {
		int mayor = 0;
		Fabricante fabricaVendedor = null;
		for (int i= 0; i < fabricante.size(); i++) {
		if (fabricante.get(i).ventasFabricante > mayor) {
			mayor = fabricante.get(i).ventasFabricante;
			fabricaVendedor = fabricante.get(i);
		}
		}
		return fabricaVendedor;
		
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
