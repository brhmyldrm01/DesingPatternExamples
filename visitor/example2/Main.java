package visitor.example2;

public class Main {

	public static void main(String[] args) {

		Fruit fruit = new Fruit("Apple", 2, 2);
		Book book = new Book(50,"Math book");
		
		fruit.accept(new ShoppingCart());
		book.accept(new ShoppingCart());

	}

}
