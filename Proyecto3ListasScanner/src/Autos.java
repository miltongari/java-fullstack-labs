
public class Autos {
	String marca;
	String modelo;
	String color;
	String tipoAuto;
	String paisOrigen;
	int status;
	int anioEstreno;
	double precio;

	public Autos() {
	}

	public Autos(String marca, String modelo, String color, String tipoAuto, String paisOrigen, int status,
			int anioEstreno, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tipoAuto = tipoAuto;
		this.paisOrigen = paisOrigen;
		this.status = status;
		this.anioEstreno = anioEstreno;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Autos [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tipoAuto=" + tipoAuto
				+ ", paisOrigen=" + paisOrigen + ", status=" + status + ", anioEstreno=" + anioEstreno + ", precio="
				+ precio + "]\n";
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

	public String getTipoAuto() {
		return tipoAuto;
	}

	public void setTipoAuto(String tipoAuto) {
		this.tipoAuto = tipoAuto;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getAnioEstreno() {
		return anioEstreno;
	}

	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
