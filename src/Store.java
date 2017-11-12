
import java.io.Serializable;

public class Store implements Serializable, Comparable<Store>{
	private String name;
	private int quantity;
	private double price;

	public Store() {
	}

	public Store(String name, int quantity, double price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}


	public double getPrice() {
		return price;
	}

	@Override
	public int compareTo(Store store) {
		return name.compareTo(store.getName());
	}

	@Override
	public String toString() {
		return  name + " "  + quantity +
				" " + price ;
	}
}
