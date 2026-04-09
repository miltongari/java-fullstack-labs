
public class Banco {
	String nombreBanco;
	String nombreCliente;
	String app;
	int edad;
	String sexo;
	String Domicilio;
	String tipoPrestamo;
	Double montoPrestamo;
	String status;

	public Banco() {
	}

	public Banco(String nombreBanco, String nombreCliente, String app, int edad, String sexo, String domicilio,
			String tipoPrestamo, Double montoPrestamo, String status) {
		this.nombreBanco = nombreBanco;
		this.nombreCliente = nombreCliente;
		this.app = app;
		this.edad = edad;
		this.sexo = sexo;
		Domicilio = domicilio;
		this.tipoPrestamo = tipoPrestamo;
		this.montoPrestamo = montoPrestamo;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Banco [nombreBanco=" + nombreBanco + ", nombreCliente=" + nombreCliente + ", app=" + app + ", edad="
				+ edad + ", sexo=" + sexo + ", Domicilio=" + Domicilio + ", tipoPrestamo=" + tipoPrestamo
				+ ", montoPrestamo=" + montoPrestamo + ", status=" + status + "]\n";
	}

	public String getNombreBanco() {
		return nombreBanco;
	}

	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDomicilio() {
		return Domicilio;
	}

	public void setDomicilio(String domicilio) {
		Domicilio = domicilio;
	}

	public String getTipoPrestamo() {
		return tipoPrestamo;
	}

	public void setTipoPrestamo(String tipoPrestamo) {
		this.tipoPrestamo = tipoPrestamo;
	}

	public Double getMontoPrestamo() {
		return montoPrestamo;
	}

	public void setMontoPrestamo(Double montoPrestamo) {
		this.montoPrestamo = montoPrestamo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
