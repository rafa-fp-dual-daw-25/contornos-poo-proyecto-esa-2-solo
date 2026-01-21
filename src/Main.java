import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 1. Creamos la Agencia (¡Ahora con nombre!)
        AgenciaCliente nasa = new AgenciaCliente("NASA");
        AgenciaCliente esa = new AgenciaCliente("ESA");

        // 2. Creamos las Estaciones
        // Estación Óptica en Tenerife (Lugar real de la ESA)
        EstacionOptica estacionTenerife = new EstacionOptica("Tenerife", "INACTIVO", 1064, true);

        // Estación de Radio en Cebreros (Lugar real de la ESA)
        EstacionRadiofrecuencia estacionCebreros = new EstacionRadiofrecuencia("Cebreros", "INACTIVO", 32.0, 35.0);

        System.out.println("--- ESTADO INICIAL ---");
        // Probamos conexión (Polimorfismo: cada una lo hace a su manera)
        estacionTenerife.conectar();
        estacionCebreros.conectar();

        System.out.println("\n--- GENERANDO RESERVAS ---");
        // 3. Creamos un Registro de Uso (Booking)
        // Al crearlo, gracias al cambio nº3, se guardará solo en los historiales.
        RegistroUso reserva1 = new RegistroUso(nasa, estacionTenerife,
                LocalDate.of(2025, 5, 20),
                LocalDate.of(2025, 5, 25),
                5000.0);

        RegistroUso reserva2 = new RegistroUso(esa, estacionCebreros,
                LocalDate.now(),
                LocalDate.now().plusDays(3),
                2500.0);

        System.out.println("Reserva creada para " + nasa.getNombre() + " en la estación de " + estacionTenerife.getUbicacionGeografica());
        System.out.println("Reserva creada para " + esa.getNombre() + " en la estación de " + estacionCebreros.getUbicacionGeografica());

        System.out.println("\n--- PROBANDO TELEMETRÍA ---");
        estacionTenerife.transmitirPaquete(); // Debería decir "Transmitiendo Datos."
        estacionTenerife.realizarMantenimiento(); // Mantenimiento específico de óptica

        System.out.println("\n--- CIERRE ---");
        estacionTenerife.desconectar();
        estacionCebreros.desconectar();
    }
}