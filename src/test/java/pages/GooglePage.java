package pages;


public class GooglePage extends BasePage{

    public GooglePage(){
        super(driver);
    }

    public void buscar(){
        avegateToGoogle("https://www.google.com/"); 
    }
        
}
