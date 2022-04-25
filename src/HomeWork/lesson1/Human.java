package HomeWork.lesson1;

public class Human implements Players {

    private int canRun;
    private int canJump;
    private String name;


    public Human(int canJump,int canRun,String name){
        this.name = name;
        this.canJump = canJump;
        this.canRun = canRun;
    }

    @Override
    public void run(Track track) {
        if (canRun < track.getLength()){
            System.out.println("Человек " + name + " не смог пробежать");
        } else {
            System.out.println("Человек " + name + " пробежал");
        }


    }

    @Override
    public void jump(Wall wall) {
        if (canJump < wall.getHeight()){
            System.out.println("Человек " + name + " не может перепрыгнуть");
        } else {
            System.out.println("Человек " + name + " перепрыгнул");
        }
    }



}
