package com.mobile_automation.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.mobile_automation.userinterface.AddProductUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class AddProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T Manuel) {



        Manuel.attemptsTo(

                WaitUntil.the(CHOOSE_PRODUCT, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(CHOOSE_PRODUCT), Click.on(ADD_PRODUCT_CART),
                WaitUntil.the(PRODUCT_CART, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(PRODUCT_CART)

        );

    }
    public static AddProduct addProduct() {
        return instrumented(AddProduct.class);
    }
}
