package school.mjc.stage0.loops.task5;

public class Cross {
    public static void printCross(int sideLength) {
        for (int x = 1; x <= sideLength; x++){
            if (x != sideLength/2+1){
                System.out.print(" ");
            } else {
                System.out.print(8);
            }
            for (int y = 2; y <= sideLength; y++){
                if (y != sideLength/2+1 && x != sideLength/2+1){
                    System.out.print(" ");
                } else {
                    System.out.print(8);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        printCross(9);
    }
}
