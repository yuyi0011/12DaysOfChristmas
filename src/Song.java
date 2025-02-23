import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Song {

    public void printSong() {

        for (int day = 1; day <= 12; day++) {
            System.out.print("On the ");
            System.out.print(day);

            switch (day) {
                case 1 ->  System.out.print("st");
                case 2 ->  System.out.print("nd");
                case 3 ->  System.out.print("rd");
                default -> System.out.print("th");
            }

            System.out.println(" day of Christmas my true love gave to me");

            switch (day) {
                case 12: System.out.println("Twelve drummers drumming,");
                case 11: System.out.println("Eleven pipers piping,");
                case 10: System.out.println("Ten lords a leaping,");
                case 9:  System.out.println("Nine ladies dancing,");
                case 8:  System.out.println("Eight maids a milking,");
                case 7:  System.out.println("Seven swans a swimming,");
                case 6:  System.out.println("Six geese a laying,");
                case 5:  System.out.println("Five golden rings,");
                case 4:  System.out.println("Four calling birds,");
                case 3:  System.out.println("Three French hens,");
                case 2:  System.out.println("Two turtle doves, and");
                default: System.out.println("A partridge in a pear tree.");
            }

            System.out.println();
        }
    }


    public static void main(String[] args) throws FileNotFoundException{


        PrintStream output =new PrintStream(new File("sangtekst.txt"));
        System.setOut(output);
        Song song = new Song();
        song.printSong();


    }

}
