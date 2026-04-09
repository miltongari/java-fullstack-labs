import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco prestamo1 = new Banco("BBVA", "Juan Pérez", "BBVA México", 28, "Masculino", "Av. Reforma 123", "Nomina",
				50000.0, "Pagado");
		Banco prestamo2 = new Banco("Santander", "María García", "Santander Móvil", 35, "Femenino", "Calle Juárez 456",
				"Grupal", 12000.0, "Pendiente de pago");
		Banco prestamo3 = new Banco("Banorte", "Carlos López", "Banorte Móvil", 42, "Masculino", "Colonia Centro 78",
				"Nomina", 35000.0, "Pagado");
		Banco prestamo4 = new Banco("BBVA", "Ana Martínez", "BBVA México", 30, "Femenino", "Paseo de la Castellana 9",
				"Nomina", 15000.0, "Pendiente de pago");
		Banco prestamo5 = new Banco("Santander", "Roberto Gómez", "Santander Móvil", 55, "Masculino", "Blvd. Kino 202",
				"Grupal", 8000.0, "Pagado");
		Banco prestamo6 = new Banco("Banorte", "Lucía Fernández", "Banorte Móvil", 24, "Femenino",
				"Av. Insurgentes Sur 300", "Nomina", 85000.0, "Pendiente de pago");
		Banco prestamo7 = new Banco("BBVA", "Pedro Ramírez", "BBVA México", 40, "Masculino", "Calle 10 por 50",
				"Grupal", 5000.0, "Pagado");
		Banco prestamo8 = new Banco("Santander", "Elena Torres", "Santander Móvil", 62, "Femenino",
				"Lomas de Chapultepec 11", "Nomina", 120000.0, "Pendiente de pago");
		Banco prestamo9 = new Banco("Banorte", "Miguel Ángel", "Banorte Móvil", 47, "Masculino",
				"Paseo de los Leones 55", "Grupal", 15000.0, "Pagado");
		Banco prestamo10 = new Banco("BBVA", "Sofía Castro", "BBVA México", 33, "Femenino", "Av. Universidad 1010",
				"Nomina", 60000.0, "Pendiente de pago");

		// Guardando los objetos en su lista
		List<Banco> listaBancos = new ArrayList<Banco>();
		listaBancos.add(prestamo1);
		listaBancos.add(prestamo2);
		listaBancos.add(prestamo3);
		listaBancos.add(prestamo4);
		listaBancos.add(prestamo5);
		listaBancos.add(prestamo6);
		listaBancos.add(prestamo7);
		listaBancos.add(prestamo8);
		listaBancos.add(prestamo9);
		listaBancos.add(prestamo10);

		// Lista de los prestamos
		System.out.println("Lista: " + listaBancos);
		System.out.println("\n\n");

		// buscar prestamos en la lista por indice
		Banco prestamoBuscar = null;
		prestamoBuscar = listaBancos.get(9);
		System.out.println("Datos encontrado por indice: " + prestamoBuscar);
		System.out.println("\n\n");

		// Editar informacion
		Banco prestamoEdit = null;
		prestamoEdit = listaBancos.get(8);
		prestamoEdit.setEdad(50);
		prestamoEdit.setSexo("Femenino");
		listaBancos.set(8, prestamoEdit);
		System.out.println("Lista editada actualizada: " + listaBancos);
		System.out.println("\n\n");

		// Eliminar Informacion
//		listaBancos.remove(0);
//		listaBancos.remove(1);
//		listaBancos.remove(2);
//		listaBancos.remove(3);
//		System.out.println("Lista Borrada actualizada: "+listaBancos);
//		System.out.println("\n\n");

		// Busqueda por for el nombre del cliente
		for (int i = 0; i < listaBancos.size(); i++) {
			if (listaBancos.get(i).getNombreCliente().equals("Sofía Castro")) {
				System.out.println("Se encontro el nombre del cliente: " + listaBancos.get(i));
				break;
			} else {
				continue;
			}
		}
		System.out.println("\n\n");

		// Busqueda tipoPrestamo por forEach
		for (Banco e : listaBancos) {
			if (e.getTipoPrestamo().equalsIgnoreCase("Nomina")) {
				System.out.println("Se encontro el tipo de prestamo: " + e);
			} else {
				continue;
			}
		}
		System.out.println("\n\n");

		// Busca por edad con lamda
		var buscarEdad = listaBancos.stream().filter(a -> a.getEdad() == 30).findFirst();
		System.out.println("Se encontro la persona con esa edad: " + buscarEdad);
		System.out.println("\n\n");

		// Busqueda de cuantos bancos hay
		Map<String, Long> contadorBancos = listaBancos.stream()
				.collect(Collectors.groupingBy(Banco::getNombreBanco, Collectors.counting()));
		System.out.println("Cantidad de Bancos: " + contadorBancos);
		System.out.println("\n\n");

		// Busqueda de banco por iterador
		Iterator<Banco> iterador = listaBancos.iterator();
		while (iterador.hasNext()) {
			Banco intarandoBancos = iterador.next();
			if (intarandoBancos.getNombreBanco().equalsIgnoreCase("BBVA")) {
				System.out.println("Prestamos con los mismos bancos: " + intarandoBancos);
			} else {
				continue;
			}
		}
		System.out.println("\n\n");

		// Borrar datos con for
		for (int i = 0; i < listaBancos.size(); i++) {
			if (listaBancos.get(i).getNombreCliente().equalsIgnoreCase("Elena Torres")) {
				var imprimir = listaBancos.remove(i);
				System.out.println("Se elimino por nombre con for"+imprimir);
			}

		}
		System.out.println("Lista editada actualizada: " + listaBancos);
		System.out.println("\n\n");

		// Borrar con lamda
		listaBancos.removeIf(a -> a.getEdad() == 42);
		System.out.println("Lista editada con lamda: " + listaBancos);
		System.out.println("\n\n");

		// borrando con iterador
		Iterator<Banco> iterator = listaBancos.iterator();
		while (iterator.hasNext()) {
			Banco intaranadoBanco = iterator.next();
			if (intaranadoBanco.getMontoPrestamo() == 60000.0) {
				iterator.remove();
				System.out.println("removido con iterador: " + intaranadoBanco);
				System.out.println("\n\n");
			} else {
				continue;
			}
		}
		System.out.println("Lista editada actualizada: " + listaBancos);
		System.out.println("\n\n");
	}

}
