package com.mobile_automation.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomePageUI {

    public static final Target BUTTON_MAIN = Target.the("Boton de Menu")
            .locatedBy("//android.widget.ImageView[@content-desc='View menu']");

    public static final Target BUTTON_LOG_IN = Target.the("Boton de Menu para iniciar sesion")
            .locatedBy("//android.widget.TextView[@content-desc='Login Menu Item']");

    public static final Target USERNAME_FIELD = Target.the("Ingresar usuario")
            .locatedBy("//android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/nameET']");

    public static final Target PASSWORD_FIELD = Target.the("Ingresar Password")
            .locatedBy("//android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/passwordET']");

    public static final Target LOGIN_BUTTON = Target.the("Boton para iniciar sesion")
            .locatedBy("//android.widget.Button[@content-desc='Tap to login with given credentials']");

    public static final Target MESSAGE_DASBOARD = Target.the("Mensaje de Login Exitoso")
            .locatedBy("//android.widget.ImageView[@content-desc='App logo and name']");

    public static final Target MESSAGE_LOCKED= Target.the("Mensaje de login bloqueado")
            .locatedBy("//android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/passwordErrorTV']");


}
