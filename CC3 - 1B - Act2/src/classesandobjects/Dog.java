package classesandobjects;

public class Dog {
    String name;
    int age;
    String breed;
    char gender;
    public void SetName(String dogName){
        name = dogName;
    }public String getName(){
        return name;
    }
    
    public void SetAge(int dogAge){
        age = dogAge;
    }public int getAge(){
        return age;
    }
    
    public void SetBreed(String dogBreed){
        breed = dogBreed;
    }public String getBreed(){
        return breed;
    }
    
    public void SetGender(char dogGender){
        gender = dogGender;
    }public char getGender(){
        return gender;
    }
}