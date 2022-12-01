package br.edu.ufca.aps.exemplo00;

public class InicializacaoRapidaSingleton {
    
    private static final InicializacaoRapidaSingleton instance = new InicializacaoRapidaSingleton();
     
    //Construtor privado para evitar as aplica��es clientes de usar o construtor
    private InicializacaoRapidaSingleton(){}
 
    //O m�todo getInstance() fornece uma maneira de instanciar a classe
    public static InicializacaoRapidaSingleton getInstance(){
        System.out.println("Instanciando singleton");
    	return instance;
    }
    
    //Singleton � uma classe normal, pode ter outros m�todos
}
