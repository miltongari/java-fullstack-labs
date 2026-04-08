
public class Empleados {
	// 1.-Atributos
	String nombre;
	String app;
	int edad;
	String sexo;
	String depto;
	Double sueldo;

	// 2.-Constructor vacio
	public Empleados() {
	}

	// 3.-Constructor con atributos
	public Empleados(String nombre, String app, int edad, String sexo, String depto, Double sueldo) {
		this.nombre = nombre;
		this.app = app;
		this.edad = edad;
		this.sexo = sexo;
		this.depto = depto;
		this.sueldo = sueldo;
	}

	// 4.- toString
	@Override
	public String toString() {
//		return """
//		        +-------------------------------------------+
//		        |             DATOS DEL EMPLEADO            |
//		        +-------------------------------------------+
//		        | Nombre:   %-31s |
//		        | Apellido: %-31s |
//		        | Edad:     %-31d |
//		        | Sexo:     %-31s |
//		        | Depto:    %-31s |
//		        | Sueldo:   $%-30.2f |
//		        +-------------------------------------------+
//		        """.formatted(nombre, app, edad, sexo, depto, sueldo);
		return "Empleados [nombre=" + nombre + ", app=" + app + ", edad=" + edad + ", sexo=" + sexo + ", depto=" + depto
				+ ", sueldo=" + sueldo + "]\n";
	}

	// 5.- Encapsulamiento
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public String getDepto() {
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

}
