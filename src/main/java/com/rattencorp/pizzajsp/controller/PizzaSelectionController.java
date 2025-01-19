package com.rattencorp.pizzajsp.controller;


import com.rattencorp.pizzajsp.model.menue.PizzaMenu;
import com.rattencorp.pizzajsp.model.menue.PizzaType;
import com.rattencorp.pizzajsp.model.order.CurrentOrder;
import com.rattencorp.pizzajsp.model.order.OrderedPizza;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/select-pizzas")
@SessionScoped
public class PizzaSelectionController extends HttpServlet {

    private final PizzaMenu menu;

    private final CurrentOrder currentOrder;

    @Inject
    public PizzaSelectionController(PizzaMenu menu, CurrentOrder currentOrder){
        this.menu = menu;
        this.currentOrder = currentOrder;
    }


    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response){




    }

}
