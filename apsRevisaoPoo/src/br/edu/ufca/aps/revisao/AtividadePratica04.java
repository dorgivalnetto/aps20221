package br.edu.ufca.aps.revisao;

import java.util.ArrayList;

public class AtividadePratica04 {

	//Veículo, ônibus e caminhão
	
	public class Veiculo{
		protected String placa;
		protected int ano;
		
		public Veiculo(String placa, int ano) {
			this.placa = placa;
			this.ano = ano;
		}
		
		public Veiculo() {
			
		}

		public String getPlaca() {
			return placa;
		}

		public void setPlaca(String placa) {
			this.placa = placa;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}
		
		public void exibirDados() {
			System.out.println("A placa do veículo é: " + this.placa + " e o ano de fabricação é: " + this.ano);
		}
	}
	
	
	public class Onibus extends Veiculo{
		private int assentos;
		
		public Onibus(String placa, int ano, int assentos) {
			super(placa, ano);
			this.assentos = assentos;
		}
		
		
		
		public int getAssentos() {
			return assentos;
		}



		public void setAssentos(int assentos) {
			this.assentos = assentos;
		}



		public void exibirDados() {
			System.out.println("A placa do veículo é: " + this.placa + " e o ano de fabricação é: " + this.ano +
					" a quantidade de assentos é: " + this.assentos);
		}
		
	}
	
	public class Caminhao extends Veiculo{
		private int eixos;
		
		public Caminhao(String placa, int ano, int eixos) {
			super(placa, ano);
			this.eixos = eixos;
		}
		
		public int getEixos() {
			return eixos;
		}


		public void setEixos(int eixos) {
			this.eixos = eixos;
		}


		public void exibirDados() {
			System.out.println("A placa do veículo é: " + this.placa + " e o ano de fabricação é: " + this.ano +
					" a quantidade de eixos é: " + this.eixos);
		}
		
	}
	
	public class TestaVeiculo{
		public void main(String[] args) {
			ArrayList<Veiculo> veiculos = new ArrayList<AtividadePratica04.Veiculo>();
			veiculos.add(new Veiculo("XPO-0897", 2015));
			veiculos.add(new Veiculo("ABC-1234", 2022));
			veiculos.add(new Veiculo("POT-8534", 2021));
			
			veiculos.add(new Onibus("POT-8534", 2021, 34));
			
			ArrayList<Caminhao> caminhoes = new ArrayList<AtividadePratica04.Caminhao>();
			veiculos.add(new Caminhao("NBG-3456", 2018, 6));
			
			for(Veiculo veiculo: veiculos) {
				veiculo.exibirDados();
			}
			
			for(Caminhao caminhao: caminhoes) {
				caminhao.exibirDados();
			}
			
			
		}
	}
	
	/*
	 * A instrução “acelerar” é a mesma para os diferentes tipos de veículos 
	 * Métodos sobrecarregados são escritos com o mesmo nome, mas com uma lista de
	 * argumentos diferente. Assim como com os tipos de retorno, métodos
	 * sobrecarregados podem ter modificadores de acesso diferentes. Uma classe pode
	 * fazer a sobrecarga nos métodos que foram declarados dentro dela e também nos
	 * métodos herdados. Métodos sobrecarregados devem possuir o mesmo nome. Métodos
	 * sobrecarregados devem possuir listas de parâmetros diferentes. Métodos
	 * sobrecarregados podem ter modificadores de acesso e tipos de retorno
	 * diferentes, mas ele não podem ser usados para diferenciar um método do outro.
	 * 
	 * 
	 */

	public void acelerar(Onibus onibus) {

	}

	public void acelerar(Caminhao caminhao) {

	}
}
