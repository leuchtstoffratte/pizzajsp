<%@ page import="com.rattencorp.pizzajsp.model.menue.PizzaType" %>
<%@ page import="com.rattencorp.pizzajsp.view.PizzaPresentation" %>
<%@include file="common/PizzaHeader.jspf"%>

<jsp:useBean id="pizzaMenu" class="com.rattencorp.pizzajsp.service.PizzaMenuService" scope="application"/>
<jsp:useBean id="currentOrder" class="com.rattencorp.pizzajsp.model.order.CurrentOrder" scope="session"/>

<div id="pizza-menu">

    <%
        for(PizzaPresentation pizza : pizzaMenu.supplyMenu()){
    %>
        <%@include file="pizza/PizzaDisplay.jspf" %>
    <% } %>
<form action="com.rattencorp.pizzajsp.controller.PizzaSelectionController">
    <input type="submit" value="Bestellung abschicken">
</form>
</div>

<div id="current-order">


</div>

<%@include file="common/PizzaFooter.jspf" %>