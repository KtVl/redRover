package lesson6;

public class circleDrawing {
    public static void main(String[] args) {
        // MM and .. l = 2r x^2 + y^2 = r^2
        int radius = 10;
        for (int y = radius; y >= -radius; y--){
            for (int x = -radius; x <= radius; x++){
                if ((x * x + y * y) <= radius*radius){
                    System.out.print("MM");
                } else {
                    System.out.print("..");
                }
            }
            System.out.println();
        }
    }
}
