package com.martinnnachi;

public class MethodChallenge {
    public static void main(String[] args) {

        int position = calculateHighScorePosition( 1500 );
        displayHighScorePosition( "Martin", position );
        position = calculateHighScorePosition( 900 );
        displayHighScorePosition( "Gloria", position );
        position = calculateHighScorePosition( 400 );
        displayHighScorePosition( "Alex", position );
        position = calculateHighScorePosition( 50 );
        displayHighScorePosition( "Edinam", position );
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if ((score >= 500) && (score < 1000)) {
            return 2;
        } else if ((score >= 100) && (score < 500)) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void displayHighScorePosition(String name, int position) {

        System.out.println( name + " managed to get to position " + position + " on the high score table" );
    }
}
