package br.edu.ufca.aps.exemplo00;

public class InicializacaoRapidaSingleton {
    
    private static final InicializacaoRapidaSingleton instance = new InicializacaoRapidaSingleton();
     
    //Construtor privado para evitar as aplicações clientes de usar o construtor
    private InicializacaoRapidaSingleton(){}
 
    //O método getInstance() fornece uma maneira de instanciar a classe
    public static InicializacaoRapidaSingleton getInstance(){
        System.out.println("Instanciando singleton");
    	return instance;
    }
    
    //Singleton é uma classe normal, pode ter outros métodos
}
