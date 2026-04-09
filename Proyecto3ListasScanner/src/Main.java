import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
			System.out.println("\nAutos On-line");
			System.out.println("🚗 1.- Alta de autos");
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
					Autos auto1 = new Autos("Porsche", "911 Carrera", "Negro", "Automático", "Alemania", 1, 2024,
							120000.00);
					Autos auto2 = new Autos("Ford", "Explorer", "Azul Marino", "Automático", "EE. UU.", 1, 2023,
							45000.00);
					Autos auto3 = new Autos("Tesla", "Model 3", "Rojo", "Automático", "EE. UU.", 1, 2024, 38500.00);
					Autos auto4 = new Autos("Fiat", "500", "Amarillo", "Estándar", "Italia", 1, 2022, 18000.00);
					Autos auto5 = new Autos("Nissan", "Frontier", "Gris Oxford", "Estándar", "México", 1, 2024,
							32000.00);

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
					System.out.println("Cerrar Sesión 🚪👋");
					break;

				default:
					break;
				}
			}

		} while (menu != 7);

	}

}
