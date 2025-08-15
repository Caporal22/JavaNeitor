package zona_fit.datos;

import zona_fit.conexion.Conexion;
import zona_fit.dominio.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static zona_fit.conexion.Conexion.getConexion;

public class ClienteDAO implements IClienteDAO {

    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente ORDER BY id";

        try (
                Connection con = getConexion();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()
        ) {
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar clientes: "
                    + e.getMessage()
                    + " | SQLState: " + e.getSQLState()
                    + " | ErrorCode: " + e.getErrorCode());
        }

        return clientes;
    }

    @Override
    public boolean buscarClientePorId(Cliente cliente) {
        String sql = "SELECT * FROM cliente WHERE id = ?";

        try (
                Connection con = getConexion();
                PreparedStatement ps = con.prepareStatement(sql)
        ) {
            ps.setInt(1, cliente.getId()); // Comienza indice 1 y extraemos id de cliente
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) { // Si existe un registro a leer
                    cliente.setNombre(rs.getString("nombre"));
                    cliente.setApellido(rs.getString("apellido"));
                    cliente.setMembresia(rs.getInt("membresia"));
                    return true;
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar cliente por id: "
                    + e.getMessage()
                    + " | SQLState: " + e.getSQLState()
                    + " | ErrorCode: " + e.getErrorCode());
        }

        return false;
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "INSERT INTO cliente(nombre, apellido, membresia)"
                + " " + " VALUES(?, ?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getMembresia());
            ps.execute();
            return true;
        } catch (Exception e){
            System.out.println("Error al agregar cliente... : " + e.getMessage());
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getSQLState());
            }
        }
        return false;
    }

    @Override
    public boolean modificarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = getConexion();
        var sql = "UPDATE cliente SET nombre=?, apellido=?, membresia=? " +
                "WHERE id = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getMembresia());
            ps.setInt(4, cliente.getId());
            ps.execute();
            return true;
        } catch (Exception e){
            System.out.println("Error al modificar cliente:" + e.getMessage());
        }
        finally {
            try {
                con.close();
            }catch (SQLException e){
                System.out.println("Error al cerrar la conexión: " + e.getSQLState());
            }
        }

        return false;
    }

    @Override
    public boolean eliminarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "DELETE FROM cliente WHERE id = ?";
        try{
            ps =con.prepareStatement(sql);
            ps.setInt(1, cliente.getId());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar cliente: " + e.getMessage());
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexion: " + e.getSQLState());

            }
        }
        return false;
    }

    public static void main(String[] args) {
        IClienteDAO clienteDao = new ClienteDAO();
        // Buscar clientes
//        System.out.println("*** Buscar clientes ***");
//        var cliente1 = new Cliente(2);
//        System.out.println("Cliente antes de la busqueda: " + cliente1);
//        var encontrado = clienteDao.buscarClientePorId(cliente1);
//        if(encontrado){
//            System.out.println("Cliente encontrado: " + cliente1);
//        } else {
//            System.out.println("No se encontro cliente: " + cliente1.getId());
//        }

        // Agregar cliente
//        var nuevoCliente = new Cliente("Daniel", "Sánchez", 300);
//        var agregado = clienteDao.agregarCliente(nuevoCliente);
//        if (agregado){
//            System.out.println("Cliente agregado" + nuevoCliente);
//        } else {
//            System.out.println("No se agrego el cliente: " + nuevoCliente);
//        }

        // Modificar cliente
//        var modificarCliente = new Cliente(5,"Alejandro", "Ahumada", 300);
//        var modificado = clienteDao.modificarCliente(modificarCliente);
//        if(modificado){
//            System.out.println("Cliente modificado: " + modificarCliente);
//
//        } else {
//            System.out.println("No se modifico el cliente: " + modificarCliente);
//        }

            // Eliminar cliente
        var clienteEliminar = new Cliente(5);
        var eliminado = clienteDao.eliminarCliente(clienteEliminar);
        if (eliminado){
            System.out.println("Cliente eliminado: " + clienteEliminar);
        } else {
            System.out.println("No se elimino cliente: " + clienteEliminar);
        }

        //         Listar clientes
        System.out.println("*** Listar clientes ***");
        var clientes = clienteDao.listarClientes();
        clientes.forEach(System.out::println);

    }
}
