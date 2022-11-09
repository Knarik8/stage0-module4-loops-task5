package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void printHourglassOfGivenSize(int height) {
        for(int i = 1; i <= height/2+1; i++) {
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= height+2-i-i; j++) { //5 , 3 , 1
                System.out.print("8");
            }
            System.out.println();
        }
        for(int i = (height/2+1)-1; i >= 1; i--) {
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(" ");
            }
            for (int j=i; j<height+2-i; j++) //3, 5,7
            {              // i = 2 ---1    4/6
                System.out.print("8");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        printHourglassOfGivenSize(5);
    }
}
