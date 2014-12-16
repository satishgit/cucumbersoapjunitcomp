@functional_test @other_meta_tag @soap_test
Feature: this is testsoapui project

  Scenario: Execute Soap project using cucumber
    Given I am having soap project- Periodic-Table-Example-Project-soapui-project.xml
    When I execute testsuite- periodictableSoap TestSuite
    Then I should see all       testcase

  Scenario: Execute Rest project using cucumber
    Given I am having soap project- Google-Map-REST-Project-soapui-project.xml
    When I execute testsuite- SampleTestSuite
    Then I should see all testcase
