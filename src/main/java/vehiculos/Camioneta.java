package vehiculos;

public class Camioneta extends Vehiculo {
	Boolean volco;
	static int cantidadCamionetas;

public Camioneta(String placa, int puertas, String nombre, double precio, float peso, Fabricante fabricante, Boolean volco) {
	super(placa, puertas ,90, nombre, precio, peso, "4X4", fabricante);
	this.volco = volco;
	cantidadCamionetas++;
}



public Boolean getVolco() {
	return volco;
}



public void setVolco(Boolean volco) {
	this.volco = volco;
}


}