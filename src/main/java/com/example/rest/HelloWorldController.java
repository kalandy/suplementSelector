package com.example.rest;

/**
 * Created by marcinkalandyk on 24.04.2017.
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(value = "/suplement", method = RequestMethod.GET, produces = "application/json")
    public Suplement helloWorld() {
        return new Suplement("Ashwagandha", 37);
    }
    public static class Suplement{
        private String name;
        private int value;

        public Suplement(String name, int value){
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

}
