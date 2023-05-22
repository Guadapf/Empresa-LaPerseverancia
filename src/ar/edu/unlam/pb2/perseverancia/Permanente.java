package ar.edu.unlam.pb2.perseverancia;

public class Permanente extends Empleado{

	private final Double VALOR_HORA = 300.0;
	private final Double VALOR_ANTIGUEDAD= 100.0;
	
	private Integer aniosAntiguedad;
	
	public Permanente(Integer aniosAntiguedad, Integer cantidadHoras, Integer cantidadHijos, Boolean tieneConyuge) {
		super(cantidadHoras, cantidadHijos, tieneConyuge);
		this.aniosAntiguedad = aniosAntiguedad;
	}

	public Integer getAniosAntiguedad() {
		return aniosAntiguedad;
	}

	public void setAniosAntiguedad(Integer aniosAntiguedad) {
		this.aniosAntiguedad = aniosAntiguedad;
	}
	
	public Double getSalario() {
			
			Double salario = 0.0;
			
			salario = (this.aniosAntiguedad  * VALOR_ANTIGUEDAD) + (super.getCantidadHoras() * VALOR_HORA) + super.getSalarioFamiliar();
			
			return salario;
		}
	
	
}
