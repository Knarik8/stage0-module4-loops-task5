package school.mjc.stage0.loops.task5;

public class Rectangle {
    public static void printRectangleFrom8s(int length, int height){
        for(int x = 1; x <=height; x++) {
            System.out.print(8);
            for (int y = 2; y < length+1; y++) {
                if (x >= 2 && x < height && y < length) {
                    System.out.print(" ");
                } else {
                    System.out.print(8);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        printRectangleFrom8s(0, 0);
    }
}
