package HomeWork.lesson5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        firstMethod();
        twoMethod();
    }

    private static void twoMethod() {
        int size = 10_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();

        float[] leftHalf = new float[size / 2];
        float[] rightHalf = new float[size / 2];

        System.arraycopy(arr, 0, leftHalf, 0, size/2);
        System.arraycopy(arr, size/2, rightHalf, 0, size/2);

        Thread left = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < leftHalf.length; i++) {
                    leftHalf[i] = (float) (leftHalf[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        Thread right = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < rightHalf.length; i++) {
                    rightHalf[i] = (float) (rightHalf[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        left.run();
        right.run();

        float[] mergedArray = new float[size];
        System.arraycopy(leftHalf, 0, mergedArray, 0, size/2);
        System.arraycopy(rightHalf, 0, mergedArray, size/2, size/2);

        System.out.println("Two thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
    }

    public static void firstMethod() {
        int size = 10_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }


        System.out.println("One thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
    }

}
