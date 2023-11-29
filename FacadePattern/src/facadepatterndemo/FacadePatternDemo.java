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
public class FacadePatternDemo {
   public static void main(String[] args) {
      ShapeMaker shapeMaker = new ShapeMaker();

      shapeMaker.drawCircle("arg1", "arg2");
      shapeMaker.drawRectangle("color: red");
      shapeMaker.drawSquare("size: large");
      shapeMaker.drawTriangle("base: 5", "height: 10");
      shapeMaker.drawEllipse("radius1: 3", "radius2: 7");
   }
}