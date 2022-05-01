package visitor.example2;

public class ShoppingCart implements ShoppingCartVisitor {
	private int cost;
	
	public ShoppingCart() {
		cost=0;
	}
	
	@Override
	public int visit(Book book) {
		cost = book.getPrice();
        System.out.println("Book ISBN::"+book.getIsbnNumber() + " cost ="+cost);
        return cost;
	}

	@Override
	public int visit(Fruit fruit) {

        int cost = fruit.getPrice()*fruit.getKg();
        System.out.println(fruit.getName() + " cost = "+cost);
        return cost;
	}

}
