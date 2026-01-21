import java.util.ArrayList;
import java.util.List;

public abstract class EstacionSeguimiento implements ITelemetria {

    private String ubicacionGeografica;
    private String estadoOperacional;
    private UnidadProcesamientoDatos unidadProcesamientoDatos;
    private List<SensorMeteorologico> sensores;
    private List<RegistroUso> registros;

    public EstacionSeguimiento(String ubicacionGeografica, String estadoOperacional) {
        this.ubicacionGeografica = ubicacionGeografica;
        this.estadoOperacional = estadoOperacional;
        unidadProcesamientoDatos = new UnidadProcesamientoDatos(); // Composición
        this.sensores = new ArrayList<>(); // Inicializamos la lista vacía
        this.registros = new ArrayList<>();
    }

    public String getUbicacionGeografica() {
        return ubicacionGeografica;
    }

    public void setUbicacionGeografica(String ubicacionGeografica) {
        this.ubicacionGeografica = ubicacionGeografica;
    }

    public String getEstadoOperacional() {
        return estadoOperacional;
    }

    public void setEstadoOperacional(String estadoOperacional) {
        this.estadoOperacional = estadoOperacional;
    }

    public abstract void realizarMantenimiento();

    public void añadirSensor(SensorMeteorologico sensor) {
        this.sensores.add(sensor);
    }

    public void addRegistrarUso(RegistroUso registro) {
        this.registros.add(registro);
    }
}
