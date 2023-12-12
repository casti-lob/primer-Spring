package com.jacaranda.miPrimerSpring.model;

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
	
	
}
