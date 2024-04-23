package exercise_14;

public abstract class Decorator implements Widget{
    protected Widget widget;

    protected Decorator(Widget widget){
        this.widget = widget;
    }

    @Override
    public void draw(){
        widget.draw();
    }
}
