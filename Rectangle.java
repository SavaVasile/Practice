public class Rectangle {
    private int height;
    private int length;

    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }
    public int calculateAria(){
        return this.height * this.length;

    }
    public static int areaSum(Rectangle...rectangles){
        int sum = 0;
        for (Rectangle r:rectangles){
            sum += r.calculateAria();
        }
        return sum;
    }



}
