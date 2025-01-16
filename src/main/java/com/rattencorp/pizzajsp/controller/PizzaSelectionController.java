package com.rattencorp.pizzajsp.controller;


import com.rattencorp.pizzajsp.model.menue.PizzaMenu;
import com.rattencorp.pizzajsp.model.menue.PizzaType;
import com.rattencorp.pizzajsp.model.order.CurrentOrder;
import jakarta.inject.Inject;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/select-pizzas")
public class PizzaSelectionController extends HttpServlet {

    @Inject
    private PizzaMenu menu;

    @Inject
    private CurrentOrder currentOrder;


    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response){





    }

}
