package br.edu.ufca.aps.exemplo02;

import java.util.*;

public class EnumerationIteratorTeste{
	public static void main (String args[]) {
		Vector v = new Vector(Arrays.asList(args));
		Iterator iterator = new EnumerationIterator(v.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
