
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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create kitchener as a city
        City kitchener = new City();
        
        //create robot karel
        Robot karel = new Robot(kitchener,1,2,Direction.SOUTH);
        
        //build wall
        new Wall (kitchener,1,1, Direction.NORTH);
        new Wall (kitchener,1,2,Direction.NORTH);
        new Wall (kitchener,1,1,Direction.WEST);
        new Wall (kitchener,2,1,Direction.WEST);
        new Wall (kitchener,2,1,Direction.SOUTH);
        new Wall (kitchener,1,2,Direction.EAST);
        new Wall (kitchener,1,2,Direction.SOUTH);
        
        //make newspaper
        new Thing(kitchener,2,2);
        
        //move robot
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        
        //pick up newspaper
        karel.pickThing();
        
        //move back to original spot
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
        //drop newspaper
        karel.putThing();
        
       
        
        
      
        
      
        
                
     
    }
}
