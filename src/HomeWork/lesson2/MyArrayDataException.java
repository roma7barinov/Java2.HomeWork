package HomeWork.lesson2;

public class MyArrayDataException extends RuntimeException{

    public int i;
    public int j;


    public MyArrayDataException(int i ,int j) {
        super("Ошибка в ячейке : " + i + j );
        this.i = i;
        this.j = i;
    }
}
