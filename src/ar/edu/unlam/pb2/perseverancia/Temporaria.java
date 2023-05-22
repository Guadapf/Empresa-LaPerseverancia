package ar.edu.unlam.pb2.perseverancia;

public class Temporaria extends Empleado{
	
	private final Double VALOR_HORA= 200.0;
	
	public Temporaria(Integer cantidadHoras, Integer cantidadHijos, Boolean tieneConyuge) {
		super(cantidadHoras, cantidadHijos, tieneConyuge);
	}
	
	public Double getSalario() {
		return (super.getCantidadHoras() * VALOR_HORA) + super.getSalarioFamiliar();
	}
}
