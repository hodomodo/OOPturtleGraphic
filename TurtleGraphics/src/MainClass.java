import java.awt.Color;

import java.awt.FlowLayout;

import javax.swing.JFrame;

import uk.ac.leedsbeckett.oop.LBUGraphics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass extends LBUGraphics
{
        public static void main(String[] args)
        {
                new MainClass(); //create instance of class that extends LBUGraphics (could be separate class without main), gets out of static context
        }

        public MainClass()
        {
                JFrame MainFrame = new JFrame();                //create a frame to display the turtle panel on
                MainFrame.setLayout(new FlowLayout());  //not strictly necessary
                MainFrame.add(this);                                    //"this" is this object that extends turtle graphics so we are adding a turtle graphics panel to the frame
                MainFrame.pack();                                               //set the frame to a size we can see
                MainFrame.setVisible(true);                             //now display it
                about();                                                                //call the LBUGraphics about method to display version information.
                try {
                	  Thread.sleep(3000);
                	} catch (InterruptedException e) {
                	  Thread.currentThread().interrupt();
                	}
                clear();
                reset();
                turnLeft();
                penDown();
        }
       

        
        public void processCommand(String command)      //this method must be provided because LBUGraphics will call it when it's JTextField is used
        {
        	
        	switch(command) {
        		case "forward":
        			forward(100);
        			break;
        		//case "forward";
        			//forward();
        			//break;
        		case "right":
        			turnRight();
        			break;
        		case "left":
        			turnLeft();
        			break;
        		case "pen up":
        			penUp();
        			break;
        		case "pen down":
        			penDown();
        			break;
        		case "clear":
        			clear();
        			break;
        		case "reset":
        			reset();
        			break;
        		case "black":
        			setPenColour(Color.BLACK);
        			break;
        		case "green":
        			setPenColour(Color.GREEN);
        			break;
        		case "red":
        			setPenColour(Color.RED);
        			break;
        		case "white":
        			setPenColour(Color.WHITE);
        			break;

        		
        			
        	}
              
        		
        			
        	
        	
        		//String parameter is the text typed into the LBUGraphics JTextfield
                //lands here if return was pressed or "ok" JButton clicked
                //TO DO 
        }
}
