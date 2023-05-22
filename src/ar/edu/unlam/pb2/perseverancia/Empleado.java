package ar.edu.unlam.pb2.perseverancia;

public abstract class Empleado {
	
	private final Double VALOR_HIJO = 200.0;
	private final Double VALOR_CONYUGE = 100.0;
	
	private Integer cantidadHoras;
	private Integer cantidadHijos;
	private Boolean tieneConyuge;
	
	public Empleado(Integer cantidadHoras, Integer cantidadHijos, Boolean tieneConyuge) {
		this.cantidadHoras = cantidadHoras;
		this.cantidadHijos = cantidadHijos;
		this.tieneConyuge = tieneConyuge;
	}
	
	public Integer getCantidadHoras() {
		return cantidadHoras;
	}

	public void setCantidadHoras(Integer cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}

	public Integer getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(Integer cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	public Boolean getTieneConyuge() {
		return tieneConyuge;
	}

	public void setTieneConyuge(Boolean tieneConyuge) {
		this.tieneConyuge = tieneConyuge;
	}
	
	public abstract Double getSalario();

	public Double getSalarioFamiliar() {
		
		Double sueldoFinal = this.cantidadHijos * VALOR_HIJO;
		
		if(this.tieneConyuge) {
			sueldoFinal += VALOR_CONYUGE;
		}
		return sueldoFinal;
	}
}
