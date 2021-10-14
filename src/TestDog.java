public class TestDog {
    public static void main(String[] args){
    dog cho = new dog("corgi","vang",2);
    System.out.println("tuoi:"+ cho.age);
    System.out.println("giong:"+ cho.breed);
    System.out.println("mau sac:"+ cho.color);
    cho.age =1;
    cho.breed ="china";
    cho.color="den";
    cho.bark(3);
}
}