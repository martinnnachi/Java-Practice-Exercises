package com.martinnnachi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger( Main.class );

    public static void main(String[] args) {
        log.info( "Guess The Number Game" );

        // create the context (container)
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext( AppConfig.class );

        // Get number generator bean from context (container)
        NumberGenerator numberGenerator = context.getBean( NumberGenerator.class );

        // Get message generator bean from context (container)
        MessageGenerator messageGenerator = context.getBean( MessageGenerator.class );
        log.info( "getMainMessage = {}", messageGenerator.getMainMessage() );
        log.info( "getResultMessage = {}", messageGenerator.getResultMessage() );
        System.out.println( "========================================" );

        // Call method next() to get a random number
        int number = numberGenerator.next();

        // Log generated number
        log.info( "number = {}", number );

        // Get game bean from context (container)
        Game game = context.getBean( Game.class );

        // Close context (container)
        context.close();

    }
}
