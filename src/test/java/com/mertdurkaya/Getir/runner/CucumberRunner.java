package com.mertdurkaya.Getir.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
        plugin = {"json:target/cucumber.json"},
        glue = "com.mertdurkaya.Getir.test")
public class CucumberRunner {
}