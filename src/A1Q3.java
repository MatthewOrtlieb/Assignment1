
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ortlm8239
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
               // a new city called 
        City kitchener = new City();
        
        //creating a robot
        Robot karel = new Robot(kitchener,3,0,Direction.EAST);
        new Thing (kitchener,3,1);
        
        //create walls in kitchener
        new Wall(kitchener,3,2,Direction.WEST);
        new Wall(kitchener,3,2,Direction.NORTH);
        new Wall(kitchener,2,3,Direction.WEST);
        new Wall(kitchener,1,3,Direction.WEST);
        new Wall(kitchener,3,2,Direction.NORTH);
        new Wall(kitchener,1,3,Direction.NORTH);
        new Wall(kitchener,1,3,Direction.EAST);
        new Wall(kitchener,2,4,Direction.NORTH);
        new Wall(kitchener,2,4,Direction.EAST);
        new Wall(kitchener,3,4,Direction.EAST);
        
        //move karel and place thing acccordingly
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.putThing();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        
         
        
         
          
        
       
        
        
      
        
        
        
        
    }
}
