package com.mobile_automation.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class PaymentDetailsUI {

    public static final Target NAME = Target.the("Ingrese nombre completo")
            .locatedBy("//android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/nameET']");

    public static final Target CARD_NUMBER = Target.the("Ingrese su numero de tarjeta")
            .locatedBy("//android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/cardNumberET']");

    public static final Target EXPIRATION_DATE = Target.the("Ingrese numero de expiracion")
            .locatedBy("//android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/expirationDateET']");

    public static final Target SECURITY_CODE = Target.the("Ingrese codigo de seguridad")
            .locatedBy("//android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/securityCodeET']");

    public static final Target REVIEW_ORDER = Target.the("Revisar Orden")
            .locatedBy("//android.widget.Button[@content-desc='Saves payment info and launches screen to review checkout data']");

    public static final Target PLACE_ORDER = Target.the("Confirmar Orden")
            .locatedBy("//android.widget.Button[@content-desc='Completes the process of checkout']");

    public static final Target SUCCESSFUL_PURCHASE_MESSAGE = Target.the("Mensaje de confirmacion de compra exitosa")
            .locatedBy("//android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/completeTV']") ;

    public static final Target BUTTON_CONTINUE_SHOPPIG = Target.the("Boton para seguir comprando")
            .locatedBy(" //android.widget.Button[@content-desc='Tap to open catalog']") ;








}
