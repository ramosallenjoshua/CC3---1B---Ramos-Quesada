package classesandobjects;

import java.util.Scanner;

public class ClassesAndObjects {

    public static void main(String[] args) {
        Dog woof = new Dog();
        String yesno;
        
        do{
        System.out.println("Enter Dog Name: ");
        woof.SetName(Sinput());
        String dogname = woof.getName();
        
        System.out.println("Enter Dog Age: ");
        woof.SetAge(Ninput());
        int dogage = woof.getAge();
        
        System.out.println("Enter Dog Breed: ");
        woof.SetBreed(Sinput());
        String dogbreed = woof.getBreed();
        
        System.out.println("Enter Dog Gender: ");
        woof.SetGender(Cinput());
        char doggender = woof.getGender();
        
        System.out.println();
        System.out.println("Dog: " + dogname);
        System.out.println("Age: " + dogage);
        System.out.println("Breed: " + dogbreed);
        System.out.println("Gender: " + doggender);
        System.out.println();
        
        System.out.println("Do you want to Enter another Dog?: [Yes/No]");
        yesno = Sinput();
        }while(yesno.equalsIgnoreCase("yes"));
        
        System.out.println();
        System.out.println("End");
    }
    public static String Sinput(){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        return s;
    }
    public static int Ninput(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        return n;
    }
    public static char Cinput(){
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
        if (c == 'M' || c == 'm') {
            return 'M';
        }
        return 'F';
    }
}

