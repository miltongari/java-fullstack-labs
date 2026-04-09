
public class Productos {
	String nombreTienda;
	String nombre;
	String marca;
	String sabor;
	Double porcion;
	int cantidad;
	Double precioVenta;

	public Productos() {
	}

	public Productos(String nombreTienda, String nombre, String marca, String sabor, Double porcion, int cantidad,
			Double precioVenta) {
		this.nombreTienda = nombreTienda;
		this.nombre = nombre;
		this.marca = marca;
		this.sabor = sabor;
		this.porcion = porcion;
		this.cantidad = cantidad;
		this.precioVenta = precioVenta;
	}

	@Override
	public String toString() {
		return "Productos [nombreTienda=" + nombreTienda + ", nombre=" + nombre + ", marca=" + marca + ", sabor="
				+ sabor + ", porcion=" + porcion + ", cantidad=" + cantidad + ", precioVenta=" + precioVenta + "]\n";
	}

	public String getNombreTienda() {
		return nombreTienda;
	}

	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public Double getPorcion() {
		return porcion;
	}

	public void setPorcion(Double porcion) {
		this.porcion = porcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	
}
