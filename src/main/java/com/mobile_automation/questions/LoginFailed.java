package com.mobile_automation.questions;

import com.mobile_automation.userinterface.HomePageUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LoginFailed implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        return HomePageUI.MESSAGE_LOCKED.resolveFor(actor).isVisible();
    }
    public static LoginFailed displayed(){

        return new LoginFailed();
    }
}
