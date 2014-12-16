package cucumber.examples.java.testNG.stepDefinitions;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlException;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.model.testsuite.TestSuite;
import com.eviware.soapui.support.SoapUIException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Contains step definitions for two feature files: first.feature & second.feature
 * @author jk
 */
public class SoapUiStepdefs {

    static Logger log = Logger.getLogger(SoapUiStepdefs.class);
    WsdlProject project ; 
    TestSuite testSuite ;
    TestCase testCase ;    
    @Given("^I am having soap project- (.+)$")
    public void givenHavingSoapProject(String projectName ) throws XmlException, IOException, SoapUIException {
    	project = new WsdlProject("C:\\Users\\satish\\Desktop\\soapproject\\"+projectName ); 
        log.info("I am having soap project"+"<br/>");
    }


    @When("^I execute testsuite- (.+)$")
    public void whenISearchForElement(String testSuitename) {
        log.info("When I execute test suite");
        testSuite = project.getTestSuiteByName(testSuitename); 
    }

    @Then("I should see all testcase")
    public void thenIShouldSeeThisElement() {
        log.info("Then I should see all testcase");
        
        testCase = testSuite.getTestCaseAt(0);
        //testCase = testSuite.getTestCaseByName( "ElementSpecificRequests TestCase" );
        System.out.println(">>>>>>>>>>>>"+testCase.getName());
        System.out.println(">>>>>>>>>>>>"+testCase.getDescription());
        log.info("testCase name is >>"+testCase.getName());
    }
}
