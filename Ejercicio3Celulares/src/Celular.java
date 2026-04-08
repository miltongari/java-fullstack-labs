
public class Celular {
	String marca;
	String modelo;
	String color;
	String sysOpe;
	int cantidad;
	double precio;
	String pais;
	String tienda;

	public Celular() {

	}

	public Celular(String marca, String modelo, String color, String sysOpe, int cantidad, double precio, String pais,
			String tienda) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.sysOpe = sysOpe;
		this.cantidad = cantidad;
		this.precio = precio;
		this.pais = pais;
		this.tienda = tienda;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", sysOpe=" + sysOpe
				+ ", cantidad=" + cantidad + ", precio=" + precio + ", pais=" + pais + ", tienda=" + tienda + "]\n";
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

	public String getSysOpe() {
		return sysOpe;
	}

	public void setSysOpe(String sysOpe) {
		this.sysOpe = sysOpe;
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

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTienda() {
		return tienda;
	}

	public void setTienda(String tienda) {
		this.tienda = tienda;
	}

}
