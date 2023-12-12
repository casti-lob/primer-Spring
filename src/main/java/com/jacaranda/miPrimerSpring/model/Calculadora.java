package com.jacaranda.miPrimerSpring.model;

import java.util.Objects;

public class Calculadora {

	private int number1;
	private char operador;
	private int number2;
	
	
	
	public Calculadora() {
		super();
	}



	public Calculadora(int number1, char operador, int number2) {
		super();
		this.number1 = number1;
		this.operador = operador;
		this.number2 = number2;
	}


	
	public int result() {
		int result = 0;
		switch (operador) {
		case '+': {
			
			result = this.number1+this.number2;
			break;
		}case '-': {
			
			result = this.number1-this.number2;
			break;
		}case '*': {
			
			result = this.number1*this.number2;
			break;
		}case '/': {
			
			result = this.number1/this.number2;
			break;
		}	
	}
		return result;
	}



	public int getNumber1() {
		return number1;
	}



	public void setNumber1(int number1) {
		this.number1 = number1;
	}



	public char getOperador() {
		return operador;
	}



	public void setOperador(char operador) {
		this.operador = operador;
	}



	public int getNumber2() {
		return number2;
	}



	public void setNumber2(int number2) {
		this.number2 = number2;
	}



	@Override
	public int hashCode() {
		return Objects.hash(number1, number2, operador);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculadora other = (Calculadora) obj;
		return number1 == other.number1 && number2 == other.number2 && operador == other.operador;
	}
	
	
}
