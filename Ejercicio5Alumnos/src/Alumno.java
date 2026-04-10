
public class Alumno {
	String matricula;
	String nombre;
	String apellido;
	int edad;
	String sexo;
	String gradoGrupo;
	String correo;
	String telefono;

	public Alumno() {
	}

	public Alumno(String matricula, String nombre, String apellido, int edad, String sexo, String gradoGrupo,
			String correo, String telefono) {
		this.matricula = matricula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
		this.gradoGrupo = gradoGrupo;
		this.correo = correo;
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Alumno [matricula=" + matricula + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", sexo=" + sexo + ", gradoGrupo=" + gradoGrupo + ", correo=" + correo + ", telefono=" + telefono
				+ "]\n";
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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

	public String getGradoGrupo() {
		return gradoGrupo;
	}

	public void setGradoGrupo(String gradoGrupo) {
		this.gradoGrupo = gradoGrupo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
