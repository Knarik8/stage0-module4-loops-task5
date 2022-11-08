package school.mjc.stage0.loops.task5;

public class Triangle {
    public static void printTriangle(int cathetusLength) {
        for(int x = 1; x <= cathetusLength; x++){
            System.out.print(8);
            for (int y = 2; y <= x; y++){
                System.out.print(8);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        printTriangle(9);
    }
}
