public class dog {
    String breed;
    String color;
    int age;
    int size;
    String name;
    dog(String b,String c,int a,String n,int s){
        breed =b;
        color =c;
        age =a;
        size=s;
        name=n;
    }
    void bark(int nunmberBark){
        while (nunmberBark > 0){
            System.out.println("ruff");
            nunmberBark--;
        }
    }
    public int getSize(){
        return size;
    }
}
