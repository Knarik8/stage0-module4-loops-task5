package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void printHourglassOfGivenSize(int height) {
        for(int i = 1; i <= height; i++) {
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= height - i + 1; j++) {
                System.out.print("8 ");
            }
            System.out.println();
        }
        for(int i = height-1; i >= 1; i--) {
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(" ");
            }
            for (int j=i; j<=height; j++)
            {
                System.out.print("8 ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        printHourglassOfGivenSize(7);
    }
}
