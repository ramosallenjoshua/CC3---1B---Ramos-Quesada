/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;
import java.util.Scanner;
public class CharacterDuel {
    Wizard p1 = new Wizard("Wizard",10,10,30,500,125);
    Hero p2 = new Hero("Hero",30,20,18,500,75,30);
        Dice dice = new Dice();
        
        int round = 1;
        int choice;
        int move;
        int timer;
    public void battle(){
        System.out.println("Battle Start!");
        System.out.println();
        System.out.println(p1.name+"'s Health: "+p1.maxLife);
        System.out.println(p1.name+"'s MP: "+p1.maxMagic);
        System.out.println(p2.name+"'s SP: 0");
        System.out.println();
        System.out.println(p2.name+"'s Health:"+p2.maxLife);
        System.out.println(p2.name+"'s MP: "+p2.maxMagic);
        System.out.println(p2.name+"'s SP: "+p2.maxSkill);
        System.out.println();
        
        if (p1.dexterity > p2.dexterity) {
            System.out.println(p1.name+" first move");
            System.out.println();
        do {
            System.out.println("---------------------------");
            System.out.println("Round "+round);
            System.out.println("---------------------------");
            p1move();
            System.out.println("---------------------------");
            if (p2.currentLife > 0) {
                p2move();
                System.out.println("---------------------------");
            }
            round++;
        } while (p1.currentLife > 0 && p2.currentLife > 0);
    }else if(p1.dexterity < p2.dexterity){
            System.out.println(p2.name+" first move");
            System.out.println();
            do {
                System.out.println("---------------------------");
            System.out.println("Round "+round);
                System.out.println("---------------------------");
            p2move();
            System.out.println("---------------------------");
                if (p1.currentLife > 0) {
                    p1move();
                    System.out.println("---------------------------");
                }
            round++;
        } while (p1.currentLife > 0 && p2.currentLife >0);
    }
        if (p1.currentLife <= 0) {
            System.out.println(p1.name+" died");
            System.out.println(p2.name+" wins!");
        }else if(p2.currentLife <= 0){
            System.out.println(p2.name+" died");
            System.out.println(p1.name+" wins!");
        }
}
    
    public void p1move(){
        System.out.println(p1.name+"'s Move");
        System.out.println();
         if (timer > 0) {
            move = p2.inflictPoison();
            p1.status(move);
            System.out.println(p2.name+" inflicted poison on "+p1.name);
            System.out.println("Poison damage on "+p1.name+": "+move);
            System.out.println(p1.name+"'s health is now "+p1.currentLife+" hp");
            System.out.println();
            timer--;
        }
        do{
            System.out.println("[1] Attack | [2] Skill");
            choice();
        if (choice == 1) {
            move = p1.attack();
            p2.wound(move);
            System.out.println(p1.name+" attacked "+p2.name+" for "+move+" damage");
            System.out.println(p2.name+"'s health is "+p2.currentLife+" hp");
        }else if (choice == 2) {
            do{
                System.out.println("[1] Cast Lightning Bolt | [2] Heal");
                choice();
            if (choice == 1) {
                move = p1.castLightningBolt();
                p2.wound(move);
                System.out.println(p1.name+" casted Lightning Bolt for "+move+" damage");
                System.out.println(p2.name+"'s health is now "+p2.currentLife+" hp");
                System.out.println(p1.name+"'s MP is now "+p1.currentMagic);
            }else if(choice == 2){
                move = p1.castHeal();
                p1.heal(move);
                System.out.println(p1.name+" casted Heal for "+move+" hp");
                System.out.println(p1.name+"'s health is now "+p1.currentLife+" hp");
                System.out.println(p1.name+"'s MP is now "+p1.currentMagic);
        }else System.out.println("This is Beyond my Power!");
            }while(choice != 1 && choice != 2);
    }else System.out.println("This is Beyond my Power!");
        }while(choice != 1 && choice != 2);
        }
    
    public void p2move(){
        System.out.println(p2.name+"'s Move");
        do{
            System.out.println("[1] Attack | [2] Skill");
            choice();
        if (choice == 1) {
            move = p2.attack();
            p1.wound(move);
            System.out.println(p2.name+" attacked "+p1.name+" for "+move+" damage");
            System.out.println(p1.name+"'s health is "+p1.currentLife+" hp");
        }else if (choice == 2) {
            do{
                System.out.println("[1] Inflict Poison | [2] Heal");
                choice();
            if (choice == 1) {
                timer = 3;
                move = p2.inflictPoison();
                p1.wound(move);
                System.out.println(p2.name+" inflicted poison on "+p1.name);
                System.out.println("Poison damage on "+p1.name+": "+move);
                System.out.println(p1.name+"'s health is now "+p1.currentLife+" hp");
                System.out.println(p2.name+"'s SP is now "+p2.currentSkill);
            }else if(choice == 2){
                move = p2.castHeal();
                p2.heal(move);
                System.out.println(p2.name+" casted Heal for "+move+" hp");
                System.out.println(p2.name+"'s health is now "+p2.currentLife+" hp");
                System.out.println(p2.name+"'s MP is now "+p2.currentMagic);
        }else System.out.println("This is Beyond my Power!");
            }while(choice != 1 && choice != 2);
    }else System.out.println("This is Beyond my Power!");
        }while(choice != 1 && choice != 2);
        }
    public void choice(){
        Scanner in = new Scanner(System.in);
        choice = in.nextInt();
    }
}
