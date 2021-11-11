package tuan10;

abstract public class shape {
    protected int x,y;
    Shape(int x,int y){
        x= x;
        y = y;
    }
    abstract public void draw();
    abstract public void erase();
    public void moveTo(int x ,int y){
        erase();
        x= x;
        y =y;
        draw();
    }
}
