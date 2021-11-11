package tuan10;

 public class Circle  extends shape{
     private int radiu;
     public Circle(int x,int y,int r){
        super( x, y);
        this.radiu = r;
     }
     public void draw(){
         System.out.println("vẽ theo hình ");
     }
     public void erase(){
        System.out.println("vẽ theo hình ");
     }
    }
