import java.util.ArrayList;
import java.util.List;

public abstract class EstacionSeguimiento implements Telemetria {

    private String ubicacionGeografica;
    private String estadoOperacional;
    private UnidadProcesamientoDatos unidadProcesamientoDatos;
    private List<SensorMeteorologico> sensores;

    public EstacionSeguimiento(String ubicacionGeografica, String estadoOperacional) {
        this.ubicacionGeografica = ubicacionGeografica;
        this.estadoOperacional = estadoOperacional;
        unidadProcesamientoDatos = new UnidadProcesamientoDatos(); // Composición
        this.sensores = new ArrayList<>(); // Inicializamos la lista vacía
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

    public abstract void mantenimiento();

    public void addSensor(SensorMeteorologico sensor) {
        this.sensores.add(sensor);
    }
}
