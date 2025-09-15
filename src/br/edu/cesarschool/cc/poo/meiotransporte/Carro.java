package br.edu.cesarschool.cc.poo.meiotransporte;

import br.edu.cesarschool.cc.poo.meiotransporte.motorizado.MeioTransporteMotorizado;

class Carro extends MeioTransporteMotorizado{
	Carro(String nome, double cargaMaxima, double velocidadeMaxima, 
			double potenciaMotor, double capacidadeCombustivel, double consumoMedio){
		super(nome, cargaMaxima, velocidadeMaxima, potenciaMotor, capacidadeCombustivel, consumoMedio);
		
	}
	public double calcularEficiencia() {
		return getCargaMaxima() / getConsumoMedio();
	}		
}
