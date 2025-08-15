package zona_fit.datos;

import zona_fit.dominio.Cliente;
import java.util.List;

public interface IClienteDAO {
    List<Cliente> listarClientes();
    // Verificar si se agrego/encontro o no el cliente
    boolean buscarClientePorId(Cliente cliente);
    boolean agregarCliente(Cliente cliente);
    boolean modificarCliente(Cliente cliente);
    boolean eliminarCliente(Cliente cliente);
}
