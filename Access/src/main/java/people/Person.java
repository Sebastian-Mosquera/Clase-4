
package people;

public class Person {
    private String name;
    private String lastname;
    private String fullName;
    private int age;
    private String pass;
    
    public Person(String name,int age){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        createFullName(name, lastname);
    }
    
    private void createFullName(String name, String lastname){
       this.fullName = name + " " + lastname;
    }
    
    public String getFullName(){
        return this.fullName;
    }
    public int getAge() {
        return age;
    }
    
    
}

