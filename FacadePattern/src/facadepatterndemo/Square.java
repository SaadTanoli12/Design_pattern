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
public class Square implements Shape {
   @Override
   public void draw(String... args) {
      StringBuilder sb = new StringBuilder("Square::draw() with args: ");
      for (String arg : args) {
          sb.append(arg).append(", ");
      }
      System.out.println(sb.toString());
   }
}