package com.mobile_automation.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class CustomerDataUI {

    public static final Target CONFIRM_PRODUCT = Target.the("Confirmar producto")
            .locatedBy("//android.widget.Button[@content-desc='Confirms products for checkout']");

    public static final Target FULL_NAME = Target.the("Ingresar nombre completo")
            .locatedBy("//android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/fullNameET']");

    public static final Target ADDRESS_LINE_1 = Target.the("Ingrese primera direccion")
            .locatedBy("//android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/address1ET']");

    public static final Target ADDRESS_LINE_2 = Target.the("Ingrese segunda direccion")
            .locatedBy("//android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/address2ET']");

    public static final Target CITY = Target.the("Ingrese ciudad")
            .locatedBy("//android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/cityET']");

    public static final Target STATE = Target.the("Ingrese estado")
            .locatedBy(" //android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/stateET']");

    public static final Target CODE = Target.the("Codigo postal")
            .locatedBy("//android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/zipET']");

    public static final Target COUNTRY = Target.the("Ingrese Pais")
            .locatedBy(" //android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/countryET']");

    public static final Target BUTTON_PAYMENT = Target.the("Boton para ir a metodo de pago")
            .locatedBy("//android.widget.Button[@content-desc='Saves user info for checkout']");


}
