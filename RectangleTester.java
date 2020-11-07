/**
 * @author Rebecca Goldberg
 *         CSC 220-02
 *         Project 3 
 *         
 *  This is the driver class for the Rectangle class.
 *  This tester prints out a thorough run down of the various
 *  tests that are performed with the Rectangle object.
 */
public class RectangleTester {
  
  public static void menuWait(int x) {
    try {
      Thread.sleep(x * 1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  public static void main(String args[]) {
    Rectangle draw = new Rectangle(.1,.3,.5,.5,"red");
    System.out.println(draw.computePerimeter());
    System.out.println(draw.computeArea());
    Rectangle two = new Rectangle(.2,.2,.6,.7,"black");
    System.out.println(two.containsRectangle(draw));
    System.out.println(two.intersects(draw));
    System.out.println(draw.containsRectangle(two));
    System.out.println(draw.intersects(two));
    two.show();
    draw.show();
    
  
    /**  *************************TESTBENCH*****************************
    System.out.println("Testing...");
    menuWait(1);
    double userX = 0.3;
    double userY = 0.2;
    double userH = 0.6;
    double userW = 0.7;
    String userC = "blue";
    System.out.println("Creating a new Rectangle object.");
    Rectangle user = new Rectangle(userX,userY,userH,userW,userC);
    System.out.println(user.toString());
    menuWait(2);
    //System.out.println("x-value entered: " + userX + "\n.get method returns: " + user.getX());
    if(userX == user.getX()) 
      System.out.println(".getX() test successful");
    else 
      System.out.println("Error : .getX() test not successful");
    
    if(userY == user.getY()) 
      System.out.println(".getY() test successful");
    else 
      System.out.println("Error : .getY() test not successful");
    
    if(userH == user.getHeight()) 
      System.out.println(".getHeight() test successful");
    else 
      System.out.println("Error : .getHeight() test not successful");
    
    if(userW == user.getWidth()) 
      System.out.println(".getWidth() test successful");
    else 
      System.out.println("Error : .getWidth() test not successful");
    
    if(userC.equals(user.getColor())) 
      System.out.println(".getColor() test successful");
    else 
      System.out.println("Error : .getColor() test not successful");
    
    menuWait(2);
    System.out.println("Now trying to create an invalid rectangle object");
    System.out.println("Running the .isValid() method. Output is: " + Rectangle.isValid(2.0,2.0,2.0,2.0));
    if(!Rectangle.isValid(2.0,2.0,2.0,2.0))
      System.out.println("Successfully identified an invalid rectangle!");
    else
      System.out.println("Error with .isValid() method");
    
    menuWait(3);
    System.out.println("Creating a rectangle with invalid parameteres to test the default rectangle");
    Rectangle newRect = new Rectangle(2.0,2.0,2.0,2.0, "red");
    System.out.println("Default rectangle should be x:0, y:0, w:1, h:1, and c:red");
    
    menuWait(3);
    System.out.println(newRect.toString());
    if(newRect.getX() == 0 && newRect.getY() == 0 && newRect.getHeight() == 1 && newRect.getWidth() == 1 && newRect.getColor().equals("red"))
      System.out.println("Success");
    else
      System.out.println("Error");
    
    menuWait(4);
    System.out.println("Now checking the .isValid() method with these parameters");
    if(Rectangle.isValid(0,0,1,1))
      System.out.println("Successfully identified a valid rectangle!");
    else
      System.out.println("Error with .isValid() method");
    
    menuWait(3);

    System.out.println("Now setting each numerical value to 0.5");
    newRect.setHeight(0.5);
    newRect.setWidth(0.5);
    newRect.setX(0.5);
    newRect.setY(0.5);
    
    menuWait(3);
    
    System.out.println("Now testing the .toString() method again");
    System.out.println(newRect.toString());
    System.out.println("Success!");
    
    if(newRect.getX() == 0.5 && newRect.getY() == 0.5 
        && newRect.getHeight() == 0.5 && newRect.getWidth() == 0.5)
    System.out.println("All values have been set to 0.5 successfully");
    else
      System.out.println("Error with the .set methods");
    
    menuWait(3);
    System.out.println("Now setting the color to black");
    newRect.setColor("black");
    System.out.println("Color should be: black. Color is set as " + newRect.getColor());
    if(newRect.getColor().equals("black"))
      System.out.println("Success!");
    else
      System.out.println("Error");
  */
    }
}
