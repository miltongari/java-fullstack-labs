
public class Main {

	public static void main(String[] args) {

		Movie pelicula = new Movie();
		pelicula.nombre = "Avatar";
		pelicula.actor = "Sam";
		pelicula.duracion = 140;
		pelicula.clasificacion = "R";
		pelicula.genero = "Accion";
		pelicula.precio = "2000";
		pelicula.plataformaEstreno = "Cine";

		Movie pelicula2 = null;
		pelicula2 = new Movie("Mad Max: Fury Road", "Tom Hardy", 120, "R", "Accion", "120", "Cine");

		Movie pelicula3 = new Movie();
		pelicula3.setNombre("John Wick");
		pelicula3.setActor("Keanu Reeves");
		pelicula3.setDuracion(101);
		pelicula3.setClasificacion("R");
		pelicula3.setGenero("Accion");
		pelicula3.setPrecio("95");
		pelicula3.setPlataformaEstreno("Cine");

		System.out.println("La pelicula 1: " + pelicula);
		System.out.println("La pelicula 2: " + pelicula2);
		System.out.println("La pelicula 3: " + pelicula3);

	}

}
