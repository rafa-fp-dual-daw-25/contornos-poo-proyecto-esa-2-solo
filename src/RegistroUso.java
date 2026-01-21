import java.time.LocalDate;

public class RegistroUso {

    private AgenciaCliente agenciaCliente;
    private EstacionSeguimiento estacionSeguimiento;
    private LocalDate fechaInicio, fechafin;
    private double costeCalculado;

    public RegistroUso(AgenciaCliente agenciaCliente, EstacionSeguimiento estacionSeguimiento, LocalDate fechaInicio, LocalDate fechafin, double costeCalculado) {
        this.agenciaCliente = agenciaCliente;
        this.estacionSeguimiento = estacionSeguimiento;
        this.fechaInicio = fechaInicio;
        this.fechafin = fechafin;
        this.costeCalculado = costeCalculado;
        this.agenciaCliente.agregarRegistro(this);
        this.estacionSeguimiento.addRegistrarUso(this);
    }

    public AgenciaCliente getAgenciaCliente() {
        return agenciaCliente;
    }

    public EstacionSeguimiento getEstacionSeguimiento() {
        return estacionSeguimiento;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechafin() {
        return fechafin;
    }

    public double getCosteCalculado() {
        return costeCalculado;
    }
}
