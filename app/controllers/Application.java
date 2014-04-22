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

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result math() {
        ObjectNode result = Json.newObject();
        result.put("message", "Hello from Math action!");
        return ok(result);
    }

}
