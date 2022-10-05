package app;

import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        var app = Javalin.create(/*config*/)
            .get("/health", ctx -> ctx.result("Ok"))
            .start(8080);
    }
}
