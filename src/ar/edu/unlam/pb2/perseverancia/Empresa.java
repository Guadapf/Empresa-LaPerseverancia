package ar.edu.unlam.pb2.perseverancia;

import java.util.LinkedList;

public class Empresa {
	
	private Integer cuit;
	private String razonSocial;
	
	private LinkedList<Empleado> empleados = new LinkedList<Empleado>();
	
	public Empresa(Integer cuit, String razonSocial) {
		this.cuit = cuit;
		this.razonSocial = razonSocial;
	}
	
	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
	
	public Double calcularSueldos() {
		Double salariosEmpleados = 0.0;
		for(Empleado empleado : empleados) {
			salariosEmpleados += empleado.getSalario();
		}
		
		return salariosEmpleados;
	}

}
