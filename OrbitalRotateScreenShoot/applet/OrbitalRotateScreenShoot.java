import processing.core.*; 

import java.applet.*; 
import java.awt.Dimension; 
import java.awt.Frame; 
import java.awt.event.MouseEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.FocusEvent; 
import java.awt.Image; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class OrbitalRotateScreenShoot extends PApplet {

public void setup(){
size(500, 600);
bg = color(255);
  
  
}

int bg;
boolean trails=false;

 public void draw(){
   
  if(!trails){
     background(bg);
  } 
 
  
  
  translate(width/2, height/2);
  float a = atan2(sin(frameCount / 40.0f), cos(frameCount / 50.0f));
  rotate(a);
  float shapeSize = sin(frameCount / 50.0f) * 100;
  float px = sin(frameCount / 50.0f) * 200;
  float py = cos(frameCount / 20.0f) * 200;
  ellipse(px, py, shapeSize, shapeSize);
  
  
  
  
   translate (width/10, height/10 );
  float b = atan2(sin(frameCount / 40.0f), cos(frameCount / 40.0f));
  rotate(b);
  float shapeSize2 = sin(frameCount / 50.0f) * 100;
  float qx = sin(frameCount / 40.0f) * 200;
  float qy = cos(frameCount / 20.0f) * 200;
  ellipse(qx, qy, shapeSize2, shapeSize2);
  
  
  
   translate (width/4, height/4);
  float c = atan2(sin(frameCount / 40.0f), cos(frameCount / 40.0f));
  rotate(c);
  float shapeSize3 = sin(frameCount / 50.0f) * 100;
  float bx = sin(frameCount / 30.0f) * 200;
  float by = cos(frameCount / 20.0f) * 200;
  ellipse(bx, by, shapeSize3, shapeSize3);
  
  
   //translate (width/20, height/20);
  //float b = atan2(sin(frameCount / 50.0), cos(frameCount / 40.0));
 //rotate(b);
  //float shapeSize2 = sin(frameCount / 50.0) * 100;
 // float qx = sin(frameCount / 80.0) * 200;
 // float qy = cos(frameCount / 10.0) * 200;
 // ellipse(qx, qy, shapeSize2, shapeSize2);
  
  
}
   
public void keyPressed(){

  // space changes bg
  if (key == ' '){
     bg = color(random(255), random(255), random(255));
   }
   
   // s key saves frame
   if (key == 's'){
     saveFrame("coolframe-####.png");
   }
   
   // t key toggles trails
   if(key == 't'){
     trails=!trails;
     
   }
   
}
  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#FFFFFF", "OrbitalRotateScreenShoot" });
  }
}
