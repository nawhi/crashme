import spark.Request;
import spark.Response;

class CrashController {
    static String crash(Request request, Response response) {
        return new DeathByRecursion().die();
    }

    private static class DeathByRecursion {
        public String die() {
            return " " + die();
        }
    }
}
