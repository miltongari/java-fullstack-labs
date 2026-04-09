import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
		// for(Empleados empleado:lista) {
		// System.out.println(empleado);
		// }

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
		// lista.remove(2);
		// System.out.println("\nNueva lista editada: \n" + lista);

		/*
		 * --> toda aplicacion debe de tener las 4 operaciones basicas --> Listas -->
		 * trabajan con indice --> apuntar a la fila actual del objeto --> indice -->
		 * tenemos el objeto
		 * 
		 * --> Objetivo: aplicaciones escalables y que el mantenimiento se mas sencillo
		 * 
		 * --> Errores logicos --> Errores de sintaxis
		 * 
		 * --> Las apps se desarrollan pensando en el usuario final
		 * 
		 * --> ciclos --> listas --> son iterables --> herenda de la interfaces
		 * collection --> Iterable
		 * 
		 * 
		 */

		for (int i = 0; i < lista.size(); i++) {
			System.out.println("Lista de empleados: " + lista.get(i));
		}

		/*
		 * equals:Compara la cadena tal cual equalsIgnoreCase: no valida si esta escrito
		 * en mayusculas o minusculas
		 * 
		 */
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNombre().equalsIgnoreCase("ana")) {
				System.out.println("Se encontro el empleado por nombre: " + lista.get(i));
				break; // rompe el flujo de ejecucion
			} else {
				System.out.println("No existe el empleado con el nombre solicitado");
			}
		}

		// forEach -> es un for mejorado
		for (Empleados e : lista) {
			if (e.getDepto().equals("Ventas") || e.getSueldo() == 5100.0) {
				System.out.println("Se encontro el empleado por depto: " + e);
			}
		}

		// Expresion lamda --> Es la forma moderna y limpio de realizar algun
		// filtro
		lista.forEach(a -> {
			System.out.println("Lista de empleados con () -> " + a);
		});

		lista.stream().filter(a -> a.getEdad() == 30).forEach(b -> {
			System.out.println("Se encontro los empleados por edad: " + b);
		});

		// var variables globales --> inferencia de tiposF
		var buscarSueldo = lista.stream().filter(a -> a.getSueldo() == 5100.0).findFirst();
		System.out.println("Se encontro el sueldo mas bajo" + buscarSueldo);

		// Contar empleados por depto
		// map --> mapa de datos --> trabaja con la sentencia key, value
		Map<String, Long> empleadosPorDepto = lista.stream()
				.collect(Collectors.groupingBy(Empleados::getDepto, Collectors.counting()));
		System.out.println("Empleados por depto: " + empleadosPorDepto);

		// Iterator
		Iterator<Empleados> iterator = lista.iterator();
		while (iterator.hasNext()) {
			Empleados intaranadoEmpleados = iterator.next();
			System.out.println("Lista de empleados utilizando Iterator" + intaranadoEmpleados);
		}

		// Eliminar
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNombre().equals("Ana")) {
				lista.remove(i);
				System.out.println("Se elimino por nombre");
			}
		}
		System.out.println("Lista actual: -->" + lista);

		// Eliminar pero usando el valor de la lista se pone -1 para que i tenga el valor total del tamano de la lista
		for (int i = lista.size() - 1; i >= 0; i--) {
			if (lista.get(i).getNombre().equals("Elena")) {
				lista.remove(i);
				System.out.println("Se elimino por nombre");
			}
		}
		System.out.println("Lista actual: -->" + lista);
		
		// Eliminar forEach
		try {
			for (Empleados e : lista) {
				if(e.getNombre().equals("Ricardo")) {
					lista.remove(e);
					System.out.println("Se elimino utilizando forEach");
				}
			}
		} catch (Exception e2) {
			System.out.println("Error al eliminar: "+e2.getMessage());
		}
		
		System.out.println("Lista actual: -->" + lista);
		
		// Expresion lamda
		lista.removeIf(a -> a.getNombre().equals("Luis"));

		System.out.println("Lista actual: -->" + lista);
		
		
		/* Ciclos depende de la habilidad y conocimiento
		 * 
		 * ciclo recomendable
		 * buscar --> for, forEach, expresion,lamda,iterador
		 * eliminar
		 * for		si
		 * forEach  no
		 * Iterador si
		 * lamda 	si
		 */
		 
	}
}
