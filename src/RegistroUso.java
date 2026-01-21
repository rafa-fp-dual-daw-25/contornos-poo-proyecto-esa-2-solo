import java.util.Date;

public class RegistroUso {

    private AgenciaCliente agenciaCliente;
    private EstacionSeguimiento estacionSeguimiento;
    private Date fechaInicio, fechafin;
    private double costeCalculado;

    public RegistroUso(AgenciaCliente agenciaCliente, EstacionSeguimiento estacionSeguimiento, Date fechaInicio, Date fechafin, double costeCalculado) {
        this.agenciaCliente = agenciaCliente;
        this.estacionSeguimiento = estacionSeguimiento;
        this.fechaInicio = fechaInicio;
        this.fechafin = fechafin;
        this.costeCalculado = costeCalculado;
    }
}
