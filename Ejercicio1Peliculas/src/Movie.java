
public class Movie {
	 String nombre;
	 String actor;
	 int duracion;
	 String clasificacion;
	 String genero;
	 String precio;
	 String plataformaEstreno;

	public Movie() {

	}

	public Movie(String nombre, String actor, int duracion, String clasificacion, String genero, String precio,
			String plataformaEstreno) {
		this.nombre = nombre;
		this.actor = actor;
		this.duracion = duracion;
		this.clasificacion = clasificacion;
		this.genero = genero;
		this.precio = precio;
		this.plataformaEstreno = plataformaEstreno;
	}

	@Override
	public String toString() {
		return "Movie [nombre=" + nombre + ", actor=" + actor + ", duracion=" + duracion + ", clasificacion="
				+ clasificacion + ", genero=" + genero + ", precio=" + precio + ", plataformaEstreno="
				+ plataformaEstreno + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getPlataformaEstreno() {
		return plataformaEstreno;
	}

	public void setPlataformaEstreno(String plataformaEstreno) {
		this.plataformaEstreno = plataformaEstreno;
	}

}
