package gm.zona_fit;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.IClienteServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.BlockingDeque;

@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner {

	@Autowired
	private IClienteServicio clienteServicio;

	private static final Logger logger = LoggerFactory.getLogger(ZonaFitApplication.class);

	String nl = System.lineSeparator(); // Obtener caracter de salto de linea

	public static void main(String[] args) {
		logger.info("Iniciando la aplicación");
		SpringApplication.run(ZonaFitApplication.class, args);
		logger.info("Aplicación finalizada...");
	}

	@Override
	public void run(String... args) throws Exception { //  Metodo que se ejecuta en la fabrica de Spring de manera automatica
		zonaFitApp();
	}

	private void zonaFitApp(){ // Todo lo relacionado con nuestra aplicación
		var salir = false;
		var console = new Scanner(System.in);
		while(!salir){
			var opcion = mostrarMenu(console);
			salir = ejecutarOpciones(console, opcion);
			logger.info(nl);
		}
	}

	private int mostrarMenu(Scanner console){
		logger.info("""
				\n*** Aplicación Zona Fit (GYM) ***
				1. Listar Clientes
				2. Buscar Cliente
				3. Agregar Cliente	
				4. Modificar Cliente
				5. Eliminar Cliente
				6. Salir			
				Elige una opción:\s""");
		return Integer.parseInt(console.nextLine());
	}

	public boolean ejecutarOpciones(Scanner console, int opcion){
		var salir = false;
		switch (opcion){
			case 1 -> {
				logger.info(nl + "--- Listado de Clientes ---" + nl);
				List<Cliente> clientes = clienteServicio.listarClientes();
				clientes.forEach(cliente -> logger.info(cliente.toString() + nl)); // Usamos funcion landa con el forEach
			}
			case 2 -> {
				logger.info(nl + "--- Buscar Cliente por Id ---" + nl);
				 logger.info("Id Cliente a buscar: ");
				var idCliente = Integer.parseInt(console.nextLine());
				Cliente cliente = clienteServicio.buscarClientePorId(idCliente); // Recuperar cliente de la base de datos
				if (cliente != null){
					logger.info("Cliente encontrado: " + cliente + nl);
				} else {
					logger.info("Cliente NO encontrado: " + cliente + nl);
				}
			}
			case 3 -> {
				logger.info("--- Agregar Cliente ---" + nl);
				logger.info("Nombre: ");
				var nombre = console.nextLine();
				logger.info("Apellido: ");
				var apellido = console.nextLine();
				logger.info("Membresia: ");
				var membresia = Integer.parseInt(console.nextLine());
				var cliente = new Cliente();
				cliente.setNombre(nombre);
				cliente.setApellido(apellido);
				cliente.setMembresia(membresia);
				clienteServicio.guardarCliente(cliente);
				logger.info("Cliente agregado: " + cliente + nl);
			}
			case 4 -> {
				logger.info("--- Modificar Cliente ---" + nl);
				logger.info("Id Cliente: ");
				var idCliente = Integer.parseInt(console.nextLine());
				Cliente cliente = clienteServicio.buscarClientePorId(idCliente);
				if (cliente != null){
					logger.info("Nombre: ");
					var nombre = console.nextLine();
					logger.info("Apellido: ");
					var apellido = console.nextLine();
					logger.info("Membresia: ");
					var membresia = Integer.parseInt(console.nextLine());
					cliente.setNombre(nombre);
					cliente.setApellido(apellido);
					cliente.setMembresia(membresia);
					clienteServicio.guardarCliente(cliente);
					logger.info("Cliente modificado: " + cliente + nl);
				} else {
					logger.info("Cliente no encontrado: " + cliente + nl);
				}
			}
			case 5 -> {
				logger.info("--- Eliminar Cliente ---" + nl);
				logger.info("Id Cliente: ");
				var idCliente = Integer.parseInt(console.nextLine());
				var cliente = clienteServicio.buscarClientePorId(idCliente);
				if (cliente != null){
					clienteServicio.eliminarCliente(cliente);
					logger.info("Cliente eliminado: " + cliente + nl);
				} else {
					logger.info("Cliente NO encontrado: " + cliente + nl);
				}
			}
			case 6 -> {
				logger.info("Hasta pronto !!" + nl + nl);
				salir = true;
			}
			default -> logger.info("Opción no reconocida: " + opcion + nl);

		}
		return salir;
	}

}
