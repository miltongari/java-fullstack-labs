import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear Coleccion de objetos
		Empleados empleado1 = new Empleados("Luis", "Mendez", 30, "M", "Ventas", 5000.0);
		Empleados empleado2 = new Empleados("Maria", "Garcia", 28, "F", "Recursos Humanos", 5500.0);
		Empleados empleado3 = new Empleados("Carlos", "Sanchez", 35, "M", "Sistemas", 7200.0);
		Empleados empleado4 = new Empleados("Ana", "Rodriguez", 24, "F", "Marketing", 4800.0);
		Empleados empleado5 = new Empleados("Jorge", "Lopez", 42, "M", "Finanzas", 8500.0);
		Empleados empleado6 = new Empleados("Elena", "Martinez", 31, "F", "Ventas", 5100.0);
		Empleados empleado7 = new Empleados("Ricardo", "Perez", 29, "M", "Sistemas", 6900.0);

		// Crear una lista por que tengo una coleccion de objetos
		List<Empleados> lista = new ArrayList<Empleados>();

		// Aplicaciones escalables y robustas --> CRUD
		// 1.- Metodo Guardar
		lista.add(empleado1);
		lista.add(empleado2);
		lista.add(empleado3);
		lista.add(empleado4);
		lista.add(empleado5);
		lista.add(empleado6);
		lista.add(empleado7);

		// 2.- Metodo Listar
		System.out.println("Lista de empleados:\n" + lista);
//		for(Empleados empleado:lista) {
//			System.out.println(empleado);
//		}

		// 3.- Metodo buscar
		Empleados empleadoBuscar = null;
		empleadoBuscar = lista.get(6);
		System.out.println("\nSe encontro el empleado: " + empleadoBuscar);

		// 4.- Metodo editar --> para editar primero hay que buscar
		Empleados empleadoEditar = null;
		empleadoEditar = lista.get(0);
		System.out.println("\nSe encontro el empleado a editar: " + empleadoBuscar);
		// enviar nuevos valores
		empleadoEditar.setSueldo(999999.0);
		empleadoEditar.setApp("Editado");
		// Actualizo la lista
		lista.set(0, empleadoEditar);
		System.out.println("\nNueva lista editada: \n" + lista);
		
		// 5.- metodo eliminar
		lista.remove(2);
		System.out.println("\nNueva lista editada: \n" + lista);
		
		// 6.- 
	}

}
