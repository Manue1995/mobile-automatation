package com.mobile_automation.taks;

import com.mobile_automation.utils.ExcelPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.mobile_automation.userinterface.CustomerDataUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CustomerData implements Task {

    private final int index;
    public static List<Map<String, String>> leerExcel = new ArrayList<>();

    public CustomerData(int index) {
        this.index = index;
    }

    public static CustomerData withIndex(int index) {
        return new CustomerData(index);
    }

    @Override
    public <T extends Actor> void performAs(T Manuel) {

        try {

            leerExcel = ExcelPrincipal.leerDatosDeHojaDeExcel("Data2.xlsx", "CreationData");


                Manuel.attemptsTo(

                    Click.on(CONFIRM_PRODUCT),
                    Enter.theValue(leerExcel.get(index).get("FullName")).into(FULL_NAME),
                    Enter.theValue(leerExcel.get(index).get("AddressLine1")).into(ADDRESS_LINE_1),
                    Enter.theValue(leerExcel.get(index).get("AddressLine2")).into(ADDRESS_LINE_2),
                    Enter.theValue(leerExcel.get(index).get("City")).into(CITY),
                    Enter.theValue(leerExcel.get(index).get("State")).into(STATE),
                    Enter.theValue(leerExcel.get(index).get("ZipCode")).into(CODE),
                    Enter.theValue(leerExcel.get(index).get("Country")).into(COUNTRY),
                    Click.on(BUTTON_PAYMENT)

            );



        } catch (IOException e) {

            throw new RuntimeException(e);
        }

    }

    public static CustomerData customerData() {
        return instrumented(CustomerData.class);
    }
}
