package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Feature/Login.feature"},
        glue = {"Steps"},monochrome = true,
        plugin={"pretty","html:target/htmlReport","json:target/report.json","junit:target/report.xml"
        }
)

public class LoginRunner {
}
