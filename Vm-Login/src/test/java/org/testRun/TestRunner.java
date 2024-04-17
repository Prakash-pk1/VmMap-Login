package org.testRun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\prakash\\eclipse-workspace\\practice\\Vm-Login\\src\\test\\resources\\log.feature\\vmlogin.feature",
                 glue="org.testRun",
                 dryRun=false)

public class TestRunner {

}
