
public class Autos {
	String marca;
	String modelo;
	String color;
	int numPuertas;
	String tipoAuto;
	int cantidad;
	Double precioVenta;

	public Autos() {
	}

	public Autos(String marca, String modelo, String color, int numPuertas, String tipoAuto, int cantidad,
			Double precioVenta) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.numPuertas = numPuertas;
		this.tipoAuto = tipoAuto;
		this.cantidad = cantidad;
		this.precioVenta = precioVenta;
	}

	@Override
	public String toString() {
		return "Autos [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", numPuertas=" + numPuertas
				+ ", tipoAuto=" + tipoAuto + ", cantidad=" + cantidad + ", precioVenta=" + precioVenta + "]";
	}

	public String getMarca() {
		return marca;
	}

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

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public String getTipoAuto() {
		return tipoAuto;
	}

	public void setTipoAuto(String tipoAuto) {
		this.tipoAuto = tipoAuto;
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
