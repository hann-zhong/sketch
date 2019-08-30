//Sketchpad.java      Author: Hannah Zhong
//Driver class of SketchpadPanel.java
 
import javax.swing.*;
 
public class Sketchpad{
  public static void main(String [] args){
 //---------------------------------------------------------------------------------------------------
try {
UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
} catch (Exception e) {
e.printStackTrace();
}
//----------------------------------------------------------------------------------------------------
JFrame frame = new JFrame("Sketchpad");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
frame.getContentPane().add(new SketchpadPanel());
 
//Makes it so the user can't change the size of the frame by dragging the corners
frame.setResizable(false);
 
frame.pack();
frame.setVisible(true);
  }
}