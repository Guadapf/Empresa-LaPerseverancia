package ar.edu.unlam.pb2.perseverancia;

public class Gerente extends Permanente{
	
	private final Double VALOR_HORA = 400.0;
	private final Double VALOR_ANTIGUEDAD = 150.0;
	
	public Gerente(Integer aniosAntiguedad, Integer cantidadHoras, Integer cantidadHijos, Boolean tieneConyuge) {
		super(aniosAntiguedad, cantidadHoras, cantidadHijos, tieneConyuge);
	}
	
	public Double getSalario() {
		
		Double salario = 0.0;
		
		salario = (super.getAniosAntiguedad() * VALOR_ANTIGUEDAD) + (super.getCantidadHoras() * VALOR_HORA) + super.getSalarioFamiliar();
		
		return salario;
	}
}
