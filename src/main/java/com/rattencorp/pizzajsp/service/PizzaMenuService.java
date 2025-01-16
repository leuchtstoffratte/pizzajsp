package com.rattencorp.pizzajsp.service;

import com.rattencorp.pizzajsp.model.menue.PizzaMenu;
import com.rattencorp.pizzajsp.view.PizzaPresentation;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.io.Serializable;
import java.util.List;

@ApplicationScoped
public class PizzaMenuService implements Serializable {

    private static final long serialVersionUID = 1L;


    @Inject
    private PizzaMenu menu;

    public List<PizzaPresentation> supplyMenu(){
        return menu.getMenuPizzaTypes()
                .stream()
                .map(PizzaPresentation::fromPizzaType)
                .toList();
    }


}
