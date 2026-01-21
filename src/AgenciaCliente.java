import java.util.ArrayList;
import java.util.List;

public class AgenciaCliente {

    private List<RegistroUso> registros;

    public AgenciaCliente() {
        this.registros = new ArrayList<>();
    }

    public void agregarRegistro(RegistroUso registro) {
        this.registros.add(registro);
    }
}
