/**
 * @author Rebecca Goldberg
 *         CSC 220-02
 *         Start of Project 3 
 *         
 *  This program creates a Rectangle Object. It includes get 
 *  and set methods for the instance variables. The program can
 *  identify a valid rectangle, it will automatically check that 
 *  the values in the Rectangle are [0,1]. When using a set method
 *  the method will check that the entire rectangle is still valid
 *  before setting the new value. The program also implements
 *  its own toString method that prints out the value of each 
 *  instance variable of the Rectangle object.
 */
public class Rectangle {
  private double x;
  private double y;
  private double width;
  private double height;
  private String color;

  public Rectangle(){
    x = 0;
    y = 0;
    width = 1;
    height = 1;
    color = "red";
  }
  public Rectangle(double x, double y, double height, double width, String color){
    if(isValid(x, y, height, width) && (color.equals("black") || color.equals("red") 
      || color.equals("green") || color.equals("blue"))) {
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
      this.setColor(color);
      }
    else {
      this.x = 0;
      this.y = 0;
      this.width = 1;
      this.height = 1;
      this.color = "red";
      StdDraw.setPenColor(StdDraw.RED);
      }
    }
    /**
     * Getter method for the x value of the lower left coordinate
     * @return x value
     */
    public double getX(){
      return this.x;
    }
    /**
     * Getter method for the y value of the lower left coordinate
     * @return y value
     */
    public double getY(){
      return this.y;
    }
    /**
     * Getter method for the width of the rectangle objecy
     * @return width value
     */
    public double getWidth(){
      return this.width;
    }
    /**
     * Getter method for the height of the rectangle object
     * @return height value
     */
    public double getHeight(){
      return this.height;
    }
    /**
     * Getter method for the color of the rectangle object
     * @return color
     */
    public String getColor(){
      return this.color;
    }
    /**
     * Sets the x value for the rectangle object
     * @param x
     */
    public void setX(double x){
      if(isValid(x, this.y, this.height, this.width))
        this.x = x;
    }
    /**
     * Sets the y value for the rectangle object
     * @param y
     */
    public void setY(double y){
      if(isValid(this.x, y, this.height, this.width))
        this.y = y;
    }
    /**
     * Sets the width for the rectangle object
     * @param w
     */
    public void setWidth(double w){
      if(isValid(this.x, this.y, this.height, w))
        this.width = w;
    }
    /**
     * Sets the height value for the rectangle object
     * @param h
     */
    public void setHeight(double h){
      if(isValid(this.x, this.y, h, this.width))
        this.height = h;
    }
    /**
     * Sets the color value for the rectangle object
     * @param color
     */
    public void setColor(String c){
      if(c.equals("black")) {
        this.color = c;
        StdDraw.setPenColor(StdDraw.BLACK);
        }
      if(c.equals("red")) {
        this.color = c;
        StdDraw.setPenColor(StdDraw.RED);
        }
      if(c.equals("green")) {
        this.color = c;
        StdDraw.setPenColor(StdDraw.GREEN);
        }
      if(c.equals("blue")) {
        this.color = c;
        StdDraw.setPenColor(StdDraw.BLUE);
        }
        
    }
    /**
     * Static method. Returns true if the rectangle with
     * lower left vertex at (x,y), width w and height h is valid, and false otherwise.
     * @param x
     * @param y
     * @param h
     * @param w
     * @return true or false
     */
    public static boolean isValid(double x, double y, double h, double w){
      if((x+w)>0 && (x+w)<=1 
          && (y+h)>0 && (y+h)<=1
            && x>=0 && x<=1 && y>=0 && y<=1)
        return true;
      else
        return false;
        
    }
    /**
     * This method returns the string format of the parameters of the rectangle
     * @return String representation of the rectangle 
     */
    public String toString() {
      String returnString = "x value: " + this.x + "\ny value: " 
        + this.y + "\nheight: " + this.height + "\nwidth: " 
        + this.width + "\ncolor: " + this.color;
      return returnString;
    }

    /**
     * This method compares two rectangle objects
     * @return boolean
     */
    public boolean equals(Rectangle rect) {
      if(this.getX() == rect.getX() && this.getY() == rect.getY() 
        && this.getHeight() == rect.getHeight() 
        && this.getWidth() == rect.getWidth() 
        && this.getColor().equals(rect.getColor()))
          return true;
      else
          return false;
    }
    /**
     * Computes the perimeter of the rectangle
     * @return perimeter
    */
    public double computePerimeter() {
        double perimeter = (2*this.getWidth() + (2*this.getHeight()));
        return perimeter;
    }
    /**
     * Computes the area of the rectangle (width * height)
     * @return area
    */
    public double computeArea() {
        double area = (this.getWidth()*this.getHeight());
        return area;
    }
    /**
     * This method displays the rectangle using the StdDraw class
     */
    public void show() {
      StdDraw.line(this.getX(), this.getY(),this.getX(),this.getY()+this.getHeight());
      StdDraw.line(this.getX(), this.getY(),this.getX()+this.getWidth(),this.getY());
      StdDraw.line(this.getX(), this.getY()+this.getHeight(), this.getX()+this.getWidth(),this.getY()+this.getHeight());
      StdDraw.line(this.getX()+ this.getWidth(), this.getY(), this.getX()+this.getWidth(),this.getY()+this.getHeight());
    }
    /**
     * This method returns true if the rectangle contains the (x,y) 
     * passed as the method parameters
     * @param x
     * @param y
     * @return boolean
     */
    public boolean containsPoint(double x, double y) {
      if((x>=this.getX() && x<=this.getX()+this.getWidth())
          && (y>=this.getY() && y<=this.getY()+this.getHeight()))
        return true;
      else
        return false;

    }
    /**
     * This method returns true if the rectangle object completely 
     * contains the rectangle object parameter
     * @param rect
     * @return boolean
     */
    public boolean containsRectangle(Rectangle rect) {
      if(this.containsPoint(rect.getX(),rect.getY()) 
        && this.containsPoint(rect.getX()+rect.getWidth(),rect.getY())
        && this.containsPoint(rect.getX(),rect.getY()+rect.getHeight())
        && this.containsPoint(rect.getX()+rect.getWidth(),rect.getY()+rect.getHeight()))
          return true;
      else
        return false;
    }
    /**
     * This method returns true if the rectangle object passed
     * as a parameter intersects with the other rectangle object
     * @param rect
     * @return boolean
     */
    public boolean intersects(Rectangle rect) {
      if(!this.containsRectangle(rect) && (this.containsPoint(rect.getX(),rect.getY()) 
        || this.containsPoint(rect.getX()+rect.getWidth(),rect.getY())
        || this.containsPoint(rect.getX(),rect.getY()+rect.getHeight())
        || this.containsPoint(rect.getX()+rect.getWidth(),rect.getY()+rect.getHeight())))
          return true;
      else
        return false;
    }

}
