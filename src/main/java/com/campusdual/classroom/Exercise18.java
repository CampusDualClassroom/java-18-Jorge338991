package com.campusdual.classroom;

public class Exercise18 {
    public static int[] createAndInitializeArray(int tamano) {
        //if(tamano <= 0) { tamano = 1; }
        int[] array = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static void showInlineArray(int[] array) {
        int index = (array.length - 1);
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {

        createAndInitializeArray(5);
        showInlineArray(createAndInitializeArray(5));
    }
}
