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
public class Wizard extends Character {
    int maxMagic, currentMagic;
    

    public Wizard (String n, int s, int d, int i, int maxLife, int maxMagic) {
        
        super(n, s, d, i, maxLife);
        this.maxMagic = maxMagic;
        this.currentMagic = maxMagic;
    }
    
    public int castLightningBolt(){
        
        if (currentMagic >= 5) {
            currentMagic-=5;
            return dice.roll() * intelligence;
                  
     } else
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

