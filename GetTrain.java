
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hirus
 */
public class GetTrain {

    @Test
    public void test2() {
        InterlockingImpl ii = new InterlockingImpl();
        ii.addTrain("frieght", 1, 8);
        ii.addTrain("passenger", 3, 9);
        ii.addTrain("express", 2, 11);

        String[] trains = {"frieght", "passenger"};
        System.out.println(ii.moveTrains(trains));
        
        ii.getTrain("frieght");
        ii.getTrain("passenger");

    }
}
