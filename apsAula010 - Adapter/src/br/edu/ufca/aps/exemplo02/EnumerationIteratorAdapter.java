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
		// delegado ao método hasMoreElements() de Enumeration
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		// delegado ao método next() de Enumeration
		return enumeration.nextElement();
	}
	
	public void remove() {
		//não temos como tratar esse método
		throw new UnsupportedOperationException();
	}

}
