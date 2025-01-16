package com.rattencorp.pizzajsp.model.order;

import com.rattencorp.pizzajsp.model.menue.PizzaType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CurrentOrderTest {


    private static final PizzaType TYPE_A = new PizzaType("first", 120, false, false);
    private static final PizzaType TYPE_B = new PizzaType("second", 80, true, true);
    private static final PizzaType TYPE_C = new PizzaType("third", 10, true, false);



    private CurrentOrder currentOrder;




    @BeforeEach
    void setUp() {

        currentOrder = new CurrentOrder();
    }


    @Test
    void whenAllAddedPizzasAreRemovedNoneShouldBeInCurrentOrder() {
        //GIVEN
        OrderedPizza pizza1 = new OrderedPizza(TYPE_A);
        OrderedPizza pizza2 = new OrderedPizza(TYPE_A);
        OrderedPizza pizza3 = new OrderedPizza(TYPE_A);

        //WHEN
        currentOrder.addPizza(pizza1);
        currentOrder.addPizza(pizza2);
        currentOrder.addPizza(pizza3);
        currentOrder.removePizza(pizza1);
        currentOrder.removePizza(pizza2);
        currentOrder.removePizza(pizza3);

        //THEN
        assertAll(
                ()-> assertTrue(currentOrder.getPizzas().isEmpty()),
                ()-> assertEquals(0, (int) currentOrder.getOrderedAmountForType(TYPE_A)),
                ()-> assertEquals(0, (int) currentOrder.getOrderedAmountForType(TYPE_B)),
                ()-> assertEquals(0, (int) currentOrder.getOrderedAmountForType(TYPE_C))
        );

    }

}