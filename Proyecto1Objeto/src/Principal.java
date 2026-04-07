
public class Principal {

	public static void main(String[] args) {
		// instancia de clases y asignacion de valores
//		Computadoras compu = new Computadoras("HP", "2025", "negro", "1024", 35, 1800);
		Computadoras compu = new Computadoras();

		compu.marca = "HP";
		compu.modelo = "2025";
		compu.color = "negro";
		compu.capacidad = "1024";
		compu.cantidad = 35;
		compu.precio = 1800;

		System.out.println("Marca: " + compu.marca);
		System.out.println("Modelo: " + compu.modelo);
		System.out.println("Color: " + compu.color);
		System.out.println("Capacidad: " + compu.capacidad);
		System.out.println("Cantidad: " + compu.cantidad);
		System.out.println("Precio: " + compu.precio);

	}

}
