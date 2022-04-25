package HomeWork.lesson2;

public class Wall implements Obstacle{

    private int height;

    public Wall(int height){
        this.height = height;
    }

    int getHeight(){
        return height;
    }


    @Override
    public void doIt(Players players) {
        players.jump(new Wall(height));
    }


}
