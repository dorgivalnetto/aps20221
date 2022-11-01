package br.edu.ufca.aps.exemplo02;

import java.util.*;

public class IteratorEnumerationTeste {
	public static void main (String args[]) {
		ArrayList l = new ArrayList(Arrays.asList(args));
		Enumeration enumeration = new IteratorEnumeration(l.iterator());
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}
