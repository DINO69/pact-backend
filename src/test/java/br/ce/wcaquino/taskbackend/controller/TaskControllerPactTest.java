package br.ce.wcaquino.taskbackend.controller;

import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;
import au.com.dius.pact.provider.spring.SpringRestPactRunner;
import au.com.dius.pact.provider.spring.target.SpringBootHttpTarget;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

@RunWith(SpringRestPactRunner.class)
@Provider("test_provider")
@PactFolder("pacts")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TaskControllerPactTest {

    @LocalServerPort
    private int port;

    @TestTarget
    public final Target target = new SpringBootHttpTarget();

    @Before
    public void setUp(){
        System.out.println(port);
    }

    @State("Then Return Task 1 When Task Found")
    public void testThenReturnTask1WhenTaskFound() {
    }


    @State("Then Return Null When No Task Found")
    public void testThenReturnNullWhenNoTaskFound() {
    }

}