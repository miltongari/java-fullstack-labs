import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreBanco;
		String nombreCliente;
		String app;
		int edad;
		String sexo;
		String domicilio;
		String tipoPrestamo;
		Double montoPrestamo;
		String status;

		Banco banco = null;

		Scanner lec = null;

		List<Banco> lista = new ArrayList<Banco>();

		int menu, subMenu, indice;

		do {
			System.out.println("\n\n");
			System.out.println("\n💰 --- Prestamos On-line --- 💰");
			System.out.println("👤 1.- Alta de Clientes");
			System.out.println("💾 2.- Guardar");
			System.out.println("📋 3.- Listar");
			System.out.println("🔍 4.- Buscar");
			System.out.println("📝 5.- Editar");
			System.out.println("🗑️ 6.- Eliminar");
			System.out.println("🚪 7.- Salir");
			lec = new Scanner(System.in);
			menu = lec.nextInt();

			if (menu < 1 || menu > 7) {
				System.out.println("\n ✨ Seleccione una opción del menú!");
			} else {

				switch (menu) {
				case 1:
					Banco prestamo1 = new Banco("BBVA", "Juan Pérez", "BBVA México", 28, "Masculino", "Av. Reforma 123",
							"Nomina", 50000.0, "Pagado");
					Banco prestamo2 = new Banco("Santander", "María García", "Santander Móvil", 35, "Femenino",
							"Calle Juárez 456", "Grupal", 12000.0, "Pendiente de pago");
					Banco prestamo3 = new Banco("Banorte", "Carlos López", "Banorte Móvil", 42, "Masculino",
							"Colonia Centro 78", "Nomina", 35000.0, "Pagado");
					Banco prestamo4 = new Banco("BBVA", "Ana Martínez", "BBVA México", 30, "Femenino",
							"Paseo de la Castellana 9", "Nomina", 15000.0, "Pendiente de pago");
					Banco prestamo5 = new Banco("Santander", "Roberto Gómez", "Santander Móvil", 55, "Masculino",
							"Blvd. Kino 202", "Grupal", 8000.0, "Pagado");
					Banco prestamo6 = new Banco("Banorte", "Lucía Fernández", "Banorte Móvil", 24, "Femenino",
							"Av. Insurgentes Sur 300", "Nomina", 85000.0, "Pendiente de pago");
					Banco prestamo7 = new Banco("BBVA", "Pedro Ramírez", "BBVA México", 40, "Masculino",
							"Calle 10 por 50", "Grupal", 5000.0, "Pagado");
					Banco prestamo8 = new Banco("Santander", "Elena Torres", "Santander Móvil", 62, "Femenino",
							"Lomas de Chapultepec 11", "Nomina", 120000.0, "Pendiente de pago");
					Banco prestamo9 = new Banco("Banorte", "Miguel Ángel", "Banorte Móvil", 47, "Masculino",
							"Paseo de los Leones 55", "Grupal", 15000.0, "Pagado");
					Banco prestamo10 = new Banco("BBVA", "Sofía Castro", "BBVA México", 33, "Femenino",
							"Av. Universidad 1010", "Nomina", 60000.0, "Pendiente de pago");

					lista.add(prestamo1);
					lista.add(prestamo2);
					lista.add(prestamo3);
					lista.add(prestamo4);
					lista.add(prestamo5);
					lista.add(prestamo6);
					lista.add(prestamo7);
					lista.add(prestamo8);
					lista.add(prestamo9);
					lista.add(prestamo10);

					System.out.println("✅ Registro exitoso");

					break;

				case 2:
					System.out.print("Ingrese el nombre del banco: ");
					lec = new Scanner(System.in);
					nombreBanco = lec.nextLine();

					System.out.print("Ingrese el nombre del cliente: ");
					lec = new Scanner(System.in);
					nombreCliente = lec.nextLine();

					System.out.print("Ingrese los apellidos: ");
					lec = new Scanner(System.in);
					app = lec.nextLine();

					System.out.print("Ingrese la edad: ");
					lec = new Scanner(System.in);
					edad = lec.nextInt();

					System.out.print("Ingrese el sexo: ");
					lec = new Scanner(System.in);
					sexo = lec.nextLine(); 

					System.out.print("Ingrese el domicilio: ");
					lec = new Scanner(System.in);
					domicilio = lec.nextLine();

					System.out.print("Ingrese el tipo de préstamo: ");
					lec = new Scanner(System.in);
					tipoPrestamo = lec.nextLine();

					System.out.print("Ingrese el monto del préstamo: ");
					lec = new Scanner(System.in);
					montoPrestamo = lec.nextDouble();

					System.out.print("Ingrese el status: ");
					lec = new Scanner(System.in);
					status = lec.nextLine();

					banco = new Banco(nombreBanco, nombreCliente, app, edad, sexo, domicilio, tipoPrestamo,
							montoPrestamo, status);
					lista.add(banco);
					System.out.println("Se guardo el cliente " + banco.getNombreCliente() + " exitosamente!");
					break;

				case 3:
					System.out.println("📋 Clientes disponibles:\n " + lista);
					break;

				case 4:
					System.out.println("\n lista de Clientes disponibles");
					for (int i = 0; i < lista.size(); i++) {
						System.out.printf("\n [%d]" + lista.get(i).getNombreCliente(), i);
					}

					// lamda
//					IntStr7eam.range(0, lista.size()).forEach(i-> System.out.printf("[%d] %s%n",i,lista.get(i).getModelo()));

					System.out.println("\nSeleccione el indice del cliente a buscar: ");
					lec = new Scanner(System.in);
					indice = lec.nextInt();

					Banco bancoBuscar = lista.get(indice);
					System.out.println("Detalles del Cliente:\n" + bancoBuscar);
					break;

				case 5:
					System.out.println("\n lista de Clientes disponibles");
					for (int i = 0; i < lista.size(); i++) {
						System.out.printf("\n [%d]" + lista.get(i).getNombreCliente(), i);
					}

					System.out.println("\nSeleccione el indice del cliente a buscar: ");
					lec = new Scanner(System.in);
					indice = lec.nextInt();

					Banco bancoEditar = lista.get(indice);
					System.out.println("Se encontro el cliente a editar:\n" + bancoEditar);

					// Submenu de opciones
					do {
						System.out.println("Menu Editar");
						System.out.println("1.- Editar domicilio");
						System.out.println("2.- Editar tipo de prestamo[nomina // grupal]");
						System.out.println("3.- Editar tipo de status[pendiente de pago // agado]");
						System.out.println("4.- Regresar al menu principal");

						lec = new Scanner(System.in);
						subMenu = lec.nextInt();

						switch (subMenu) {
						case 1:
							System.out.println("Ingrese el nuevo domicilio: ");
							lec = new Scanner(System.in);
							domicilio = lec.nextLine();

							bancoEditar.setDomicilio(domicilio);
							lista.set(indice, bancoEditar);
							System.out.println("Se actualizo el domicilio");
							break;
						case 2:
							System.out.println("Ingrese el nuevo tipo de prestamo: ");
							lec = new Scanner(System.in);
							tipoPrestamo = lec.nextLine();

							bancoEditar.setTipoPrestamo(tipoPrestamo);
							lista.set(indice, bancoEditar);
							System.out.println("Se actualizo el nuevo tipo de prestamo");
							break;
						case 3:
							System.out.println("Ingrese el nuevo tipo de status: ");
							lec = new Scanner(System.in);
							status = lec.nextLine();

							bancoEditar.setStatus(status);
							lista.set(indice, bancoEditar);
							System.out.println("Se actualizo el nuevo tipo de status: ");
							break;
						case 4:
							System.out.println("Regresando...");
							break;
						default:
							break;
						}

					} while (subMenu < 4);
					break;

				case 6:
					System.out.println("\n lista de Clientes disponibles");
					for (int i = 0; i < lista.size(); i++) {
						System.out.printf("\n [%d]" + lista.get(i).getNombreCliente(), i);
					}

					System.out.println("\n⚠️ Seleccione el índice del cliente a eliminar: ");
					lec = new Scanner(System.in);
					indice = lec.nextInt();

					Banco bancoEliminar = lista.remove(indice);
					System.out.println("\n👤🚫 Detalles del Cliente que fue eliminado:\n" + bancoEliminar);
					break;
				case 7:
					System.out.println("Cerrar Sesión 🚪👋");
					break;
				default:
					break;
				}
			}
		} while (menu != 7);
	}

}
