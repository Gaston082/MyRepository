package runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src\test\resource\features",
    glue = "steps0"
)

public class runner {
    public static void main(String[] args) {
        
    }

}

