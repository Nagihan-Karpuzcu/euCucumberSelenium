package com.vytrack.step_definitions;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){


    }
    @After
    public void tearDown(){
       // Driver.closeDriver();
        System.out.println("after mthod ");
    }

    @Before("@db") //bunlar database icin
    public void setUpdb(){
        System.out.println("databas");
    }
    @After("@db")
    public void closeDb(){
        System.out.println("database");
    }
}
