import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String matricula;
        String nombre;
        String apellido;
        int edad;
        String sexo;
        String gradoGrupo;
        String correo;
        String telefono;

        // instanciar la clase autos
        Alumno alumno = null;

        // crear el objeto Scanner --> para entrada de datos por teclado
        Scanner lec = null;

        // Crear la lista
        List<Alumno> lista = new ArrayList<Alumno>();

        // Crear variable de almacenamiento
        int menu, subMenu, indice;

        do {
            System.out.println("\n--- 🎓 Sistema de Control Escolar 🎓 ---");
            System.out.println("1.- 📝 Alta de Alumnos");
            System.out.println("2.- 💾 Guardar Información");
            System.out.println("3.- 📋 Listar Alumnado");
            System.out.println("4.- 🔍 Buscar Alumno");
            System.out.println("5.- ⚙️ Editar Registro");
            System.out.println("6.- ❌ Eliminar Alumno");
            System.out.println("7.- 📍 Ver posición en la lista");
            System.out.println("8.- 👤 Buscar por Nombre (Loop for)");
            System.out.println("9.- 🏷️ Buscar por Apellido (forEach)");
            System.out.println("10.- 🎂 Buscar por Edad (Lambda)");
            System.out.println("11.- 🚻 Buscar por Sexo (Iterator)");
            System.out.println("12.- 🗑️ Eliminar por Nombre");
            System.out.println("13.- 🧹 Eliminar por Apellido (Lambda)");
            System.out.println("14.- ⚠️ ¡Eliminar toda la lista!");
            System.out.println("15.- 📊 Contar Alumnos por Grado y Grupo");
            System.out.println("16.- 🔢 Ordenar por Matrícula (ASC)");
            System.out.println("17.- 🚪 Cerrar Sesión");

            lec = new Scanner(System.in);
            menu = lec.nextInt();

            if (menu < 1 || menu > 17) {
                System.out.println("\n ✨ Seleccione una opción del menú!");
            } else {
                switch (menu) {
                    case 1:
                        Alumno alumno1 = new Alumno("2024001", "Sofía", "García", 19, "Femenino", "4º A",
                                "sofia.garcia@mail.com", "555-0101");
                        Alumno alumno2 = new Alumno("2024002", "Mateo", "Rodríguez", 20, "Masculino", "4º B",
                                "mateo.rod@mail.com", "555-0102");
                        Alumno alumno3 = new Alumno("2024003", "Valentina", "Martínez", 18, "Femenino", "2º C",
                                "val.martinez@mail.com", "555-0103");
                        Alumno alumno4 = new Alumno("2024004", "Santiago", "López", 21, "Masculino", "6º A",
                                "santi.lopez@mail.com", "555-0104");
                        Alumno alumno5 = new Alumno("2024005", "Isabella", "González", 19, "Femenino", "4º A",
                                "isa.gonzalez@mail.com", "555-0105");
                        Alumno alumno6 = new Alumno("2024006", "Sebastián", "Pérez", 22, "Masculino", "8º B",
                                "seb.perez@mail.com", "555-0106");
                        Alumno alumno7 = new Alumno("2024007", "Camila", "Sánchez", 18, "Femenino", "2º A",
                                "camila.san@mail.com", "555-0107");
                        Alumno alumno8 = new Alumno("2024008", "Leonardo", "Ramírez", 20, "Masculino", "4º C",
                                "leo.ramirez@mail.com", "555-0108");
                        Alumno alumno9 = new Alumno("2024009", "Lucía", "Torres", 19, "Femenino", "4º B",
                                "lucia.torres@mail.com", "555-0109");
                        Alumno alumno10 = new Alumno("2024010", "Diego", "Flores", 21, "Masculino", "6º B",
                                "diego.flores@mail.com", "555-0110");

                        lista.add(alumno1);
                        lista.add(alumno2);
                        lista.add(alumno3);
                        lista.add(alumno4);
                        lista.add(alumno5);
                        lista.add(alumno6);
                        lista.add(alumno7);
                        lista.add(alumno8);
                        lista.add(alumno9);
                        lista.add(alumno10);

                        System.out.println("✅ Registro exitoso");
                        break;
                    case 2:

                        System.out.print("Ingrese la matrícula: ");
                        lec = new Scanner(System.in);
                        matricula = lec.nextLine();

                        System.out.print("Ingrese el nombre: ");
                        lec = new Scanner(System.in);
                        nombre = lec.nextLine();

                        System.out.print("Ingrese el apellido: ");
                        lec = new Scanner(System.in);
                        apellido = lec.nextLine();

                        System.out.print("Ingrese la edad: ");
                        lec = new Scanner(System.in);
                        edad = lec.nextInt();

                        System.out.print("Ingrese el sexo: ");
                        lec = new Scanner(System.in);
                        sexo = lec.nextLine();

                        System.out.print("Ingrese el grado y grupo: ");
                        lec = new Scanner(System.in);
                        gradoGrupo = lec.nextLine();

                        System.out.print("Ingrese el correo electrónico: ");
                        lec = new Scanner(System.in);
                        correo = lec.nextLine();

                        System.out.print("Ingrese el teléfono: ");
                        lec = new Scanner(System.in);
                        telefono = lec.nextLine();

                        // Inicializar un objeto y sus valores
                        /*
                         * -->ambitos-->Singleton-->crear una unica instancia del core par ano estar
                         * inicizando objeto
                         * 
                         */
                        alumno = new Alumno(matricula, nombre, apellido, edad, sexo, gradoGrupo, correo, telefono);
                        lista.add(alumno);
                        System.out.println("Se guardo el alumno " + alumno.getNombre() + " exitosamente!");

                        break;
                    case 3:
                        System.out.println("📋 Alumnos disponibles: " + lista);
                        break;
                    case 4:
                        System.out.println("\n lista de alumnos disponibles");
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.printf("\n [%d]" + lista.get(i).getNombre(), i);
                        }

                        // lamda
                        // IntStr7eam.range(0, lista.size()).forEach(i-> System.out.printf("[%d]
                        // %s%n",i,lista.get(i).getModelo()));

                        System.out.println("\nSeleccione el indice del alumno a buscar: ");
                        lec = new Scanner(System.in);
                        indice = lec.nextInt();

                        Alumno alumnoBuscar = lista.get(indice);
                        System.out.println("Detalles del alumno:\n" + alumnoBuscar);
                        break;
                    case 5:
                        System.out.println("\n lista de alumnos disponibles");
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.printf("\n [%d]" + lista.get(i).getNombre(), i);
                        }

                        System.out.println("\nSeleccione el indice del alumno a editar: ");
                        lec = new Scanner(System.in);
                        indice = lec.nextInt();

                        Alumno alumnoEditar = lista.get(indice);
                        System.out.println("Se encontro el alumno a editar:\n" + alumnoEditar);

                        // Submenu de opciones
                        do {
                            System.out.println("Menu Editar");
                            System.out.println("1.- Editar Grado y Grupo");
                            System.out.println("2.- Editar Correo");
                            System.out.println("3.- Editar Telefono");
                            System.out.println("4.- Regresar al menu principal");

                            lec = new Scanner(System.in);
                            subMenu = lec.nextInt();

                            switch (subMenu) {
                                case 1:
                                    System.out.println("Ingrese el nuevo grado y grupo: ");
                                    lec = new Scanner(System.in);
                                    gradoGrupo = lec.nextLine();

                                    alumnoEditar.setGradoGrupo(gradoGrupo);
                                    lista.set(indice, alumnoEditar);
                                    System.out.println("Se actualizo el grado y el grupo");
                                    break;
                                case 2:
                                    System.out.println("Ingrese el nuevo correo: ");
                                    lec = new Scanner(System.in);
                                    correo = lec.nextLine();

                                    alumnoEditar.setCorreo(correo);
                                    lista.set(indice, alumnoEditar);
                                    System.out.println("Se actualizo el correo");
                                    break;
                                case 3:
                                    System.out.println("Ingrese el nuevo telefono: ");
                                    lec = new Scanner(System.in);
                                    telefono = lec.nextLine();

                                    alumnoEditar.setTelefono(telefono);
                                    lista.set(indice, alumnoEditar);
                                    System.out.println("Se actualizo el telefono");
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
                        System.out.println("\n lista de alumnos disponibles");
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.printf("\n [%d]" + lista.get(i).getNombre(), i);
                        }

                        // lamda
                        // IntStr7eam.range(0, lista.size()).forEach(i-> System.out.printf("[%d]
                        // %s%n",i,lista.get(i).getModelo()));

                        System.out.println("\nSeleccione el indice del alumno a buscar: ");
                        lec = new Scanner(System.in);
                        indice = lec.nextInt();

                        Alumno alumnoEliminar = lista.remove(indice);
                        System.out.println("Detalles del alumno eliminado:\n" + alumnoEliminar);
                        break;

                    case 7:
                        System.out.println("\n lista de alumnos disponibles");
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.printf("\n [%d]" + lista.get(i).getNombre(), i);
                        }
                        break;

                    case 8:
                        System.out.println("Ingrese la marca del auto a buscar: ");
                        lec = new Scanner(System.in);
                        String nombreBuscar = lec.nextLine();
                        for (int i = 0; i < lista.size(); i++) {
                            if (lista.get(i).getNombre().equalsIgnoreCase(nombreBuscar)) {
                                System.out.println("Alumno disponible por nombre" + lista.get(i));
                                break;
                            } else {
                                System.out.println("No existe el alumno");
                            }
                        }
                        break;
                    case 9:
                        System.out.println("Ingrese el apellido del alumno a buscar: ");
                        lec = new Scanner(System.in);
                        String appellidoBuscar = lec.nextLine();
                        for (Alumno e : lista) {
                            if (e.getApellido().equalsIgnoreCase(appellidoBuscar)) {
                                System.out.println("Se encontro el apellido del alumno: " + e);
                            } else {
                                System.out.println("No existe el alumno");
                            }
                        }
                        break;
                    case 10:
                        System.out.println("Ingrese la edad del alumno: ");
                        lec = new Scanner(System.in);
                        String edadInput = lec.nextLine();
                        int edadBuscar = Integer.parseInt(edadInput);
                        var alumnosEncontrados = lista.stream().filter(a -> a.getEdad() == edadBuscar)
                                .toList();
                        if (alumnosEncontrados.isEmpty()) {
                            System.out.println("❌ No se encontraron alumnos con esa edad.");
                        } else {
                            System.out.println("✅ Alumnos encontrados: " + alumnosEncontrados);
                        }
                        break;
                    case 11:

                        System.out.println("Ingrese el sexo del alumno a buscar: ");
                        lec = new Scanner(System.in);
                        String alumnoSexo = lec.nextLine();
                        Iterator<Alumno> iterador = lista.iterator();
                        while (iterador.hasNext()) {
                            Alumno intarandoAlumnos = iterador.next();
                            if (intarandoAlumnos.getSexo().equalsIgnoreCase(alumnoSexo)) {
                                System.out.println("lista de sexo de los alunmno: " + intarandoAlumnos);
                            } else {
                                continue;
                            }
                        }
                        break;
                    case 12:
                        System.out.println("Ingrese el nombre del alumno a eliminar: ");
                        lec = new Scanner(System.in);
                        String alumnoBorrar = lec.nextLine();
                        for (int i = 0; i < lista.size(); i++) {
                            if (lista.get(i).getNombre().equalsIgnoreCase(alumnoBorrar)) {
                                System.out.println("Alumno eliminado: " + lista.remove(i));
                                break;
                            }

                            else {
                                System.out.println("No se elimino el auto");
                            }
                        }
                        break;
                    case 13:
                        System.out.println("Ingrese el apellido del alumno a eliminar: ");
                        lec = new Scanner(System.in);
                        String apellidoEliminar = lec.nextLine();

                        Boolean apellidoEliminarBolean = lista
                                .removeIf(a -> a.getApellido().equalsIgnoreCase(apellidoEliminar));
                        if (apellidoEliminarBolean == true) {
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
                        Map<String, Long> contadorGradoGrupo = lista.stream()
                                .collect(Collectors.groupingBy(Alumno::getGradoGrupo, Collectors.counting()));
                        System.out.println("Cantidad de Grados y Grupo: " + contadorGradoGrupo);
                        break;
                    case 16:
                        System.out.println("--- Alumnos ordenados por Matrícula ---");
                        lista.stream()
                                .sorted(Comparator.comparing(Alumno::getMatricula))
                                .forEach(System.out::println);
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
