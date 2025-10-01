import java.util.ArrayList;
public class Veterinaria {
    private ArrayList<Cliente> clientes;

    public Veterinaria() {
        this.clientes = new ArrayList<>();
    }
    public void agregarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
    public ArrayList<Cliente> getClientes() {
        return this.clientes;
    }
}
