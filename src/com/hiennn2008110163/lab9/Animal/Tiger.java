package com.hiennn2008110163.lab9.Animal;

public class Tiger extends animail {
    public Tiger(){
        
        System.out.println("Making a Tiger");
    }

    public Tiger(String n){
        super(n);
    }
    @Override
    public void makeNoise() {
        if(hunger == 1){
            System.out.println("Kêu tiếng Tiger ...");
        }else if(hunger == 3){
            System.out.println(" Tiger Kêu quạo ....");
        }else{
            System.out.println("Kêu tiếng Tiger ...");
        }
    }
    @Override
    protected void eat() {
        System.out.println("Ăn kiểu hổ");
    }
}
    
