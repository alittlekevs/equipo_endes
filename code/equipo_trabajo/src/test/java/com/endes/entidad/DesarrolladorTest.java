package com.endes.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DesarrolladorTest {

	Desarrollador d1;
	Desarrollador d2;
	
	@BeforeEach
	void setUp() throws Exception {
		d1 = new Desarrollador("47337701K", "Kevin", 1000.0, "Java");
		d2 = new Desarrollador("47337701K", "Kevin", 1000.0, "C++");
	}

	@Test
	@DisplayName("Debe obtener el dni del desarrollador")
	void testGetDni() {
		String dniEsperado = "47337701K";
		assertEquals(dniEsperado, d1.getDni(), "Los dni no coinciden");
	}
	
	@Test
	@DisplayName("Debe obtener el nombre del desarrollador")
	void testGetNombre() {
		String nombreEsperado = "Kevin";
		assertEquals(nombreEsperado, d1.getNombre(), "Los nombres no coinciden");
	}
	
	@Test
	@DisplayName("Debe obtener el sueldo base del desarrollador")
	void testGetSueldoBase() {
		Double sueldoEsperado = 1000.0;
		assertEquals(sueldoEsperado, d1.getSueldoBase(), "Los sueldos no coinciden");
	}
	
	@Test
	@DisplayName("Debe cambiar el sueldo base del desarrollador")
	void testSetSueldoBase() {
		Double sueldoEsperado = 800.0;
		d1.setSueldoBase(800.0);
		assertEquals(sueldoEsperado, d1.getSueldoBase(), "El sueldo no se ha modificado correctamente desde el set");
	}
	
	@Test
	@DisplayName("Debe obtener el lenguaje del desarrollador")
	void testGetLenguajePrincipal() {
		String lenguajeEsperado = "Java";
		assertEquals(lenguajeEsperado, d1.getLenguajePrincipal(), "Los lenguajes no coinciden");
		
		String lenguajeEsperado2 = "C++";
		assertEquals(lenguajeEsperado2, d2.getLenguajePrincipal(), "Los lenguajes no coinciden");
	}
	
	@Test
	@DisplayName("Debe calcular la productividad del desarrollador")
	void testCalcularProductividad() {
		Double productividadEsperada = d1.getSueldoBase() * 1.10;
		assertEquals(productividadEsperada, d1.calcularProductividad(), "La productividad aumentada no es la esperada");
		
		Double productividadEsperada2 = d2.getSueldoBase();
		assertEquals(productividadEsperada2, d2.calcularProductividad(), "La productividad no es la esperada");
	}
	

}
