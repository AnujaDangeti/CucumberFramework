package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/java/feature/resource.feature"},
        glue="steps",
        dryRun=false,
        monochrome=true,
        plugin = { "pretty","html:target/reports5.html" }
)
public class TestRunner {

}
