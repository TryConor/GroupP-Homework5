package edu.mu.Cooking;

import edu.mu.pizza.AbstractPizza;
//cooking strategy interface for strategy classes to implement
public interface ICookingStrategy {
	//cooking strategy classes will use this method & override
	public boolean cook(AbstractPizza pizza);
}
