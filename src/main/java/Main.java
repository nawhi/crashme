import spark.Spark;

import static spark.Spark.get;

public class Main {

    private static final String HOMEPAGE_TEXT =
            "Welcome to my site!<br />" +
            "Try out this <a href=\"/crash\">Experimental Feature</a>";

    public static void main(String[] args) {
        Spark.port(8080);
        get("/", (req, res) -> HOMEPAGE_TEXT);
        get("/crash", (req, res) -> {
            System.exit(1);
            return "";
        });
    }
}
