package carpack;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;





@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Use_Cases",
		glue="carpack",
		strict = true,
		plugin = {"pretty","html:target/outcucumber.html"}
)

public class Test {
	

	
	

}




