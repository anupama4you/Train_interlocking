public class Train {
    private String name;
    private int entryTrackSection;
    private int destinationTrackSection;
    private int current;

    public Train(String name, int entryTrackSection, int destinationTrackSection, int current) {
        this.name = name;
        this.entryTrackSection = entryTrackSection;
        this.destinationTrackSection = destinationTrackSection;
        this.current = current;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEntryTrackSection() {
        return entryTrackSection;
    }

    public void setEntryTrackSection(int entryTrackSection) {
        this.entryTrackSection = entryTrackSection;
    }

    public int getDestinationTrackSection() {
        return destinationTrackSection;
    }

    public void setDestinationTrackSection(int destinationTrackSection) {
        this.destinationTrackSection = destinationTrackSection;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }
    
    


}
