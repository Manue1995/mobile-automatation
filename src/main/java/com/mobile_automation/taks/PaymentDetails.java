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

import static com.mobile_automation.userinterface.PaymentDetailsUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PaymentDetails implements Task {

    private final int Card;
    public static List<Map<String, String>> leerExcel = new ArrayList<>();

    public PaymentDetails(int Card) {
        this.Card = Card;
    }

    public static PaymentDetails withCard(int Card) {
        return new PaymentDetails(Card);
    }

    @Override
    public <T extends Actor> void performAs(T Manuel) {

        try {

            leerExcel = ExcelPrincipal.leerDatosDeHojaDeExcel("Data2.xlsx", "Pay");

            Manuel.attemptsTo(

                    Enter.theValue(leerExcel.get(Card).get("FullName")).into(NAME),
                    Enter.theValue(leerExcel.get(Card).get("CardNumber")).into(CARD_NUMBER),
                    WaitUntil.the(EXPIRATION_DATE, isVisible()).forNoMoreThan(30).seconds(),
                    Enter.theValue("01/25").into(EXPIRATION_DATE),
                    Enter.theValue(leerExcel.get(Card).get("SecurityCode")).into(SECURITY_CODE),
                    Click.on(REVIEW_ORDER),
                    WaitUntil.the(PLACE_ORDER, isVisible()).forNoMoreThan(30).seconds(),
                    Click.on(PLACE_ORDER),
                    Click.on(BUTTON_CONTINUE_SHOPPIG)
            );

        } catch (IOException e) {

            throw new RuntimeException(e);
        }

    }

    public static PaymentDetails paymentDetails() {
        return instrumented(PaymentDetails.class);
    }
}
