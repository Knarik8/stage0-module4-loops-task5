package school.mjc.stage0.loops.task5;

public class Square {
    public static void printSquareFrom8s(int sideLength){
        for(int x = 1; x <=sideLength; x++) {
            System.out.print(8);
            for (int y = 2; y < sideLength+1; y++) {
                if (x >= 2 && x < sideLength && y < sideLength) {
                    System.out.print(" ");
                } else {
                    System.out.print(8);
                }
            }
        System.out.println();
        }
    }
    public static void main(String[] args){
        printSquareFrom8s(7);
    }
}
