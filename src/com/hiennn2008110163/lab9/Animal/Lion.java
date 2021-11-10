package com.hiennn2008110163.lab9.Animal;

public class Lion extends animail{
    public Lion(){
    System.out.println("Making a Lionr");
}
public Lion(String n){
    super(n);
}
@Override
public void makeNoise() {
    if(hunger == 1){
        System.out.println("Kêu tiếng Lion !!");
    }else if(hunger == 3){
        System.out.println(" Lion Kêu quạo !!");
    }else{
        System.out.println("Kêu tiếng Lion !!");
    }
}
@Override
protected void eat() {
    System.out.println("Ăn kiểu sư tử");
}
}