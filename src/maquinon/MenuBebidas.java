import java.util.Scanner;

public class MenuBebidas {
    public static void main(String[] args) {
        Bebidas bebidas = new Bebidas();
        Precios precios = new Precios();

        bebidas.agregarBebida("A", "Café", 2.5);
        bebidas.agregarBebida("B", "Té", 1.8);
        bebidas.agregarBebida("C", "Galletas", 1.0);
        bebidas.agregarBebida("D", "Sandwich", 4.5);

        precios.agregarPrecio("A", 2.5);
        precios.agregarPrecio("B", 1.8);
        precios.agregarPrecio("C", 1.0);
        precios.agregarPrecio("D", 4.5);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----- Menú de Precios de Bebidas -----");
            System.out.println("1. Mostrar información de una bebida");
            System.out.println("2. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el código de la bebida: ");
                    String codigo = scanner.next();

                    String nombre = bebidas.getNombre(codigo);
                    double precio = precios.getPrecio(codigo);

                    if (nombre != null) {
                        System.out.println("Bebida: " + nombre);
                        System.out.println("Precio: $" + precio);
                    } else {
                        System.out.println("Código inválido.");
                    }

                    break;
                case 2:
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        }
    }
}

