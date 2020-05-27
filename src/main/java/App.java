import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import models.TODO;
import spark.template.handlebars.HandlebarsTemplateEngine;
import spark.ModelAndView;
import static spark.Spark.*;

public class App {
    public static void main(String[] args){
        staticFileLocation("/public");

        get("/", (req, res) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/post-todo", (req, res) ->{
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "post-todo.hbs");
        }, new HandlebarsTemplateEngine());

        post("/todos", (req, res) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            String task = req.queryParams("task");
            String description = req.queryParams("description");
            String completeDate = req.queryParams("completeDate");
            TODO todo = new TODO(task, description, completeDate);
            return new ModelAndView(model, "todo.hbs");
        }, new HandlebarsTemplateEngine());

        get("/todos", (req, res) ->{
            Map<String, ArrayList<Object>> model = new HashMap<>();
            ArrayList<Object> todos = TODO.getAll();
            model.put("todo", todos);
            return new ModelAndView(model, "todo.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
