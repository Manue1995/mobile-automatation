package com.mobile_automation.stepDefinitions;

import com.mobile_automation.questions.ValidateProduct;
import com.mobile_automation.taks.AddProduct;
import com.mobile_automation.taks.CustomerData;
import com.mobile_automation.taks.PaymentDetails;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class PurchaseProductStepDefinitions {

    @When("el usuario selecciona un producto y lo agrega al carrito")
    public void elUsuarioSeleccionaUnProductoYLoAgregaAlCarrito() {

        OnStage.theActorInTheSpotlight().attemptsTo(AddProduct.addProduct());

    }
    @Then("se debe visualizar el producto en el carrito")
    public void seDebeVisualizarElProductoEnElCarrito() {

        OnStage.theActorInTheSpotlight().should(seeThat(ValidateProduct.displayed(),equalTo(false)));
    }

    @When("completa los campos de nombre y dirección")
    public void completaLosCamposDeNombreYDirección() {

        OnStage.theActorInTheSpotlight().attemptsTo(CustomerData.customerData());

    }
    @When("completa el metodo de pago")
    public void completaElMetodoDePago() {

        OnStage.theActorInTheSpotlight().attemptsTo(PaymentDetails.paymentDetails());

    }

    @When("el usuario realiza el proceso de compra varias veces")
    public void elUsuarioRealizaElProcesoDeCompraVariasVeces() {

        for (int i = 0; i < 2; i++) {
            System.out.println(">>> Iteración número: " + (i + 1));

        OnStage.theActorInTheSpotlight().attemptsTo(
                AddProduct.addProduct(),
                CustomerData.withIndex(i),
                PaymentDetails.withCard(i)

             );
        }
    }

    @Then("debería visualizar un mensaje de confirmación de compra exitosa")
    public void deberíaVisualizarUnMensajeDeConfirmaciónDeCompraExitosa() {

        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidateProduct.displayed(), equalTo(false))
        );

        System.out.println("✅ Producto enviado correctamente ");

    }
}
