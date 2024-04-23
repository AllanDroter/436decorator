package exercise_14;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Widget widget = new TextField(80, 24); // basic one
        widget.draw();
        Widget widget2 = new ScrollDecorator(new TextField(80, 24)); // add scroll bar
        widget2.draw();
        Widget widget3 = new BorderDecorator(new BorderDecorator(new ScrollDecorator(new TextField(80, 24)))); // add some borders
        widget3.draw();
    }
}