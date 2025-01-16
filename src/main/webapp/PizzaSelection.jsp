<%@ page import="com.rattencorp.pizzajsp.model.menue.PizzaType" %>
<%@ page import="com.rattencorp.pizzajsp.view.PizzaPresentation" %>
<%@include file="common/PizzaHeader.jspf"%>

<jsp:useBean id="pizzaMenue" class="com.rattencorp.pizzajsp.service.PizzaMenuService" />
<jsp:useBean id="currentOrder" class="com.rattencorp.pizzajsp.model.order.CurrentOrder" />

<div id="pizza-menu">
<form action="PizzaSelectionController" method="post">

<!--  -->
    <%
        for(PizzaPresentation pizza : pizzaMenue.supplyMenu()){
    %>
    <!-- get image -->
    <h2>
        <%=pizza.pizzaType().name()%>
    </h2>
    <%if( pizza.pizzaType().vegetarian()) {%>
        <img src="icons/vegetarian.jpg" alt="vegetarian">
    <%}%>
    <%if( pizza.pizzaType().vegan()) {%>
        <img src="icons/vegan.jpg" alt="vegan">
    <%}%>

    <input type="button" value="+" name="${pizza.pizzaAppenderName()}" /> <!-- should add pizza to current order -->
    <input type="button" value="-" name="${pizza.pizzaAppenderName()}"/>
    <label>
        <input type="number" name="${pizza.pizzaAmointName()}"><%currentOrder.getOrderedAmountForType(pizza.pizzaType()); %></input>
    </label>

    <% } %>

    <input type="submit" value="Bestellung abschicken">
</form>
</div>

<div id="current-order">


</div>

<%@include file="common/PizzaFooter.jspf" %>