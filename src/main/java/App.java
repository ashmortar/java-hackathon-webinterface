
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;



public class App{
    public static void main(String[] args) {
        staticFileLocation("/public");

        //get: landing page
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        //get: show all teams

        //get: show form to add a new team

        //post: process new team form

        //get: show a single team and form to add members

        //post: process form to add members

        //get: show form to update team name/description

        //post: process update form



    }
}