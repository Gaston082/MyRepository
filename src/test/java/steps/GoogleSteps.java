package steps;

import io.cucumber.java.en.*;
import pages.GooglePage;


public class GoogleSteps extends GooglePage {

    GooglePage google = new GooglePage();

    @Given("°navego en google$")
    public void navegateToGoogle(){
    google.navegateToGoogle();
    }
   
    @When("°busco algo$")
    public void buscoEnGoogle(){

    }
   
    @And("°clickear en buscar$")
    public void clickBotonBuscar(){

    }
    
    @Then("°tengo resultado$")
    public void encuentroEnAGoogle(){

    }

}
