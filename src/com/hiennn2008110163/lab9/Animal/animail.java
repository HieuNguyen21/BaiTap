package com.hiennn2008110163.lab9.Animal;

public class animail {
    protected String sound;
    private String name;
    protected String picture;
    protected int hunger;
    protected String food;
    public animail(){
        //super();
        System.out.println("making a Animal ...");
    }
    public animail(String name) {
		this.name = name;
    }
    public void makeNoise(){
        System.out.println("Hmm...");
    }

    protected void eat(){
        System.out.println("Ăn ...");
    }


    protected void sleep(){
        System.out.println("Ngủ ...");
    }

    protected void roam(){
        System.out.println("Đi lang thang...");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void introduce(){
        this.makeNoise();
        System.out.println("  " + this.name);
    }
    
}
