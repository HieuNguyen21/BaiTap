package com.hiennn2008110163.lab9.Animal;

public class Wolf extends animail{
    public Wolf(){
        
        System.out.println("Making a Wolf");
    }
    public Wolf(String n){
        super(n);
    }
    @Override
    public void makeNoise() {

        if(hunger == 1){
            System.out.println("Kêu tiếng Wolf !!");
        }else if(hunger == 2){
            System.out.println(" Wolf Kêu quạo !!");
        }else{
            System.out.println("Kêu tiếng Wolf ...");
        }
    }
    @Override
    protected void eat() {
        System.out.println("Ăn kiểu sói");
    }
}
    
