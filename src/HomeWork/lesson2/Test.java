package HomeWork.lesson2;

public class Test {
    public static void main(String[] args) {


        Players[] players = {
                new Human(2,100,"Рома"),
                new Cat(4,200,"Барсик"),
                new Robot(100,300,"R2D2")

        };

        Obstacle[] obstacles = {
                new Wall(3),
                new Track(100)
        };

        for (Players p : players){
            for (Obstacle o : obstacles){
                o.doIt(p);
            }
            System.out.println("________________--");
        }

    }
}
