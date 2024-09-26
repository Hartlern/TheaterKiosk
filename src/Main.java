import java.util.Scanner;
public class Main
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        System.out.println( "Welcome to the Theater!\nWhat is your age?" );
        int age;
        if( scan.hasNextInt() )
        {
            age = scan.nextInt();
            if( age >= 21 )
            {
                System.out.println( "You get a wristband" );
            }
            //program does nothing if not >= 21
        }
    }
}