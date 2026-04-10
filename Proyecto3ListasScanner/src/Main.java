import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String marca;
		String modelo;
		String color;
		String tipoAuto;
		String paisOrigen;
		int status;
		int anioEstreno;
		double precio;
		// instanciar la clase autos
		Autos auto = null;

		// crear el objeto Scanner --> para entrada de datos por teclado
		Scanner lec = null;

		// Crear la lista
		List<Autos> lista = new ArrayList<Autos>();

		// Crear variable de almacenamiento
		int menu, subMenu, indice;

		do {
			System.out.println("\n\n");
			System.out.println("\n🚗 Autos On-line");
			System.out.println("➕ 1.- Alta de autos");
			System.out.println("💾 2.- Guardar");
			System.out.println("📋 3.- Listar");
			System.out.println("🔍 4.- Buscar");
			System.out.println("📝 5.- Editar");
			System.out.println("🗑️ 6.- Eliminar");
			System.out.println("📍 7.- Ver posición en la lista");
			System.out.println("🏎️ 8.- Buscar por marca --> for");
			System.out.println("📅 9.- Buscar por Modelo --> forEach");
			System.out.println("🎨 10.- Buscar por color --> lambda");
			System.out.println("🔄 11.- Buscar con iterador i");
			System.out.println("❌ 12.- Eliminar por modelo");
			System.out.println("⚡ 13.- Eliminar por lambda");
			System.out.println("🧨 14.- ¡Eliminar todo!");
			System.out.println("🔢 15.- Contar autos por marca");
			System.out.println("📊 16.- Ordenar autos por cantidad (ASC)");
			System.out.println("🚪 17.- Cerrar Sesión");

			lec = new Scanner(System.in);
			menu = lec.nextInt();

			if (menu < 1 || menu > 17) {
				System.out.println("\n ✨ Seleccione una opción del menú!");
			} else {
				switch (menu) {
				case 1:
					Autos auto1 = new Autos("Porsche", "911 Carrera", "Negro", "Automático", "Alemania", 1, 2024,
							120000.00);
					Autos auto2 = new Autos("Ford", "Explorer", "Azul Marino", "Automático", "EE. UU.", 1, 2023,
							45000.00);
					Autos auto3 = new Autos("Tesla", "Model 3", "Rojo", "Automático", "EE. UU.", 13, 2024, 38500.00);
					Autos auto4 = new Autos("Fiat", "500", "Amarillo", "Estándar", "Italia", 12, 2022, 18000.00);
					Autos auto5 = new Autos("Nissan", "Frontier", "Negro", "Estándar", "México", 15, 2024, 32000.00);

					lista.add(auto1);
					lista.add(auto2);
					lista.add(auto3);
					lista.add(auto4);
					lista.add(auto5);

					System.out.println("✅ Registro exitoso");
					break;
				case 2:

					System.out.print("Ingrese la marca: ");
					lec = new Scanner(System.in);
					marca = lec.nextLine();

					System.out.print("Ingrese el modelo: ");
					lec = new Scanner(System.in);
					modelo = lec.nextLine();

					System.out.print("Ingrese el color: ");
					lec = new Scanner(System.in);
					color = lec.nextLine();

					System.out.print("Ingrese el tipo de auto: ");
					lec = new Scanner(System.in);
					tipoAuto = lec.nextLine();

					System.out.print("Ingrese el país de origen: ");
					lec = new Scanner(System.in);
					paisOrigen = lec.nextLine();

					System.out.print("Ingrese el status del auto: [1.- Disponible//0.- Agotado]");
					lec = new Scanner(System.in);
					status = lec.nextInt();

					System.out.print("Ingrese el año de estreno: ");
					lec = new Scanner(System.in);
					anioEstreno = lec.nextInt();

					System.out.print("Ingrese el precio del auto: ");
					lec = new Scanner(System.in);
					precio = lec.nextDouble();

					// Inicializar un objeto y sus valores
					/*
					 * -->ambitos-->Singleton-->crear una unica instancia del core par ano estar
					 * inicizando objeto
					 * 
					 */
					auto = new Autos(marca, modelo, color, tipoAuto, paisOrigen, status, anioEstreno, precio);
					lista.add(auto);
					System.out.println("Se guardo el auto " + auto.getMarca() + " exitosamente!");

					break;
				case 3:
					System.out.println("📋 Autos disponibles: " + lista);
					break;
				case 4:
					System.out.println("\n lista de autos disponibles");
					for (int i = 0; i < lista.size(); i++) {
						System.out.printf("\n [%d]" + lista.get(i).getModelo(), i);
					}

					// lamda
//					IntStr7eam.range(0, lista.size()).forEach(i-> System.out.printf("[%d] %s%n",i,lista.get(i).getModelo()));

					System.out.println("\nSeleccione el indice el auto a buscar: ");
					lec = new Scanner(System.in);
					indice = lec.nextInt();

					Autos autoBuscar = lista.get(indice);
					System.out.println("Detalles del auto:\n" + autoBuscar);
					break;
				case 5:
					System.out.println("\n lista de autos disponibles");
					for (int i = 0; i < lista.size(); i++) {
						System.out.printf("\n [%d]" + lista.get(i).getModelo(), i);
					}

					System.out.println("\nSeleccione el indice el auto a buscar: ");
					lec = new Scanner(System.in);
					indice = lec.nextInt();

					Autos autoEditar = lista.get(indice);
					System.out.println("Se encontro el auto a editar:\n" + autoEditar);

					// Submenu de opciones
					do {
						System.out.println("Menu Editar");
						System.out.println("1.- Editar marca");
						System.out.println("2.- Editar modelo");
						System.out.println("3.- Regresar al menu principal");

						lec = new Scanner(System.in);
						subMenu = lec.nextInt();

						switch (subMenu) {
						case 1:
							System.out.println("Ingrese la nueva marca: ");
							lec = new Scanner(System.in);
							marca = lec.nextLine();

							autoEditar.setMarca(marca);
							lista.set(indice, autoEditar);
							System.out.println("Se actualizo la marca");
							break;
						case 2:
							System.out.println("Ingrese el nuevo modelo: ");
							lec = new Scanner(System.in);
							modelo = lec.nextLine();

							autoEditar.setModelo(modelo);
							lista.set(indice, autoEditar);
							System.out.println("Se actualizo el modelo");
							break;
						case 3:
							System.out.println("Regresando...");
							break;
						default:
							System.out.println("Opcion no valida");
							break;
						}

					} while (subMenu < 3);

					break;
				case 6:
					System.out.println("\n lista de autos disponibles");
					for (int i = 0; i < lista.size(); i++) {
						System.out.printf("\n [%d]" + lista.get(i).getModelo(), i);
					}

					// lamda
//					IntStr7eam.range(0, lista.size()).forEach(i-> System.out.printf("[%d] %s%n",i,lista.get(i).getModelo()));

					System.out.println("\nSeleccione el indice el auto a buscar: ");
					lec = new Scanner(System.in);
					indice = lec.nextInt();

					Autos autoEliminar = lista.remove(indice);
					System.out.println("Detalles del auto eliminado:\n" + autoEliminar);
					break;

				case 7:
					System.out.println("\n lista de autos disponibles");
					for (int i = 0; i < lista.size(); i++) {
						System.out.printf("\n [%d]" + lista.get(i).getModelo(), i);
					}
					break;

				case 8:
					System.out.println("Ingrese la marca del auto a buscar: ");
					lec = new Scanner(System.in);
					String marcaBuscar = lec.nextLine();
					for (int i = 0; i < lista.size(); i++) {
						if (lista.get(i).getMarca().equalsIgnoreCase(marcaBuscar)) {
							System.out.println("Auto disponible por marca" + lista.get(i));
							break;
						} else if (i > lista.size()) {
							System.out.println("No manejamos la marca de auto");

						} else {
							continue;
						}
					}
					break;
				case 9:
					System.out.println("Ingrese la marca del auto a buscar: ");
					lec = new Scanner(System.in);
					String modeloBuscar = lec.nextLine();
					for (Autos e : lista) {
						if (e.getModelo().equalsIgnoreCase(modeloBuscar)) {
							System.out.println("Se encontro el auto por modelo" + e);
						} else {
							System.out.println("No existe el auto a buscar");
						}
					}
					break;
				case 10:
					System.out.println("Ingrese la marca del auto a buscar: ");
					lec = new Scanner(System.in);
					String colorBuscar = lec.nextLine();
					var autoColorBuscar = lista.stream().filter(a -> a.getColor().equalsIgnoreCase(colorBuscar))
							.toList();
					System.out.println("Se encontro el auto por color: " + autoColorBuscar);
					break;
				case 11:

					break;
				case 12:
					System.out.println("Ingrese el modelo del auto a eliminar: ");
					lec = new Scanner(System.in);
					String marcaEliminar = lec.nextLine();
					for (int i = 0; i < lista.size(); i++) {
						if (lista.get(i).getMarca().equalsIgnoreCase(marcaEliminar)) {
							System.out.println("Auto eliminado: " + lista.remove(i));
							break;
						}

						else {
							System.out.println("No se elimino el auto");
						}
					}
					break;
				case 13:
					System.out.println("Ingrese el modelo del auto a buscar: ");
					lec = new Scanner(System.in);
					String modeloEliminar = lec.nextLine();

					Boolean modeloEliminarBolean = lista.removeIf(a -> a.getModelo().equalsIgnoreCase(modeloEliminar));
					if (modeloEliminarBolean == true) {
						System.out.println("Se elimino");
					} else {
						System.out.println("No existe el auto a eliminar");
					}
					break;
				case 14:
					System.out.println("Desea eliminar todo?, no se va a revertir");
					lec = new Scanner(System.in);
					String si = lec.nextLine();
					if (si.equals("si")) {
						lista.clear();
						System.out.println("Se elimino todo");
					} else {
						System.out.println("Proceso cancelado!");
					}
					break;
				case 15:
					Map<String, Long> contadorAutoMarca = lista.stream()
							.collect(Collectors.groupingBy(Autos::getMarca, Collectors.counting()));
					System.out.println("Cantidad de autos por marca: " + contadorAutoMarca);
					break;
				case 16:
					lista.stream().sorted((a,b)-> Integer.compare(a.getStatus(), b.getStatus())).forEach(System.out::println);
					break;
				case 17:
					System.out.println("Cerrar Sesión 🚪👋");
					break;

				default:
					break;
				}
			}

		} while (menu != 17);

	}

}
