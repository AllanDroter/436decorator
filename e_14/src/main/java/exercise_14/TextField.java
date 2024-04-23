package exercise_14;

public class TextField implements Widget{

    int width;
    int height;

    public TextField(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("TextField width: " + width + " height: " + height);
    }
}
