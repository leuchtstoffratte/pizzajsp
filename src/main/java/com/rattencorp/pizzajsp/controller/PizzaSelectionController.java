package com.rattencorp.pizzajsp.controller;


import com.rattencorp.pizzajsp.model.menue.PizzaMenu;
import com.rattencorp.pizzajsp.model.menue.PizzaType;
import com.rattencorp.pizzajsp.model.order.CurrentOrder;
import com.rattencorp.pizzajsp.model.order.OrderedPizza;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;


@WebServlet(urlPatterns = "/select-pizzas-controller")
@SessionScoped
public class PizzaSelectionController extends HttpServlet {

    private static final Logger LOGGER = LogManager.getLogger(PizzaSelectionController.class);

    @Inject
    private PizzaMenu menu;

    @Inject
    private CurrentOrder currentOrder;



    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response){



        LOGGER.error("request: {}", request);
        LOGGER.error("pizzas: {}", currentOrder.getPizzas());


/*        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
*/    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response){



        LOGGER.error("request: {}", request);
        LOGGER.error("pizzas: {}", currentOrder.getPizzas());


  /*      RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
  */  }

}
