/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

public class Character {
    static Dice dice = new Dice();
    
    String name;
    int strength;
    int dexterity;
    int intelligence;
    int maxLife;
    int currentLife;
    
    public Character(String n, int s, int d, int i, int maxLife){
        this.name = n;
        this.strength = s;
        this.dexterity = d;
        this.intelligence = i;
        this.maxLife = maxLife;
        this.currentLife = maxLife;
    }
    
    public int attack(){
        return dice.roll() * strength;
    }
    
    public void wound(int damage){
        currentLife-=damage;
    }
    
    public void heal(int heal){
        currentLife+=heal;
        if (currentLife > maxLife) {
            currentLife = maxLife;
        }
    }
    
    public String getName(){
        return name;
    }
    
    public int getStrength(){
        return strength;
    }
    
    public int getDexterity(){
        return dexterity;
    }
    
    public int getIntelligence(){
        return intelligence;
    }
    
    public int getCurrentLife(){
        return currentLife;
    }
    
    public int getMaxLife(){
        return maxLife;
    }
    public void status(int status){
        currentLife-=status;
    }
}