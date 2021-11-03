public class Employee extends Person {
    protected int Salary;
    public String toString(){
        String s;
        s = getName() + "," + getBirthday();
        s+="," +Salary;
    return s;
    }
}
