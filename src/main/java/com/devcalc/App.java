package com.devcalc;

import io.javalin.Javalin;

public class App {
    public static void main(String[] args) {
        CalculatorService service = new CalculatorService();

        Javalin app = Javalin.create().start(7000);

        app.get("/add", ctx -> {
            int a = Integer.parseInt(ctx.queryParam("a"));
            int b = Integer.parseInt(ctx.queryParam("b"));
            ctx.result(String.valueOf(service.add(a, b)));
        });

        app.get("/subtract", ctx -> {
            int a = Integer.parseInt(ctx.queryParam("a"));
            int b = Integer.parseInt(ctx.queryParam("b"));
            ctx.result(String.valueOf(service.subtract(a, b)));
        });

        app.get("/multiply", ctx -> {
            int a = Integer.parseInt(ctx.queryParam("a"));
            int b = Integer.parseInt(ctx.queryParam("b"));
            ctx.result(String.valueOf(service.multiply(a, b)));
        });

        app.get("/divide", ctx -> {
            int a = Integer.parseInt(ctx.queryParam("a"));
            int b = Integer.parseInt(ctx.queryParam("b"));
            if (b == 0) {
                ctx.status(400).result("Cannot divide by zero");
            } else {
                ctx.result(String.valueOf(service.divide(a, b)));
            }
        });
    }
}
