import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Rectangle a = new Rectangle(10, 20);
//        Rectangle b = new Rectangle(3, 9);
//        Rectangle c = new Rectangle(4, 9);
//        Rectangle d = new Rectangle(5, 20);
//        Rectangle e = new Rectangle(2, 8);
//        //1
//        Rectangle[] rectangles = {a, b, c, d, e};
//        for (Rectangle r : rectangles) {
//            System.out.println(r.calculateAria());
//        }
//        // varianta mea Object [] rectanglesAria = {a.calculateAria(),b.calculateAria(),c.calculateAria(),d.calculateAria(),e.calculateAria()};
////        for (Object area : rectanglesAria ) {
////            System.out.println(area);
//
//        //2
//        System.out.println(Rectangle.areaSum(a,b,c,d,e));
//        System.out.println(Rectangle.areaSum(rectangles));

//        for (int i =0; i<args.length; i++){
//            int lenght = (int)(Math.random() * 100+ 1);
//            int height = (int)(Math.random() * 100+1);
//            Rectangle rectangle = new Rectangle(lenght,height);
//            System.out.println(rectangle.calculateAria());
//        }
        Scanner in = new Scanner(System.in);
        System.out.print("Enter height: ");
        
        int height = in.nextInt();
        System.out.print("Enter lenght: ");
        int lenght = in.nextInt();
        Rectangle r = new Rectangle(height,lenght);
        System.out.println("Aria este : " + r.calculateAria());





    }
}
