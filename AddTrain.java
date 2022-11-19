/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import org.junit.Test;
/**
 *
 * @author hirus
 */
public class AddTrain {
   @Test
   public void test(){
   InterlockingImpl ii = new InterlockingImpl();
        ii.addTrain("frieght", 1, 8);
        ii.addTrain("passenger", 3, 9);
        ii.addTrain("express", 2, 11);
   }
}
