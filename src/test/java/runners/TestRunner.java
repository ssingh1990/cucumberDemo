package runners;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import stepDefinations.Hooks;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "E:\\seleniumCucumber\\cucumber\\src\\features\\functionalTest",
        glue= {"stepDefinations"}

)
public class TestRunner {

}
