package com.mobile_automation.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class AddProductUI {

    public static final Target CHOOSE_PRODUCT = Target.the("Boton de Menu")
            .locatedBy("(//android.widget.ImageView[@content-desc='Product Image'])[4]");

    public static final Target ADD_PRODUCT_CART = Target.the("Agregar producto carrito")
            .locatedBy("//android.widget.Button[@content-desc='Tap to add product to cart']");

    public static final Target PRODUCT_CART = Target.the("ir al carrito de compras")
            .locatedBy("//android.widget.ImageView[@content-desc='Displays number of items in your cart']");

    public static final Target VALIDATE_PRODUCT_CART = Target.the("Boton de Menu")
            .locatedBy("//android.widget.Button[@content-desc='Confirms products for checkout']");


}
