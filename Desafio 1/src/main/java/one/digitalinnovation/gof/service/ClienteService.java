import java.util.ArrayList;
import java.util.List;

public class ClienteService {
    private static ClienteService instance;
    private List<Cliente> clientes;

    private ClienteService() {
        // Inicializa a lista de clientes
        this.clientes = new ArrayList<>();
    }

    public static synchronized ClienteService getInstance() {
        if (instance == null) {
            instance = new ClienteService();
        }
        return instance;
    }

    public List<Cliente> buscarTodos() {
        return new ArrayList<>(clientes);
    }

    public Cliente buscarPorId(Long id) {
        return clientes.stream()
            .filter(cliente -> cliente.getId().equals(id))
            .findFirst()
            .orElse(null);
    }

    public void inserir(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void atualizar(Long id, Cliente clienteAtualizado) {
        clientes.stream()
            .filter(cliente -> cliente.getId().equals(id))
            .findFirst()
            .ifPresent(cliente -> {
                cliente.setNome(clienteAtualizado.getNome());
                cliente.setEmail(clienteAtualizado.getEmail());
                // atualize outros campos conforme necessário
            });
    }

    public void deletar(Long id) {
        clientes.removeIf(cliente -> cliente.getId().equals(id));
    }
}