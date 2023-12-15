package CucumberBDD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"src/test/java/CucumberBDD/LoginPage.feature"},

        glue = {"StepDefinition"},
        monochrome = true,
        plugin = {"pretty","html:target/cucumber-reports/reports.html"}

)

        public class TestRunner {


}
