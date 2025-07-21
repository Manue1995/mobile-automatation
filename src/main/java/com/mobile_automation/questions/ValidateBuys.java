package com.mobile_automation.questions;

import com.mobile_automation.userinterface.PaymentDetailsUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateBuys implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        return PaymentDetailsUI.SUCCESSFUL_PURCHASE_MESSAGE.resolveFor(actor).isVisible();
    }

    public static ValidateBuys displayed() {

        return new ValidateBuys();
    }


}
