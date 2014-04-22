package controllers;

import play.*;
import play.mvc.*;
import play.libs.F.*;
import play.libs.Json;
import play.libs.Json.*;

import views.html.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import application.*;

public class Factorial extends Controller {

    /**
     *
     */
    public static Promise<Result> factorial() {
        Promise<String> promiseOfValue = computeFactorialAsynchronously();
        return promiseOfValue.map(
            new Function<String, Result>() {
                public Result apply(String value) {
                    ObjectNode result = Json.newObject();
                    result.put("message", "Got result: " + value);
                    return ok(result);
                } 
            }
        );
    }
    
    /**
     *
     */
    private static Promise<String> computeFactorialAsynchronously() {
        Function0<String> func = new Function0<String>() {
            public String apply() {
                return computeFactorial();
            }
        };
        return Promise.promise(func);
    }

    /**
     *
     */
    private static String computeFactorial() {
        Calculate calc = new Calculate();
        return String.valueOf(calc.factorial());
    }
}
