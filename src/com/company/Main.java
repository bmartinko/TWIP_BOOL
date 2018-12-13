package com.company;
import java.util.*;
import javax.script.*;




public class Main {

    public static void main(String[] args) /*throws ScriptException*/{

        Scanner ab = new Scanner(System.in);
        System.out.println("Input an expression");
        String expression = ab.nextLine();



        expression = expression.replace(" ", "");
        expression = expression.replaceAll("&&", "*");
        expression = expression.replaceAll("\\|\\|", "+");
        expression = expression.replaceAll("!A", "0");
        expression = expression.replaceAll("!B", "0");
        expression = expression.replaceAll("A", "1");
        expression = expression.replaceAll("B", "1");
        expression = expression.replaceAll("A", "1");
        expression = expression.replaceAll("B", "1");


        System.out.println(expression);

        // Get JavaScript engine
        ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("js");

        try {
            // Evaluate the expression
            Object result = engine.eval(expression);

            System.out.println(result);
            if(result.equals(0) ){
                System.out.println("False");
            }else if (result.equals(1) || result.equals(2) || result.equals(3)){
                System.out.println("True");
            }
        }
        catch (ScriptException e) {
            // Something went wrong
            //e.printStackTrace();
            System.out.println("Error");
        }

    }
}
