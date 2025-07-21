package com.mobile_automation.stepDefinitions;

import com.mobile_automation.questions.LoginFailed;
import com.mobile_automation.questions.LoginSuccessful;
import com.mobile_automation.taks.Login;
import com.mobile_automation.taks.LoginLocked;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefinitions {

    private Actor Manuel;

    @Given("que el usuario abre la aplicación")
    public void queElusuarioAbreLaAplicación() {

        Manuel = OnStage.theActorInTheSpotlight();

    }

    @When("el usuario ingresa credenciales validas")
    public void elUsuarioIniciaSesiónConElUsuarioYContraseña() {

        OnStage.theActorInTheSpotlight().attemptsTo(Login.iniciar());

    }

    @When("ingresa {string} y {string}")
    public void ingresaY(String string, String string2) {

        OnStage.theActorInTheSpotlight().attemptsTo(LoginLocked.loginLocked());
    }

    @Then("debería ver el mensaje {string}")
    public void deberíaVerElMensaje(String string) {

        //Crea un diccionario que evalua preguntas de un elemento visible
        Map<Question<Boolean>, String> mensajes = Map.of(

                LoginSuccessful.displayed(), "Login Exitoso: Credenciales correctas",
                LoginFailed.displayed(), "Login Fallido: Usuario Bloqueado"

        );
        //Recorre el map buscando la primera condicion que se cumpla

        for (var entry : mensajes.entrySet()) {  //Representa cada iteracion  del bucle

            if (entry.getKey().answeredBy(OnStage.theActorInTheSpotlight())) { //Obtener la clave de la Question

                OnStage.theActorInTheSpotlight().should(seeThat(entry.getKey(), equalTo(true)));
                System.out.println(entry.getValue());
                return;
            }
        }
        throw new AssertionError("No se pudo determinar el resultado del login.");


    }


}
