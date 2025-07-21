package com.mobile_automation.questions;


import com.mobile_automation.userinterface.HomePageUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LoginSuccessful implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        return HomePageUI.MESSAGE_DASBOARD.resolveFor(actor).isVisible();

    }
    public static LoginSuccessful displayed(){

        return new LoginSuccessful();
    }

}
