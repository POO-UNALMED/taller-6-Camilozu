package vehiculos;

public class Vehiculo {
	String placa;
	int puertas;
	int velocidadMaxima;
	String nombre;
	double precio;
	float peso;
	String traccion;
	Fabricante fabricante;
	static int CantidadVehiculos;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, double precio, float peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		CantidadVehiculos++;
		fabricante.ventasFabricante++;
		fabricante.pais.ventasPais++;
		
	}
	
	public Vehiculo(int puerta, int velocidadMaxima, String traccion) {
		
		
	}
	
	public Vehiculo(int velocidadMaxima, String traccion) {
		this(0, velocidadMaxima, traccion);
	}
	

	
	static public int getCantidadVehiculos(){
		return CantidadVehiculos;				
	}
	public String vehiculosPorTipo(){
		return "Automoviles: "+ Automovil.cantidadAutomovil +"\n"+
				"Camionetas: "+ Camioneta.cantidadCamionetas +"\n"+
				"Camiones: "+ Camion.cantidadCamiones +"\n";
				
		
	}
	

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public static void setCantidadVehiculos(int cantidadVehiculos) {
		CantidadVehiculos = cantidadVehiculos;
	}

}
