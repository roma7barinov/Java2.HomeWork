package HomeWork.lesson2;

public class Main {
    public static void main(String[] args) {


        String[][] arrays = new String[][]{{"00","01","02","03"},//6
                                           {"10","11","12","13"},//46
                                           {"20","21","22","23"},//86
                                           {"30","31","32","33"}};//126



        try {
            try {
                int result = arrayMetod(arrays);
                System.out.println("Сумма всех элементов ровна "+ result );
            }catch (MyArraySizeException e) {
                System.out.println("Размер массива не верен");
            }
        } catch (MyArrayDataException e){
            e.printStackTrace();
        }





    }

    public static int arrayMetod (String[][] arr) throws MyArraySizeException,MyArrayDataException {

        int count = 0;

        if (arr.length != 4){
            throw  new MyArraySizeException();
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length != 4){
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i,j);
                }

            }

        }
        return count;
    }


}
