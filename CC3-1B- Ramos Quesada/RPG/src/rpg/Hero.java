/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

/**
 *
 * @author m304user
 */
public class Hero extends Character {
    int maxMagic, currentMagic, maxSkill, currentSkill;
    

    public Hero (String n, int s, int d, int i, int maxLife, int maxMagic, int maxSkill) {
        
        super (n, s, d, i, maxLife);
        this.maxMagic = maxMagic;
        this.currentMagic = maxMagic;
        this.maxSkill = maxSkill;
        this.currentSkill = maxSkill;
    }
    @Override
    public int attack(){
        return dice.roll() * strength;
    }
     public int inflictPoison(){
         if (currentSkill >= 5) {
             currentSkill-=5;
             return dice.roll() + 10;
         }
         return 0;
     }
    public int castHeal(){
        
        if (currentMagic >= 8) {
            currentMagic-=8;
           return dice.roll() * intelligence;
        }else
       
        return 0;
    }
    public int getMaxMagic(){
        return maxMagic;
    }
    
    public int getCurrentMagic(){
        return currentMagic;
    }
    
    }



