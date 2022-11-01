package br.edu.ufca.aps.exemplo02;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIteratorAdapter implements Iterator{

	Enumeration<String> enumeration;
	
	public EnumerationIteratorAdapter(Enumeration<String> enume) {
		this.enumeration = enume;
	}
	
	@Override
	public boolean hasNext() {
		// delegado ao m�todo hasMoreElements() de Enumeration
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		// delegado ao m�todo next() de Enumeration
		return enumeration.nextElement();
	}
	
	public void remove() {
		//n�o temos como tratar esse m�todo
		throw new UnsupportedOperationException();
	}

}
