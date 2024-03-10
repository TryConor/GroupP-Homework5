package edu.mu.pizza;

import java.util.List;

import edu.mu.Cooking.ICookingStrategy;

public abstract class AbstractPizza {
	protected List<Toppings> toppingList;
	protected double priceWithoutToppings;
	protected double totalPrice;
	protected int pizzaOrderID;
	protected static int orderIDCounter = 1; 
	protected ICookingStrategy cookingStrategy;
	protected double cookingPrice;
	
	
	/**
	 * @param toppingList
	 * @param priceWithoutToppings
	 * @param totalPrice
	 * @param pizzaOrderID
	 * @param cookingStrategy
	 * @param cookingPrice
	 */
	public AbstractPizza(List<Toppings> toppingList, double priceWithoutToppings, double totalPrice, int pizzaOrderID,
			ICookingStrategy cookingStrategy, double cookingPrice) {
		super();
		this.toppingList = toppingList;
		this.priceWithoutToppings = priceWithoutToppings;
		this.totalPrice = totalPrice;
		this.pizzaOrderID = pizzaOrderID;
		this.cookingStrategy = cookingStrategy;
		this.cookingPrice = cookingPrice;
	}
	
	public List<Toppings> getToppingList() {
		return toppingList;
	}
	public void setToppingList(List<Toppings> toppingList) {
		this.toppingList = toppingList;
	}
	public double getPriceWithoutToppings() {
		return priceWithoutToppings;
	}
	public void setPriceWithoutToppings(double priceWithoutToppings) {
		this.priceWithoutToppings = priceWithoutToppings;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getPizzaOrderID() {
		return pizzaOrderID;
	}
	public void setPizzaOrderID(int pizzaOrderID) {
		this.pizzaOrderID = pizzaOrderID;
	}
	public static int getOrderIDCounter() {
		return orderIDCounter;
	}
	public static void setOrderIDCounter(int orderIDCounter) {
		AbstractPizza.orderIDCounter = orderIDCounter;
	}
	public ICookingStrategy getCookingStrategy() {
		return cookingStrategy;
	}
	public void setCookingStrategy(ICookingStrategy cookingStrategy) {
		this.cookingStrategy = cookingStrategy;
	}
	public double getCookingPrice() {
		return cookingPrice;
	}
	public void setCookingPrice(double cookingPrice) {
		this.cookingPrice = cookingPrice;
	}
	
	protected abstract double addTopingsToPrice(double priceWithoutToppings);
	
	public abstract double updatePizzaPrice();

	@Override
	public String toString() {
		return "AbstractPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingStrategy="
				+ cookingStrategy + ", cookingPrice=" + cookingPrice + "]";
	}
	
	
}
