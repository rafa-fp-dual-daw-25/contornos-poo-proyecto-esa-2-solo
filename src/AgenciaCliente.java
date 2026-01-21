import java.util.ArrayList;
import java.util.List;

public class AgenciaCliente {

    private String nombre;
    private List<RegistroUso> registros;

    public AgenciaCliente(String nombre) {
        this.nombre = nombre;
        this.registros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarRegistro(RegistroUso registro) {
        this.registros.add(registro);
    }
}
