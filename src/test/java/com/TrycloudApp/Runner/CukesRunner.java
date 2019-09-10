package com.TrycloudApp.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

 plugin = {
         "json:target/cucumber.json",
         "html:target/default-cucumber-reports",
         "rerun:target/rerun.txt"
         },
         tags = {"@Upload_File"},
         features = {"src\\test\\resourses\\features\\uploadFile.feature"},
        ////to specify where are the features
         //feature contains scenarios
         //every scenario is like a test
         //where is the implementation for features
         glue = {"com\\TrycloudApp\\Step_Definitions"},
         //dry run - to generate step definitions automatically
         //you will see them in the console output
         dryRun = false


         )
public class CukesRunner {
}
