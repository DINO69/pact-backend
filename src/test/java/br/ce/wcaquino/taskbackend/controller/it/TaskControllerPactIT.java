package br.ce.wcaquino.taskbackend.controller.it;

import au.com.dius.pact.provider.junit.PactRunner;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import au.com.dius.pact.provider.junit.target.HttpTarget;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(PactRunner.class)
@Provider("test_provider")
//@PactUrl(urls = {"file:///C:\\GUI\\DEV\\pact-backend\\src\\test\\resources\\pacts\\test_consumer-test_provider.json"})
@PactFolder("pacts")
public class TaskControllerPactIT {

    @TestTarget
    public final Target target = new HttpTarget("localhost",8000);

    @Before
    public void setUp(){
        System.out.println(target.toString());
    }

    @State("Then Return Task 1 When Task Found")
    public void testThenReturnTask1WhenTaskFound(){}


    @State("Then Return Null When No Task Found")
    public void testThenReturnNullWhenNoTaskFound(){}

}