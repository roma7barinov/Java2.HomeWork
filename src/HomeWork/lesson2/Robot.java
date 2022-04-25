package HomeWork.lesson2;

public class Robot implements Players {

    private int canRun;
    private int canJump;
    private String name;


    public Robot(int canJump, int canRun, String name){
        this.name = name;
        this.canJump = canJump;
        this.canRun = canRun;
    }

    @Override
    public void run(Track track) {
        if (canRun < track.getLength()){
            System.out.println("Робот " + name + " не смог пробежать");
        } else {
            System.out.println("Робот " + name + " пробежал");
        }


    }

    @Override
    public void jump(Wall wall) {
        if (canJump < wall.getHeight()){
            System.out.println("Робот " + name + " не может перепрыгнуть");
        } else {
            System.out.println("Робот " + name + " перепрыгнул");
        }
    }



}
