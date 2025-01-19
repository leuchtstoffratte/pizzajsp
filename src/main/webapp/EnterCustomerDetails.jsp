<%@include file="common/PizzaHeader.jspf"%>

<jsp:useBean id="customerDetails" class="com.rattencorp.pizzajsp.model.order.PizzaCustomer" scope="session" />
    <div id="customer-address">
        <form action="${pageContext.request.contextPath}/process-order" method="post">
            <label>
                Name
                <input type="text">
            </label><br/>
            <label>
                Straße
                <input type="text">
            </label><br/>
            <label>
                Stadt
                <input type="text">
            </label><br/>
            <input type="submit" value="Kostenpflichtig bestellen" />
        </form>

    </div>
<%@include file="common/PizzaFooter.jspf"%>
