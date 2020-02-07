package com.crosart.beans;

public class Operation {
	private int arg1;
	private int arg2;
	private int result;
	private String operande;

	public void calculate() {
		
		if (operande.equals("add")) {
			result = arg1 + arg2;
		}

		if (operande.equals("substract")) {
			result = arg1 - arg2;
		}
	
		if (operande.equals("multiply")) {
			result = arg1 * arg2;
		}

		if (operande.equals("modulo")) {

			// Prise en compte du cas spécifique de la division par 0
			
			if (arg2 == 0) {
				result = 0;	
			}
			
			else {
				result = arg1 % arg2;
			}

		}
		
	}
	
	public int getArg1() {
		return arg1;
	}
	public void setArg1(int arg1) {
		this.arg1 = arg1;
	}
	public int getArg2() {
		return arg2;
	}
	public void setArg2(int arg2) {
		this.arg2 = arg2;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public String getOperande() {
		return operande;
	}
	public void setOperande(String operande) {
		this.operande = operande;
	}
	
}
