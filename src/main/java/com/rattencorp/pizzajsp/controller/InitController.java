package com.rattencorp.pizzajsp.controller;


import com.rattencorp.pizzajsp.model.menue.PizzaType;
import com.rattencorp.pizzajsp.model.order.CurrentOrder;
import jakarta.mvc.Controller;

@Controller
public class InitController  {


    /**
     * Test this error
     *
     * org.apache.jasper.JasperException: JBWEB004062: Unable to compile class for JSP:
     *
     * JBWEB004060: An error occurred at line: 14 in the jsp file: /pizza/PizzaDisplay.jspf
     * The method getOrderedAmountForType(PizzaType) is undefined for the type CurrentOrder
     * 11:         <img src="icons/vegan.jpg" alt="vegan">
     * 12:     <%}%>
     * 13:     <label>
     * 14:         <input type="number" name="${pizza.pizzaAmountName()}"><%currentOrder.getOrderedAmountForType(pizza.pizzaType()); %></input>
     * 15:     </label>
     * 16:
     * 17:     <form action="${pageContext.request.contextPath}/select-pizzas-controller" method="post">
     */
    public Integer someMethod(){

        var currentOrder = new CurrentOrder();

        return currentOrder.getOrderedAmountForType(new PizzaType("bla", 100, true, true));

    }



}
