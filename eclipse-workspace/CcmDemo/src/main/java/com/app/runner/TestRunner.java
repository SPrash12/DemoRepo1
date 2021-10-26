package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue={"com.app"},
monochrome = true
//,plugin= {"pretty","json:target/JSONReports"}
,plugin={"pretty","html:target/HtmlReports/reports.html",
		  "json:target/JSONReports/jsonreposrts.json",
		  "junit:targte/JUnitReports/reports.xml"}
,tags="@smoketest")

public class TestRunner {

}
