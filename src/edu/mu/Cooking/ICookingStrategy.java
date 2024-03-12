package edu.mu.Cooking;

import edu.mu.pizza.AbstractPizza;
//cooking strategy interface for cooking strat classes to implement
public interface ICookingStrategy {
	public boolean cook(AbstractPizza pizza);
}
