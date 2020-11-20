package com.martinnnachi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class MessageGeneratorImpl implements MessageGenerator {

    // == Constants ==
    private static final Logger log = LoggerFactory.getLogger( MessageGeneratorImpl.class );

    // == Fields ==
    @Autowired
    private Game game;
    private int guessCount = 10;

    @PostConstruct
    public void init() {
        log.info( "The value of game is {}", game );
    }


    // == Public Methods ==
    @Override
    public String getMainMessage() {
        return "Calling getMainMessage()";
    }

    @Override
    public String getResultMessage() {
        return "Calling getResultMessage()";
    }


}
