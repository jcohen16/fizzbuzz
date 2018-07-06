package mvn.bdd.unit;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    format = {
        "json:target/cucumber/results.json",
        "html:target/cucumber/results.html",
        "pretty"
    },
    features = "src/test/resources/features",
    tags = {"@feature_fizzbuzz"}
)

public class CucumberTest {
}
