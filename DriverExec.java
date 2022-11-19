import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author This PC
 */
public class DriverExec {
    public static void main(String[] args) throws IOException {
        String trainName = "";
        int entryTrackSection = 0;
        int destinationTrackSection = 0;
        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
       
        InterlockingImpl ii = new InterlockingImpl();
        ii.addTrain("frieght", 1, 8);
        ii.addTrain("passenger", 3, 9);
        ii.addTrain("express", 3, 11);
                
        System.out.println(ii.getTrain("frieght"));
        
        String[] trains = {"frieght", "passenger"};
        
        System.out.println(ii.moveTrains(trains));
        
    }
}
