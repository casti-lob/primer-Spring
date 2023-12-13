package com.jacaranda.miPrimerSpring.model;

import java.util.Objects;

import jakarta.validation.constraints.Min;

public class PotenciaElectrica {
	@Min(1)
	private double voltios;
	@Min(1)
	private double amperios;
	
	public PotenciaElectrica() {
		super();
	}

	public PotenciaElectrica(double voltios, double amperios) throws Exception {
		super();
		setVoltios(voltios);
		setAmperios(amperios);
	}

	public double getVoltios() {
		return voltios;
	}

	public void setVoltios(double voltios) throws Exception {
		if(voltios<0.1) {
			throw new Exception("Los voltios no pueden ser negativos");
		}
		this.voltios = voltios;
	}

	public double getAmperios() {
		return amperios;
	}

	public void setAmperios(double amperios) throws Exception {
		if(amperios<0.1) {
			throw new Exception("Los amperios no pueden ser negativos");
		}
		this.amperios = amperios;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amperios, voltios);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PotenciaElectrica other = (PotenciaElectrica) obj;
		return Double.doubleToLongBits(amperios) == Double.doubleToLongBits(other.amperios)
				&& Double.doubleToLongBits(voltios) == Double.doubleToLongBits(other.voltios);
	}
	
	public String result() {
		String result = "Tu potencia es de "+(this.voltios*this.amperios);
		return result;
		
	}
}	
