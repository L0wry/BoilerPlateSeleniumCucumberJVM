import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = false,
features = {"/Users/mattlowry/dev/personal/BoilerPlateUISelenumJava/src/test/resources/features/test.feature:6"},
plugin = {"json:./target/reports/cucumber/1.json"},
monochrome = false,
tags = {},
glue = { "step_definitions" })
public class Parallel01IT {
}
