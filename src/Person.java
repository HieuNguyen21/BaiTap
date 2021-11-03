public class Person {
    private String name;
    private String birthday;

    protected String getName(){
            return name;
        }
    protected String setName(String name){
        this.name = name;
    }
    
    protected String getBirthday(){
        return birthday;
    }
    protected void setBirthday(String birthday){
        this.birthday = birthday;
     }
}
