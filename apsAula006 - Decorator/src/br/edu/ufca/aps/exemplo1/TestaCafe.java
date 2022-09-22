package br.edu.ufca.aps.exemplo1;

public class TestaCafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bebida b1 = new BaseExpresso();
		System.out.println(b1.getDescricao() + 
				"R$ " + b1.custo());
		
		Bebida b2 = new BaseTorraIntensa();
		b2 = new Mocha(b2);
		b2 = new Mocha(b2);
		b2 = new Cremoso(b2);
		System.out.println(b2.getDescricao() + 
				"R$ " + b2.custo());
		
		Bebida b3 = new BaseHouseBlend();
		b3 = new Mocha(b3);
		b3 = new Cremoso(b3);
		System.out.println(b3.getDescricao() + 
				"R$ " + b3.custo());
		
	}

}
