import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Celular celular1 = new Celular("Apple", "iPhone 15 Pro", "Titanio Natural", "iOS", 12, 1199.0, "EE.UU.",
				"Apple Store");
		Celular celular2 = new Celular("Samsung", "Galaxy S24 Ultra", "Titanium Black", "Android 14", 8, 1299.99,
				"Corea del Sur", "Samsung Store");
		Celular celular3 = new Celular("Xiaomi", "Redmi Note 13 Pro", "Midnight Black", "Android 13", 25, 350.0,
				"China", "Amazon");
		Celular celular4 = new Celular("Google", "Pixel 8 Pro", "Bay Blue", "Android 14", 5, 999.0, "EE.UU.",
				"Google Store");
		Celular celular5 = new Celular("Motorola", "Edge 40 Neo", "Caneel Bay", "Android 13", 15, 420.50, "EE.UU.",
				"Mercado Libre");
		Celular celular6 = new Celular("Huawei", "P60 Pro", "Rococo Pearl", "EMUI 13", 10, 899.0, "China",
				"Huawei Shop");
		Celular celular7 = new Celular("Sony", "Xperia 1 V", "Khaki Green", "Android 13", 3, 1100.0, "Japón",
				"Sony Store");

		// Creando lista
		List<Celular> lista = new ArrayList<Celular>();
		lista.add(celular1);
		lista.add(celular2);
		lista.add(celular3);
		lista.add(celular4);
		lista.add(celular5);
		lista.add(celular6);
		lista.add(celular7);

		System.out.println("Lista de celulares creada: \n" + lista);

		// buscando un celular al cliente
		Celular celularCliente = null;
		celularCliente = lista.get(3);
		System.out.println("\n\nCelular encontrado: \n" + celularCliente);

		// Cambiando informacion a celular
		Celular celularChange = null;
		celularChange = lista.get(6);
		celularChange.setPrecio(9999.0);
		celularChange.setColor("Red");
		celularChange.setCantidad(1);
		System.out.println("\n\nLista actualizada de celulares: \n" + lista);

		// No hay stock en bodega, hay que eliminar celulares
		lista.remove(5);
		lista.remove(1);
		System.out.println("\n\nLista actualizada de celulares: \n" + lista);

	}

}
