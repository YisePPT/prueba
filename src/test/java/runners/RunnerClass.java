package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin= ("pretty"),
        features= "src/test/java/features",
        glue= ("stepDefinition"),
        snippets = CucumberOptions.SnippetType.CAMELCASE

)


public class RunnerClass {
}
