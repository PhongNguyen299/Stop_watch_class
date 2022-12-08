import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean press = false;
        Scanner input = new Scanner(System.in);
        StopWatch watch = new StopWatch();

        watch.starTime();

        watch.start();

        while (true){
            if( press == true) break;
            else press = input.nextBoolean();
        }

        watch.stop();

        System.out.println(watch.getElapsedTime());
    }
}