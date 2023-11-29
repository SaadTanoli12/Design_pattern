/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadepatterndemo;

/**
 *
 * @author fa20-bse-127
 */
public class ShapeMaker {
   private Shape circle;
   private Shape rectangle;
   private Shape square;
   private Shape triangle;
   private Shape ellipse;

   public ShapeMaker() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
      triangle = new Triangle();
      ellipse = new Ellipse();
   }

   public void drawCircle(String... args){
      circle.draw(args);
   }
   public void drawRectangle(String... args){
      rectangle.draw(args);
   }
   public void drawSquare(String... args){
      square.draw(args);
   }
   public void drawTriangle(String... args){
      triangle.draw(args);
   }
   public void drawEllipse(String... args){
      ellipse.draw(args);
   }
}