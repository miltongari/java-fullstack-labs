
public class Computadoras {
	/* POJOS: son objetos simples significa que no dependen de ningun API´s
	 * 
	 * Clase Peliclas 
	 *  nombre
	 *  actor 
	 *  duracion 
	 *  clasificacion 
	 *  genero 
	 *  precio 
	 *  plataformaEstreno
	 * 
	 * 
	 * 1.- Atributos: caracteriticas del objeto
	 * 2.- contructor : peermte instanciar clases o crear nuevos objetos 
	 * 3.- Contructor con parametros : inicializar un objeto y sus valores 
	 * 4.- metodo toString : permite convertir a cadena cualquier objeto en java 
	 * 5.- Encapsulamiento : para tener un mejor control de los atributos de un objeto en una clase 
	 * 
	 * Clase principal: 
	 * main --> el punto de entrada de cualquier apliacion en java 
	 *  1.- inctancia y asiganacion de valors 
	 *  2.- intancia de clases con encapsulamiento 
	 *  3.- instancia de clases utilizando contructor con parametros 
	 * 
	 * 
	 * */
	String marca;
	String modelo;
	String color;
	String capacidad;
	int cantidad;
	double precio;

	public Computadoras() {
	}

	public Computadoras(String marca, String modelo, String color, String capacidad, int cantidad, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.capacidad = capacidad;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	// metodo to String --> convierte a cadena cualquier objeto en java -->
	// deserealizar
	@Override
	public String toString() {
		return "Computadoras [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", capacidad=" + capacidad
				+ ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}
	// encapsulamiento --> tener un mejor control de los atibutos y metodos de un
	// objeto y para accder se utilizas sus metodos public GET y SET

	// funcion
	public String getMarca() {
		return marca;
	}

	// Procedimiento
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
