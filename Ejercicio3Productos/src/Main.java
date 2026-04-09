import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Productos producto1 = new Productos("Tienda Central", "Papas Fritas", "Sabritas", "Sal", 45.0, 100, 15.50);
		Productos producto2 = new Productos("Super Mercado", "Refresco", "Coca-Cola", "Original", 600.0, 50, 18.00);
		Productos producto3 = new Productos("Tienda Central", "Galletas", "Gamesa", "Chocolate", 100.0, 30, 12.00);
		Productos producto4 = new Productos("Mini Super", "Jugo de Naranja", "Del Valle", "Naranja", 500.0, 20, 22.50);
		Productos producto5 = new Productos("Tienda Central", "Yogurt", "Lala", "Fresas", 125.0, 40, 9.50);
		Productos producto6 = new Productos("Abarrotes Luis", "Leche Entera", "Alpura", "Natural", 1000.0, 15, 26.00);
		Productos producto7 = new Productos("Super Mercado", "Pan de Caja", "Bimbo", "Blanco", 680.0, 12, 45.00);
		Productos producto8 = new Productos("Tienda Central", "Chocolate", "Hershey's", "Amargo", 40.0, 60, 21.00);
		Productos producto9 = new Productos("Mini Super", "Agua Mineral", "Peñafiel", "Limón", 600.0, 25, 16.00);
		Productos producto10 = new Productos("Abarrotes Luis", "Cereal", "Kellogg's", "Maíz", 500.0, 10, 55.50);

		// Creando la lista
		List<Productos> listaDeProductos = new ArrayList<Productos>();
		listaDeProductos.add(producto1);
		listaDeProductos.add(producto2);
		listaDeProductos.add(producto3);
		listaDeProductos.add(producto4);
		listaDeProductos.add(producto5);
		listaDeProductos.add(producto6);
		listaDeProductos.add(producto7);
		listaDeProductos.add(producto8);
		listaDeProductos.add(producto9);
		listaDeProductos.add(producto10);

		// lista de productos
		for (Productos productos : listaDeProductos) {
			System.out.println("Lista de " + productos);
		}

		// Busqueda de producto
		Productos productoBuscar = null;
		productoBuscar = listaDeProductos.get(4);
		System.out.println("\n\n\nSe encontro el producto: " + productoBuscar);

		// Editar producto
		Productos productoEditar = null;
		productoEditar = listaDeProductos.get(9);
		productoEditar.setCantidad(20);
		productoEditar.setPrecioVenta(50.00);
		productoEditar.setSabor("Avena");
		listaDeProductos.set(9, productoEditar);
		System.out.println("Lista editada: \n" + listaDeProductos);

		// Remover producto
//		listaDeProductos.remove(3);
//		listaDeProductos.remove(7);
//		System.out.println("Lista editada: \n" + listaDeProductos);

		System.out.println("\n\n");
		// Buscar por nombre
		for (int i = 0; i < listaDeProductos.size(); i++) {
			if (listaDeProductos.get(i).getNombre().equalsIgnoreCase("Chocolate")) {
				System.out.println("Se encontro el nombre: " + listaDeProductos.get(i));
				break;
			} else {
				continue;
//				System.out.println("No existe el nombre del producto");
			}

		}

		System.out.println("\n\n");

		// Buscar por marca
		for (Productos e : listaDeProductos) {
			if (e.getMarca().equalsIgnoreCase("Coca-Cola") || e.getMarca() == "Coca-Cola") {
				System.out.println("Se encontro la marca: " + e);
			}

		}

		System.out.println("\n\n");

		// Buscar por sabor
		var buscarSabor = listaDeProductos.stream().filter(a -> a.getSabor() == "Fresas").findFirst();
		System.out.println("Se encontro el sabor: " + buscarSabor);

//		listaDeProductos.forEach(a -> {
//			System.out.println("Lista de sabor: " + a.getSabor());
//		});

		System.out.println("\n\n");

		// Contar Marca
		Map<String, Long> contadorDeMarcas = listaDeProductos.stream()
				.collect(Collectors.groupingBy(Productos::getMarca, Collectors.counting())); // Collectors.counting
																								// entrega un valor de
																								// 64 bits por eso se
																								// usa Long
		System.out.println("Marca por depto: " + contadorDeMarcas);
		
		

		System.out.println("\n\n");

		
		
		// Iterator
		Iterator<Productos> iterador = listaDeProductos.iterator();
		while (iterador.hasNext()) {
			Productos intarandoTiendas = iterador.next();
			if(intarandoTiendas.getNombreTienda().equalsIgnoreCase("Mini Super")) {
				System.out.println("Se encontro la tienda: " + intarandoTiendas);
				break;
			}else {
				continue;
			}
			
		}
	}

}
