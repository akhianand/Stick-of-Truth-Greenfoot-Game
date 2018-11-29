import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HighElf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TheGrandWizard extends Hero
{
    ActingStrategy currentStrategy;
    
    public TheGrandWizard(){
        currentStrategy= new LevelZeroActingStrategy();

    }
    public void act() 
    {
        super.act();  
       
         
        if(getWorld().getClass().getName().equals("MainMenu")){
        currentStrategy= new LevelZeroActingStrategy();
        currentStrategy.setWorld(getWorld());
        currentStrategy.setHero(this);
        currentStrategy.doAction();
        }else if(getWorld().getClass().getName().equals("ForestWorld")){
        currentStrategy= new LevelOneActingStrategy();
        currentStrategy.setWorld(getWorld());
        currentStrategy.setHero(this);
        currentStrategy.doAction();
        }else if(getWorld().getClass().getName().equals("BossBattleWorld")){
        currentStrategy= new LevelTwoActingStrategy();
        currentStrategy.setWorld(getWorld());
        currentStrategy.setHero(this);
        currentStrategy.doAction();
        }
         
    } 
   
 
    
    public void setStance(String stance){
     switch(stance){
        case "Attack": setImage(new GreenfootImage("cartman_stance.png"));
                        break;
        case "Stand": setImage(new GreenfootImage("grand-wizard.png"));
                        break;                
        }
    }
}
