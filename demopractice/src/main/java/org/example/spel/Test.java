package org.example.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spelconfig.xml");
        Demo demo = context.getBean("demo",Demo.class);
        System.out.println(demo);

        /**
        // Writing API using parser
        SpelExpressionParser temp = new SpelExpressionParser();
        Expression exp = temp.parseExpression("23+56");
        System.out.println(exp.getValue());*/
    }
}
