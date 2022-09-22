package br.edu.ufca.aps.exemplo3;

/*
 *  N�s podemos ter diferentes combina��es de ingredientes na pizza. Supondo que
 *  n�s podemos ter dois adicionais dentre: morango, chocolate, M&M, castanhas. 
 *  S�o 16 combina��es! � medida que essa quantidade de ingredientes aumenta,
 *  temos que criar mais objetos para represent�-los.
 *  N�s n�o criamos uma classe para cada combina��o de sorvete.
 *  Podemos estender facilmente o c�dgio sem modificar outras classes. 
 *  Se n�s quisermos um sorvete de chocolate com M&M, precisamos estender os adicionais
 *  decorator with o Sorvete Simples e fazer a composi��o como n�s quisermos
 */
public abstract class SorveteDecorator implements Sorvete {

	public Sorvete sorveteEspecial;
	
	/*
	 * Quando um decorador � criado, uma inst�ncia � atribu�da dinamicamente.
	 * Uma vez atribu�da, o m�todo ser� invocado.
	 */
	public SorveteDecorator(Sorvete sorveteEspecial) {
		this.sorveteEspecial = sorveteEspecial;
	}
	
	/*
	 * Em SorveteDecorator, fazerSorvete � um m�todo que pode ser sobrescrito
	 * pelas classes filhas.
	 */
	public String fazerSorvete() {
		return sorveteEspecial.fazerSorvete();
	}
}
