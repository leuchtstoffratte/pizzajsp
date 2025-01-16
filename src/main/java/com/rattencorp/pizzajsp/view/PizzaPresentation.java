package com.rattencorp.pizzajsp.view;

import com.rattencorp.pizzajsp.model.menue.PizzaType;

public record PizzaPresentation(PizzaType pizzaType, String pizzaAppenderName, String pizzaRemoverName, String pizzaAmountName) {

    public static PizzaPresentation  fromPizzaType(PizzaType pizzaType){

        final String sanitizedPizzaName = pizzaType.name().toLowerCase().trim().replaceAll(" ", "");

        return new PizzaPresentation(pizzaType,
                sanitizedPizzaName.concat("_adder_button"),
                sanitizedPizzaName.concat("_subtractor_button"),
                sanitizedPizzaName.concat("_pizza_amount"));
    }
}
