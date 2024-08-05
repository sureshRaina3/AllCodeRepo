package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features",
		glue ="StepDefenitions",
		monochrome = true,
		dryRun = false
		//snippets = SnippetType.CAMELCASE

		)
public class CucumberrunnerFile extends AbstractTestNGCucumberTests {

}
