package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

import java.util.Scanner;

public class ZonaFitApp {
    public static void main(String[] args) {
        zonaFitApp();
    }
    private static void zonaFitApp(){
        var salir = false;
        var console = new Scanner(System.in);
        // Creamos un objeto de la clase clienteDAO
        IClienteDAO clienteDao = new ClienteDAO();
        while (!salir){
            try {
                var opcion = mostrarMenu(console);
                salir = ejecutarOpciones(console, opcion, clienteDao);
            } catch (Exception e) {
                System.out.println("Error al ejecutar opcioens" + e.getMessage());
            }
            System.out.println();
        }
    }

    private static int mostrarMenu(Scanner console){
        System.out.print("""
                *** Zona Fit (GYM) ***
                1. Listar Clientes
                2. Buscar Cliente 
                3. Agregar Cliente
                4. Modificar Cliente
                5. Eliminar Cliente
                6. Salir 
                Selecciona una opción:\s""");
        return Integer.parseInt(console.nextLine());
    }

    private static boolean ejecutarOpciones(Scanner console, int opcion,
                                            IClienteDAO clienteDAO){
        var salir = false;
        switch (opcion){
            case 1 -> { // Listar clientes
                System.out.println("--- Listado de clientes ---");
                var clientes = clienteDAO.listarClientes();
                clientes.forEach(System.out::println);

            }
            case 2 -> { // Buscar cliente por 'id'
                System.out.print("Introduce el id del Cliente a buscar: ");
                var idCliente = Integer.parseInt(console.nextLine());
                var cliente = new Cliente(idCliente);
                var encontrado = clienteDAO.buscarClientePorId(cliente);
                if (encontrado){
                    System.out.println("Cliente encontrado: " + cliente);
                } else {
                    System.out.println("Cliente no encontrado: " + cliente);
                }
            }
            case 3 -> { // Agregar cliente
                System.out.println("--- Agregar cliente ---");
                System.out.print("Nombre: ");
                var nombre = console.nextLine();
                System.out.print("Apellido: ");
                var apellido = console.nextLine();
                System.out.print("Membresia: ");
                var membresia = Integer.parseInt(console.nextLine());
                // Creamos el objeto cliente (sin id)
                var cliente = new Cliente(nombre, apellido, membresia);
                var agregado = clienteDAO.agregarCliente(cliente);
                if(agregado){
                    System.out.println("Cliente agregado: " + cliente);
                } else {
                    System.out.println("Cliente no agregado: " + cliente);
                }
            }
            case 4 -> { // Modificar un cliente existente
                System.out.println("--- Modificar Cliente ---");
                System.out.print("Id Cliente: ");
                var idCliente = Integer.parseInt(console.nextLine());
                System.out.print("Nombre: ");
                var nombreCliente = console.nextLine();
                System.out.print("Apellido: ");
                var apellidoCliente = console.nextLine();
                System.out.print("Membresia: ");
                var membresiaCliente = Integer.parseInt(console.nextLine());
                // Creamos objeto a modificar
                var cliente = new Cliente(idCliente, nombreCliente, apellidoCliente, membresiaCliente);
                var modificado = clienteDAO.modificarCliente(cliente);
                if (modificado){
                    System.out.println("Cliente modificado: " + cliente);
                } else {
                    System.out.println("Cliente no modificado: " + cliente);
                }

            }
            case 5 -> { // Eliminar Cliente
                System.out.println("--- Eliminar Cliente ---");
                System.out.print("Id Cliente: ");
                var idCliente = Integer.parseInt(console.nextLine());
                var cliente = new Cliente(idCliente);
                var eliminado = clienteDAO.eliminarCliente(cliente);
                if (eliminado){
                    System.out.println("Cliente eliminado: " + cliente);
                } else {
                    System.out.println("Cliente NO eliminado: " + cliente);
                }

            }
            case 6 -> { // Salir
                System.out.println("Hasta la proxima !");
                salir = true;
            }
            default -> System.out.println("Opción no reconocida: " + opcion);
        }
        return salir;
    }

}
