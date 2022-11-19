
import java.util.LinkedList;

public class InterlockingImpl implements Interlocking {

    LinkedList<Train> trains = new LinkedList<Train>();

    @Override
    public void addTrain(String trainName, int entryTrackSection, int destinationTrackSection) throws IllegalArgumentException, IllegalStateException {
        try {

            System.out.println("Train is being added to entry section at :" + entryTrackSection);
            Train train = new Train(trainName, entryTrackSection, destinationTrackSection, entryTrackSection);

            System.out.println("No. of trains in the track :" + trains.size());

            if (trains.size() == 0) {
                trains.add(train);
                System.out.println("Train is successfully being added at section at :" + entryTrackSection);
                System.out.println("Validating tracks..");
            }

            for (int i = 0; i < trains.size(); i++) {
                if (trains.get(i).getCurrent() == train.getCurrent()) {
                    System.out.println(" the entry track is occupied and train successfully placed");
                    System.out.println("Train name : " + trains.get(i).getName());
                } else if (trains.get(i).getName() == train.getName()) {
                    System.out.println(" the train name is already in use, or there is no valid path from the entry to the destination");
                    throw new IllegalArgumentException();
                } else if (train.getName() == "freight" && trains.get(i).getName() != train.getName()) {
                    if (train.getEntryTrackSection() == 8 || train.getEntryTrackSection() == 9 || train.getEntryTrackSection() == 10) {
                        System.out.println(" the train name is already in use, or there is no valid path from the entry to the destination");
                        throw new IllegalArgumentException();
                    } else {
                        trains.add(train);
                    }
                } else if (train.getName() == "passenger" && trains.get(i).getName() != train.getName()) {

                    if (train.getEntryTrackSection() == 8 || train.getEntryTrackSection() == 11 || train.getEntryTrackSection() == 4) {
                        System.out.println(" the train name is already in use, or there is no valid path from the entry to the destination");
                        throw new IllegalArgumentException();
                    } else {
                        trains.add(train);
                    }
                } else {
                    trains.add(train);
                }
            }

        } catch (IllegalArgumentException e) {

            System.out.println(" the train name is already in use, or there is no valid path from the entry to the destination");

        } catch (IllegalStateException e) {
            System.out.println(" the entry track is already occupied");
        }
    }

    @Override
    public int moveTrains(String[] trainNames) throws IllegalArgumentException {
        
        
        for (int i = 0; i < trainNames.length; i++) {

            for (int x = 0; x < trains.size(); x++) {
                
                if (trains.get(x).getName() == trainNames[i]) {
                    int current = trains.get(x).getCurrent();
                    int start = trains.get(x).getEntryTrackSection();
                    int destination = trains.get(x).getDestinationTrackSection();
                    System.out.println("Train name " + trainNames[i]);
                    System.out.println("Train moved from " + current );
                    if (current == start) {
                        if (current == 1 && destination == 8) {
                            trains.get(x).setCurrent(5);
                            System.out.println("Train moved to " + destination + " from " + current);
                        }
                        if (current == 3 && destination == 8) {
                            trains.get(x).setCurrent(6);
                            System.out.println("Train moved to " + destination + " from " + current);
                        }
                        if (current == 1 && destination == 9) {
                            trains.get(x).setCurrent(5);
                            System.out.println("Trsin moved to " + destination + " from " + current);
                        }
                        if (current == 3 && destination == 9) {
                            trains.get(x).setCurrent(6);
                            System.out.println("Trsin moved to " + destination + " from " + current);

                        }
                        if (current == 1 && destination == 11) {
                            trains.get(x).setCurrent(7);
                            System.out.println("Trsin moved to " + destination + " from " + current);

                        }
                        if (current == 3 && destination == 11) {
                            trains.get(x).setCurrent(7);
                            System.out.println("Trsin moved to " + destination + " from " + current);

                        }
                        if (current == 1 && destination == 4) {
                            trains.get(x).setCurrent(4);
                            System.out.println("Trsin moved to " + destination + " from " + current);

                        }
                        if (current == 3 && destination == 4) {
                            trains.get(x).setCurrent(4);
                            System.out.println("Trsin moved to " + destination + " from " + current);

                        }
                        if (current == 9 && destination == 2) {
                            trains.get(x).setCurrent(6);
                            System.out.println("Trsin moved to " + destination + " from " + current);

                        }
                        if (current == 9 && destination == 3) {
                            trains.get(x).setCurrent(5);
                            System.out.println("Trsin moved to " + destination + " from " + current);

                        }
                        if (current == 10 && destination == 2) {
                            trains.get(x).setCurrent(5);
                            System.out.println("Trsin moved to " + destination + " from " + current);

                        }
                        if (current == 10 && destination == 3) {
                            trains.get(x).setCurrent(6);
                            System.out.println("Trsin moved to " + destination + " from " + current);

                        }
                        if (current == 11 && destination == 2) {
                            trains.get(x).setCurrent(7);
                            System.out.println("Trsin moved to " + destination + " from " + current);

                        }
                        if (current == 11 && destination == 3) {
                            trains.get(x).setCurrent(7);
                            System.out.println("Trsin moved to " + destination + " from " + current);

                        }
                    }
                    if (current == 5) {
                        if (start == 1 && destination == 8) {
                            trains.get(x).setCurrent(8);
                            System.out.println("Trsin moved to " + destination + " from " + current);

                        }
                        if (start == 1 && destination == 9) {
                            trains.get(x).setCurrent(9);
                            System.out.println("Trsin moved to " + destination + " from " + current);

                        }
                        if (start == 9 && destination == 2) {
                            trains.get(x).setCurrent(2);
                            System.out.println("Trsin moved to " + destination + " from " + current);

                        }
                        if (start == 9 && destination == 3) {
                            trains.get(x).setCurrent(3);
                            System.out.println("Trsin moved to " + destination + " from " + current);

                        }
                    }
                    if (current == 6) {
                        if (start == 1 && destination == 8) {
                            trains.get(x).setCurrent(8);
                            System.out.println("Trsin moved to " + destination + " from " + current);

                        }
                        if (start == 1 && destination == 9) {
                            trains.get(x).setCurrent(9);
                            System.out.println("Trsin moved to " + destination + " from " + current);

                        }
                    }
                    if (current == 5) {
                        if (start == 3 && destination == 8) {
                            trains.get(x).setCurrent(8);
                            System.out.println("Trsin moved to " + destination + " from " + current);

                        }
                        if (start == 3 && destination == 9) {
                            trains.get(x).setCurrent(9);
                            System.out.println("Trsin moved to " + destination + " from " + current);

                        }
                    }
                    if (current == 6) {
                        if (start == 3 && destination == 8) {
                            trains.get(x).setCurrent(8);
                            System.out.println("Trsin moved to " + destination + " from " + current);

                        }
                        if (start == 3 && destination == 9) {
                            trains.get(x).setCurrent(9);
                            System.out.println("Trsin moved to " + destination + " from " + current);

                        }
                    }
                    if (current == 7) {
                        if (start == 3 && destination == 11) {
                            trains.get(x).setCurrent(11);
                            System.out.println("Trsin moved to " + destination + " from " + current);

                        }

                    }

                }
            }

        }

        return 0;
    }

    @Override
    public String getSection(int trackSection) throws IllegalArgumentException {
        boolean cc = true;
        try {
            for (int i = 0; i < trains.size(); i++) {

                if (trains.get(i).getCurrent() == trackSection) {
                    cc = false;
                    return trains.get(i).getName();
                } else {
                    cc = true;
                }
            }
            if (cc) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Train doesn't exist");
        }
        return null;

    }

    @Override
    public int getTrain(String trainName) throws IllegalArgumentException {
        boolean cc = true;
        try {
            for (int i = 0; i < trains.size(); i++) {

                if (trains.get(i).getName() == trainName) {
                    cc = false;
                    System.out.println("------------------------------------");
                    System.out.println("Train name : "+ trains.get(i).getName());
                    System.out.println("Current track : "+trains.get(i).getCurrent());
                    System.out.println("Entry track : "+trains.get(i).getEntryTrackSection());
                    System.out.println("Destination track : "+trains.get(i).getDestinationTrackSection());
                    return trains.get(i).getCurrent();
                    
                } else {
                    cc = true;
                }
            }

            if (cc) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Train doesn't exist");
        }
        return -1;
    }

}
