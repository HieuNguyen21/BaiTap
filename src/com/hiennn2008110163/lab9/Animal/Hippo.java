package com.hiennn2008110163.lab9.Animal;

public class Hippo extends animail{
    public Hippo(){
        System.out.println("Making a Hippo");
    }

    public Hippo(String n){
        super(n);
    }
    @Override
    public void makeNoise() {
        if(hunger == 1){
            System.out.println("Kêu tiếng Hippo ...");
        }else if(hunger == 2){
            System.out.println(" Hippo Kêu quạo ....");
        }else{
            System.out.println("Kêu tiếng Hippo ...");
        }
    }

    @Override
    protected void eat() {
        System.out.println("Ăn kiểu hà mã");
    }
}

    