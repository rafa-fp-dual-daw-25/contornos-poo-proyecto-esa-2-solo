public class EstacionOptica extends EstacionSeguimiento {

    private int longitud;
    private boolean visibilidadAtmosferica;

    public EstacionOptica(String ubicacionGeografica, String estadoOperacional, int longitud, boolean visibilidadAtmosferica) {
        super(ubicacionGeografica, estadoOperacional);
        this.longitud = longitud;
        this.visibilidadAtmosferica = visibilidadAtmosferica;
    }


    @Override
    public void realizarMantenimiento() {
        System.out.println("Limpiando lentes y espejos para asegurar que el sistema pueda atravesar la nubosidad o distorsión atmosférica.");
    }

    @Override
    public void conectar() {
        setEstadoOperacional("CONECTADO");
        System.out.println("Estación óptica conectada y sistemas láser listos.");
    }

    @Override
    public void transmitirPaquete() {
        System.out.println("Transmitiendo Datos.");
    }

    @Override
    public void desconectar() {
        setEstadoOperacional("INACTIVO");
        System.out.println("Estación óptica desconectada.");
    }
}
