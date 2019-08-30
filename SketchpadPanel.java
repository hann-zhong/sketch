
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
 
public class SketchpadPanel extends JPanel{
  private JButton red, blue, green, black, pink, orange, cyan, clear;
  private Point pressPoint;    
  private Graphics sketch = getGraphics();
  private JLabel label;
   
//-----------------------------------------------------------------------------------------------------------------
  public SketchpadPanel(){
	 
     
//Creates the buttons that will change the color of the lines and sets the colors of their backgrounds
    red = new JButton("");
    red.addActionListener(new RedListener());
    red.setPreferredSize(new Dimension(50,50));
    red.setBackground(Color.red);
     
    blue = new JButton("");
    blue.addActionListener(new BlueListener());
    blue.setPreferredSize(new Dimension(50,50));
    blue.setBackground(Color.blue);
    blue.setForeground(Color.white);
     
    green = new JButton("");
    green.addActionListener(new GreenListener());
    green.setPreferredSize(new Dimension(50,50));
    green.setBackground(Color.green);
     
    black = new JButton("");
    black.addActionListener(new BlackListener());
    black.setPreferredSize(new Dimension(50,50));
    black.setBackground(Color.black);
    black.setForeground(Color.white);
     
    pink = new JButton("");
    pink.addActionListener(new PinkListener());
    pink.setPreferredSize(new Dimension(50,50));
    pink.setBackground(Color.pink);
     
    orange = new JButton("");
    orange.addActionListener(new OrangeListener());
    orange.setPreferredSize(new Dimension(50,50));
    orange.setBackground(Color.orange);
     
    cyan = new JButton("");
    cyan.addActionListener(new CyanListener());
    cyan.setPreferredSize(new Dimension(50,50));
    cyan.setBackground(Color.cyan);
     
    clear = new JButton("CLEAR");
    clear.addActionListener(new ClearListener());
    clear.setPreferredSize(new Dimension(80,50));
    clear.setBackground(Color.white);
    clear.setForeground(Color.red);
//------------------------------------------------------------------------------------------------------------------
    //Sets the label to say "click on a color to being drawing!! and centers it
    label = new JLabel("Click on a color to begin drawing!", SwingConstants.CENTER);
    
//Adds the buttons and label to the panel
    add(red);
    add(blue);
    add(green);
    add(black);
    add(pink);
    add(orange);
    add(cyan);
    add(clear);
    add(label);
      
    //Sets the size and color of the panel
    setPreferredSize(new Dimension(600,600));
    setBackground(Color.white);
//------------------------------------------------------------------------------------------------------------------ 
    //When the mouse is pressed, the coordinates of the point are recorded
     addMouseListener(new MouseAdapter(){
      public void mousePressed(MouseEvent m){
        pressPoint = new Point(m.getX(), m.getY());
      }
    });
     
     // When the mouse is dragged to a new location, a line is drawn from the coordinates from where the point was 
     //pressed to the new coordinates (where the mouse was dragged to).
    addMouseMotionListener(new MouseMotionAdapter(){
      public void mouseDragged(MouseEvent m){ 
        sketch.drawLine(pressPoint.x, pressPoint.y, m.getX(), m.getY());
        pressPoint = new Point(m.getX(), m.getY());
      }
    });
  }
 
private void setPenRadius(double d) {
	// TODO Auto-generated method stub
	
}

//------------------------------------------------------------------------------------------------------------------  
//Button listeners that change the color of the line that's being drawn when the button of the color is pressed
  private class RedListener implements ActionListener{
    public void actionPerformed (ActionEvent red){
       
      sketch = getGraphics();
      sketch.setColor(Color.red);
    }
  }
   
  private class BlueListener implements ActionListener{
    public void actionPerformed (ActionEvent blue){
       
       sketch = getGraphics();
       sketch.setColor(Color.blue);
    }
  }
   
  private class GreenListener implements ActionListener{
    public void actionPerformed (ActionEvent green){
       
      sketch = getGraphics();
      sketch.setColor(Color.green);
    }
  }
   
  private class BlackListener implements ActionListener{
    public void actionPerformed (ActionEvent black){
       
      sketch = getGraphics();
      sketch.setColor(Color.black);
    }
  }
   
  private class PinkListener implements ActionListener{
    public void actionPerformed (ActionEvent pink){
       
      sketch = getGraphics();
      sketch.setColor(Color.pink);
    }
  }
 
  private class OrangeListener implements ActionListener{
    public void actionPerformed (ActionEvent orange){
       
      sketch = getGraphics();
      sketch.setColor(Color.orange);
    }
  }
  private class CyanListener implements ActionListener{
    public void actionPerformed (ActionEvent cyan){
       
      sketch = getGraphics();
      sketch.setColor(Color.cyan);
    }
  }
   
  //When the "CLEAR" button is pressed, the entire sketchpad will be cleared of the lines that were already drawn
  private class ClearListener implements ActionListener{
    public void actionPerformed (ActionEvent clear){    
      repaint();
    }
  }
}
 