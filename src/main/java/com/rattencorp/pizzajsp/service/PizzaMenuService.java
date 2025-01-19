package com.rattencorp.pizzajsp.service;

import com.rattencorp.pizzajsp.model.menue.PizzaMenu;
import com.rattencorp.pizzajsp.view.PizzaPresentation;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import jakarta.inject.Named;
import jdk.jfr.Name;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@ApplicationScoped
@Named
public class PizzaMenuService implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private static final Logger LOGGER = LogManager.getLogger(PizzaMenuService.class);

    @Inject
    private PizzaMenu menu;

    /**
     * since this is used with jsp, constructor injection is not an option
     */
    public PizzaMenuService(){
        if (menu == null){
            menu = new PizzaMenu(); //This breaks some of the later plans
            LOGGER.fatal("Jsp is a shitty tech that can't handle constuctor injection");
        }
    }


    public List<PizzaPresentation> supplyMenu(){
        return menu.getMenuPizzaTypes()
                .stream()
                .map(PizzaPresentation::fromPizzaType)
                .toList();
    }


}
