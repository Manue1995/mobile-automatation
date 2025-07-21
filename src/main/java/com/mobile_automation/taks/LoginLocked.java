package com.mobile_automation.taks;

import com.mobile_automation.utils.ExcelPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.mobile_automation.userinterface.HomePageUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginLocked implements Task {

    public static List<Map<String,String>> leerExcel = new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T Manuel) {

        try {
            leerExcel = ExcelPrincipal.leerDatosDeHojaDeExcel("Data2.xlsx","DataLogin");

        Manuel.attemptsTo(

                WaitUntil.the(BUTTON_MAIN, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BUTTON_MAIN), Click.on(BUTTON_LOG_IN),
                WaitUntil.the(USERNAME_FIELD, isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(leerExcel.get(1).get("Mail")).into(USERNAME_FIELD),
                Enter.theValue(leerExcel.get(0).get("Password")).into(PASSWORD_FIELD),
                Click.on(LOGIN_BUTTON)

        );

             } catch (IOException e) {
                 throw new RuntimeException(e);
        }

    }

    public static LoginLocked loginLocked() {
        return instrumented(LoginLocked.class);
    }
}
