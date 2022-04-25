package HomeWork.lesson1;

public class Track implements Obstacle{

    private int length;

    public Track(int length){
        this.length = length;
    }

    int getLength(){
        return length;
    }



    @Override
    public void doIt(Players players) {
        players.run(new Track(length));
    }
}
