package HomeWork.lesson1;

public class Cat implements Players {

    private int canRun;
    private int canJump;
    private String name;


    public Cat(int canJump, int canRun, String name){
        this.name = name;
        this.canJump = canJump;
        this.canRun = canRun;
    }

    @Override
    public void run(Track track) {
        if (canRun < track.getLength()){
            System.out.println("Кот " + name + " не смог пробежать");
        } else {
            System.out.println("Кот " + name + " пробежал");
        }


    }

    @Override
    public void jump(Wall wall) {
        if (canJump < wall.getHeight()){
            System.out.println("Кот " + name + " не может перепрыгнуть");
        } else {
            System.out.println("Кот " + name + " перепрыгнул");
        }
    }



}
