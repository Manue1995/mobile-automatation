package com.mobile_automation.questions;

import com.mobile_automation.userinterface.AddProductUI;
import com.mobile_automation.userinterface.HomePageUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateProduct implements Question<Boolean > {

    @Override
    public Boolean  answeredBy(Actor actor) {

        return AddProductUI.VALIDATE_PRODUCT_CART.resolveFor(actor).isVisible();

    }

    public static LoginFailed displayed() {

        return new LoginFailed();
    }


}
