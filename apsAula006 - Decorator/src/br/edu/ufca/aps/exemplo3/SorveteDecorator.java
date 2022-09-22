package br.edu.ufca.aps.exemplo3;

/*
 *  Nós podemos ter diferentes combinações de ingredientes na pizza. Supondo que
 *  nós podemos ter dois adicionais dentre: morango, chocolate, M&M, castanhas. 
 *  São 16 combinações! À medida que essa quantidade de ingredientes aumenta,
 *  temos que criar mais objetos para representá-los.
 *  Nós não criamos uma classe para cada combinação de sorvete.
 *  Podemos estender facilmente o códgio sem modificar outras classes. 
 *  Se nós quisermos um sorvete de chocolate com M&M, precisamos estender os adicionais
 *  decorator with o Sorvete Simples e fazer a composição como nós quisermos
 */
public abstract class SorveteDecorator implements Sorvete {

	public Sorvete sorveteEspecial;
	
	/*
	 * Quando um decorador é criado, uma instância é atribuída dinamicamente.
	 * Uma vez atribuída, o método será invocado.
	 */
	public SorveteDecorator(Sorvete sorveteEspecial) {
		this.sorveteEspecial = sorveteEspecial;
	}
	
	/*
	 * Em SorveteDecorator, fazerSorvete é um método que pode ser sobrescrito
	 * pelas classes filhas.
	 */
	public String fazerSorvete() {
		return sorveteEspecial.fazerSorvete();
	}
}
