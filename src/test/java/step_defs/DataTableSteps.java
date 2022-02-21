package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.lang.reflect.Type;
import java.util.List;

public class DataTableSteps {
    
    @Given("user is on NambaFood")
    public void user_is_on_namba_food() {
        System.out.println("User is on Namba Food");
    }
    @When("user click on Foods")
    public void user_click_on_foods() {
        System.out.println("User clicked Foods button");
       
    }
    @Then("user should find category")
    public void user_should_find_category() {
        System.out.println("User found Sushi");
       
    }
    @When("user click on Sushi")
    public void user_click_on_sushi() {
        System.out.println("User see list of Cafes");
       
    }
    @Then("user should see List of cafe")
    public void user_should_see_list_of_cafe() {
        System.out.println();
       
    }
    @Then("user should scroll dawn the page to Arigato cafe")
    public void user_should_scroll_dawn_the_page_to_arigato_cafe() {
        System.out.println("User scroll down Arigato");
       
    }
    @When("useer click on Arigato")
    public void useer_click_on_arigato() {
        System.out.println("User clicked on Arigato");
        
       
    }
    @Then("user should see Arigato menu")
    public void user_should_see_arigato_menu() {
        System.out.println("User see Arigato menu");
       
    }
    @Then("user should see find Kimchi")
    public void user_should_see_find_kimchi() {
        System.out.println("User found Kimchi");
       
    }
    @When("user increase Kimchi amount to {int}")
    public void user_increase_kimchi_amount_to(Integer kimchiAmount ) {
        System.out.println("User increase Kimchi amount to: " + kimchiAmount);
       
    }
    @When("user should click on Order button")
    public void user_should_click_on_order_button() {
        System.out.println("User clicked on Order button");
        
       
    }
    @Then("on the card User should see {string}")
    public void on_the_card_user_should_see(String integer) {
        System.out.println("Total Price: " + integer);
       
    }


    @Then("following menu bar should be displayed on Home page")
    public void following_menu_bar_should_be_displayed_on_home_page(io.cucumber.datatable.DataTable dataTable) {


    }


}
