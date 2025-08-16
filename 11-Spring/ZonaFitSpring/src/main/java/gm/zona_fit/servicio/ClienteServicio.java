package gm.zona_fit.servicio;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Forma parte de la fábrica de Spring
public class ClienteServicio implements IClienteServicio {

    @Autowired // Autoinyectar una referencia (Capa de datos Repositorio)
    private ClienteRepositorio clienteRepositorio;


    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = clienteRepositorio.findAll(); // Regresa todos los clientes de la clase Cliente
        return clientes;
    }

    @Override
    public Cliente buscarClientePorId(Integer idCliente) {
        Cliente cliente = clienteRepositorio.findById(idCliente).orElse(null);
        return cliente;
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        clienteRepositorio.save(cliente); // Si id = null -> Insert  de lo contrario UPDATE

    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        clienteRepositorio.delete(cliente); // Toma valor Id y si se encuentra se elimina
    }
}
