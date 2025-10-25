import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

      
        final ArrayList <Producto> productos = new ArrayList<>();
        final ArrayList <Categoria> categorias = new ArrayList<>();

        
        categorias.add(new Categoria("Vino tinto"));
        categorias.add(new Categoria("Vino blanco"));
        categorias.add(new Categoria("Vino espumante"));
        categorias.add(new Categoria("Vino Rosado"));
        categorias.add(new Categoria("Vino naranjo"));
        categorias.add(new Categoria("Vino Fortificado"));

       
        final CrudProductos crudProd = new CrudProductos(productos, categorias);
        final CrudCategorias crudCat = new CrudCategorias(categorias);

        int opcion;
        do {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1) CRUD de Productos (Vinos)");
            System.out.println("2) CRUD de Categorías");
            System.out.println("0) Salir");
            System.out.print("Opción: ");

            String linea = crudProd.scanner.nextLine();

            
            try {
                opcion = Integer.parseInt(linea.trim());
            } catch (NumberFormatException e) {
                opcion = -1;
            }

            switch (opcion) {
                case 1 -> {
                    int op;
                    do {
                        crudProd.mostrarOpciones();
                        op = crudProd.leerEntero("");
                        switch (op) {
                            case 1 -> crudProd.crear();
                            case 2 -> crudProd.listar();
                            case 3 -> crudProd.actualizar();
                            case 4 -> crudProd.eliminar();
                            case 0 -> System.out.println("Volviendo al menú principal...");
                            default -> System.out.println("Opción inválida");
                        }
                    } while (op != 0);
                }

                case 2 -> {
                    int op;
                    do {
                        crudCat.mostrarOpciones();
                        op = crudCat.leerEntero("");
                        switch (op) {
                            case 1 -> crudCat.crear();
                            case 2 -> crudCat.listar();
                            case 3 -> crudCat.actualizar();
                            case 4 -> crudCat.eliminar();
                            case 0 -> System.out.println("Volviendo al menú principal...");
                            default -> System.out.println("Opción inválida");
                        }
                    } while (op != 0);
                }

                case 0 -> System.out.println("¡Gracias por utilizar nuestro sistema!");
                default -> System.out.println("Opción inválida");
            }

        } while (opcion != 0);

    }

}
