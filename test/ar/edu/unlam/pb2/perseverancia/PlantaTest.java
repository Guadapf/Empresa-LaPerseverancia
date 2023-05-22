package ar.edu.unlam.pb2.perseverancia;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlantaTest {

	@Test
	public void queCalculeElSalarioDeUnEmpleadoTemporal() {
		Temporaria empleado = new Temporaria(10, 1, false);
		Double valorEsperado = 2200.0;
		assertEquals(valorEsperado,empleado.getSalario(),0.01);
	}
	
	@Test
	public void queSeMuestrenLosSueldosDeLosCasos() {
		Temporaria e1 = new Temporaria(80, 0, true);
		Permanente e2 = new Permanente(6, 80, 2, true);
		Permanente e3 = new Permanente(4, 160, 0, false);
		Gerente e4 = new Gerente(10, 160, 1, true);
		Empresa empresa = new Empresa(1112354, "jeje");
		empresa.agregarEmpleado(e1);
		empresa.agregarEmpleado(e2);
		empresa.agregarEmpleado(e3);
		empresa.agregarEmpleado(e4);
		
		Double valorObtenido = empresa.calcularSueldos();
		Double valorEsperado = 155400.0; //16100+25100+48400+65800
		
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}

}
