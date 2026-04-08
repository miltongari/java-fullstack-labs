
public class Main {

	public static void main(String[] args) {
		Autos auto = new Autos();
		auto.marca = "Toyota";
		auto.modelo = "Corolla SE";
		auto.color = "Blanco Perlado";
		auto.cantidad = 4;
		auto.tipoAuto = "Sedan";
		auto.cantidad = 5;
		auto.precioVenta = 450000.50;

		Autos auto2 = null;
		auto2 = new Autos("Mazda", "CX-5 Grand Touring", "Rojo Brillante", 5, "SUV", 3, 620000.00);
		
		Autos auto3 = new Autos();
		auto3.setMarca("Volkswagen");
		auto3.setModelo("Golf GTI");
		auto3.setColor("Gris Platino");
		auto3.setNumPuertas(5);
		auto3.setTipoAuto("Hatchback");
		auto3.setCantidad(2);
		auto3.setPrecioVenta(710000.00);

		System.out.println(auto);
		System.out.println(auto2);
		System.out.println(auto3);

	}

}
