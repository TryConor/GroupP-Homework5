package edu.mu.Order;

import java.util.List;

import edu.mu.Cooking.CookingStyleType;
import edu.mu.Cooking.ICookingStrategy;
import edu.mu.Cooking.PizzaCookingFactory;
import edu.mu.pizza.AbstractPizza;
import edu.mu.pizza.Toppings;
import edu.mu.pizzaTypes.PizzaType;

public class PizzaOrder {
	private PizzaCookingFactory pizzaCookingFactory;
	private ICookingStrategy cookingStrategy;
	private List<AbstractPizza> pizzaOrderList;
	 
	public void printListOfToppingsByPizzaOrderID(int orderID) {
		
	}
	
	public void printPizzaOrderCart(int orderID) {
		
	}
	
	public AbstractPizza getPizzaByOrderID(int orderID) {
		return null;
		
	}
	
	public boolean addPizzaToCart(PizzaType pizzaType) {
		return false;
		
	}
	
	public boolean addNewToppingToPizza(int orderID, Toppings topping) {
		return false;
		
	}
	
	public boolean removeToppingFromPizza(int orderID, Toppings topping) {
		return false;
		
	}
	
	public boolean isThereAnyUncookedPizza() {
		return false;
		
	}
	
	public double checkout() throws Exception{
		return 0;
		
	}
	
	public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType) {
		return false;
		
	}
}
