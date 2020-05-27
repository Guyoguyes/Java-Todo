import java.util.HashMap;
import java.util.Map;
import spark.template.handlebars.HandlebarsTemplateEngine;
import spark.ModelAndView;
import static spark.Spark.*;

public class App {
    public static void main(String[] args){
        staticFileLocation("/public");

        get("/", (req, res) ->{
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "/index.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
