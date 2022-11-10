package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height / 2  + height % 2; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k < height + 1 - i - i; k++){
                System.out.print(8);
            }
            System.out.println();
        }
        for (int i = height / 2; i >= 1; i--) {
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = i; j < height + 2 - i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        printHourglassOfGivenSize(5);
    }
}
