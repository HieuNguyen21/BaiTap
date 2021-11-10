package com.hiennn2008110163.lab9.Animal;
import java.util.ArrayList;
public class quanLyAnimal {
    ArrayList<animail> list = new ArrayList<animail>();
    public void add(animail animail){
        list.add(animail);
    }
    public void introduce(){
        for (animail animal : list)
          animal.introduce();
    }
public void choab(){
    for (animail animal : list)
          animal.eat();
}
public void makeVoid(){
    for (animail animal : list)
        animal.makeNoise();
    }
    public  void sleep() {
    for (animail animal : list) 
         animal.sleep();
    }
public animail spName(String name) {
    Wolf w = null;

    for (animail animal : list) {
        if(animal instanceof Wolf){
            Wolf wolf = (Wolf)animal;
            if(wolf.getName().equalsIgnoreCase(name))
                wolf = wolf;
        }			
    }
    return w;
}
}


