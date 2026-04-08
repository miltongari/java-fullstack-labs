
public class Principal {

	public static void main(String[] args) {
		// instancia de clases y asignacion de valores
//		Computadoras compu = new Computadoras("HP", "2025", "negro", "1024", 35, 1800);
//		Computadoras compu = new Computadoras();
//
//		compu.marca = "HP";
//		compu.modelo = "2025";
//		compu.color = "negro";
//		compu.capacidad = "1024";
//		compu.cantidad = 35;
//		compu.precio = 1800;
//
//		System.out.println("Marca: " + compu.marca);
//		System.out.println("Modelo: " + compu.modelo);
//		System.out.println("Color: " + compu.color);
//		System.out.println("Capacidad: " + compu.capacidad);
//		System.out.println("Cantidad: " + compu.cantidad);
//		System.out.println("Precio: " + compu.precio);

		// instancia de clases utilizando el encapsulamiento --> GET y SET
		System.out.println("\n");

		Computadoras compu1 = new Computadoras();
		compu1.setMarca("HP");
		compu1.setModelo("2024");
		compu1.setColor("Azul");
		compu1.setCapacidad("2048");
		compu1.setCantidad(12);
		compu1.setPrecio(2000);

		// GET para obtener
//		System.out.println("Marca: " + compu1.getMarca());
//		System.out.println("Modelo: " + compu1.getModelo());
//		System.out.println("Color: " + compu1.getColor());
//		System.out.println("Capacidad: " + compu1.getCapacidad());
//		System.out.println("Cantidad: " + compu1.getCantidad());
//		System.out.println("Precio: " + compu1.getPrecio());
		
		//Instancias de clases utilizando un constructor con parametros
		Computadoras compu2 = new Computadoras();
		Computadoras compu3 = null;
		//Computadoras compu5;
		
		//inicializar un objeto y sus valores
		compu3 = new Computadoras("ACER", "2020", "rojo", "3023", 12, 930);
		System.out.println("La computadora: "+ compu3);
	}

}
