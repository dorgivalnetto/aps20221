package br.edu.ufca.aps.desafio4;

public class ShoppingCartTest {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Item item1 = new Item("1234",10);
		Item item2 = new Item("5678",40);
		cart.addItem(item1);
		cart.addItem(item2);
		cart.pay(new PaypalStrategy ("myemail@example.com", "mypwd"));
		cart.pay(new CreditCardStrategy("Jose Santos", "1234567890123456", "786", "12/15"));}
}

