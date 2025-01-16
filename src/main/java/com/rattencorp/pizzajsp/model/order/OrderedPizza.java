package com.rattencorp.pizzajsp.model.order;

import com.rattencorp.pizzajsp.model.menue.PizzaType;

import java.io.Serializable;

public class OrderedPizza implements Serializable {
    private final PizzaType pizzaType;


    OrderedPizza(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public String getPizzaName() {
        return pizzaType.name();
    }

    PizzaType getPizzaType() {
        return pizzaType;
    }

    /**
     * price is given in cents!
     */
    public int getPrice() {
        return pizzaType.price_cents();
    }

    public boolean isVegetarian() {
        return pizzaType.vegetarian();
    }

    public boolean isVegan(){
        return pizzaType.vegan();
    }



}
