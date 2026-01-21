public class EstacionRadiofrecuencia extends EstacionSeguimiento {

    private double frecuenciaEspecifica;
    private double diametroParabola;

    public EstacionRadiofrecuencia(String ubicacionGeografica, String estadoOperacional, double frecuenciaEspecifica, double diametroParabola) {
        super(ubicacionGeografica, estadoOperacional);
        this.frecuenciaEspecifica = frecuenciaEspecifica;
        this.diametroParabola = diametroParabola;
    }

    @Override
    public void mantenimiento() {
        System.out.println("Calibrando el plato de la antena.");
    }

    @Override
    public void conectar() {
        setEstadoOperacional("CONECTADO");
        System.out.println("Antena de radiofrecuencia conectada.");
    }

    @Override
    public void transmitirPaquete() {
        System.out.println("Transmitiendo Datos.");
    }

    @Override
    public void desconectar() {
        setEstadoOperacional("INACTIVO");
        System.out.println("Antena de radiofrecuencia desconectada.");
    }
}
