import java.util.Objects;

public class Car {
    private String color;
    private int wheels;


    public Car(String color, int wheels) {
        this.color = color;
        this.wheels = wheels;
    }

    static  int sum (int...elements){
        int sum = 0;
        for(int element : elements){
           sum += element;
        }
        return sum;
    }
}
