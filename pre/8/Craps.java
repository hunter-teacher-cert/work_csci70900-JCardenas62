import java.security.SecureRandom;

public class Craps {

    public static final SecureRandom generator = new SecureRandom();

    public enum GameState {
        CONTINUE,
        WON,
        LOSE
    };

//constants for the game
    public static final int SNAKE_EYES = 2;
    public static final int TREY = 3;
    public static final int SEVEN = 7;

    public static final int YO_LEVEN = 11;
    public static final int BOX_CARS = 12;

//main
    public static void main( String ... args ) {

        int point = 0;
        GameState state;

        int sumOfDice = roll();

        switch( sumOfDice ) {
//rounds
//conditions to win or lose
            case SEVEN:
            case YO_LEVEN:
                state = GameState.WON;
                break;

            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                state = GameState.LOSE;
//the point condition
            default:
                state = GameState.CONTINUE;
                point = sumOfDice;
                System.out.printf( "Point is %d\n", point );
                break;

        }

        while( state == GameState.CONTINUE ) {

            sumOfDice = roll();

            if( sumOfDice == point ) {
                state = GameState.WON;
            } else if( sumOfDice == SEVEN ) {
                state = GameState.LOSE;
            }
        }

        if( state == GameState.WON ) {
            System.out.println( "You won" );
        } else {
            System.out.println( "You lose" );
        }

    }

    public static int roll() {

        int first = 1 + generator.nextInt( 6 );
        int second = 1 + generator.nextInt( 6 );

        System.out.printf( "You rolled %d and %d.%n", first, second );
        return first + second;

    }
}
