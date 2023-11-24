package org.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions

(features = "C:\\Users\\yogaa\\eclipse-workspace\\freamworks\\Compets\\feature\\Login.feature", glue = "stepDefinitions",
		// dryRun = true,
		monochrome = false,

		plugin = { "pretty", "html:test-output" })

public class Runner {

}
