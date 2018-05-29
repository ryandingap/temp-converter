package com.appiancorp;

import io.javalin.Javalin;

public class TempConverter {
  public static void main(String[] args) {
    Javalin app = Javalin.start(7000);
    app.get("/c2f", ctx -> ctx.result(c2f(ctx.queryParam("temp"))));
    app.get("/f2c", ctx -> ctx.result(f2c(ctx.queryParam("temp"))));
  }

  private static String c2f(String input) {
    Float c = Float.parseFloat(input);
    Float f = c*9.0f/5.0f + 32.0f;

    return f.toString();
  }

  private static String f2c(String input) {
    Float f = Float.parseFloat(input);
    Float c = (f-32.0f)*5.0f/9.0f;

    return c.toString();
  }
}
