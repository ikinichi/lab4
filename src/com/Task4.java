package com;

import java.util.*;

import static com.SafeScanner.nextInt;

public class Task4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задания (от 1 до 4) для выполнения");
        int task = nextInt(in);
        while (task!=0){
            switch (task){
                case 1:
                    first();
                    break;
                case 2:
                    second();
                    break;
                case 3:
                    System.out.println("ТЗ не предусматривает выполнение метода для сортировки");
                    break;
                case 4:
                    fourth();
            }
            System.out.println("Выберите другую задачу, либо введите \'0\' для выхода");
            task = nextInt(in);
        }
    }
    //генерация случайного числа в заданном промежутке
    private static int getRandomNumber (int a,int b){
        Random random = new Random();
        return random.nextInt(b+1-a)+a;
    }
    //заполнение массива (для упрощения выполнения)
    private static int[] fillArray(int[] array,int a, int b){
        for(int i=0;i<array.length;i++){
            array[i] = getRandomNumber(a,b);
        }
        return array;
    }

    private static void first(){
        int[] array = new int[20];
        for (int j = 0; j < 20; j++) {
            array[j] = getRandomNumber(4, 20);
            System.out.print(String.valueOf(array[j]) + ' ');
        }
        System.out.println();


    }
    //вывод массива в консоль
    private static void showArray (int[] array){
        for (int i=0;i<array.length;i++)
            System.out.print(Integer.toString(array[i])+' ');
        System.out.println();
    }

    //создание коллекции массивов (для удобства в обращении)
    private static Collection createCollection(int[] a1,int[] a2,int[] a3,int[] a4,int[] a5){
        Collection<int[]> col = new ArrayList();
        col.add(a1);
        col.add(a2);
        col.add(a3);
        col.add(a4);
        col.add(a5);

        return col;
    }

    private static void second(){
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] array3 = new int[10];
        int[] array4 = new int[10];
        int[] array5 = new int[10];
        Collection<int[]> arrays = createCollection(array1,array2,array3,array4,array5);

        for(int[] array: arrays){
            Random random = new Random();
            fillArray(array,random.nextInt(30)+10,random.nextInt(30)+40);
            showArray(array);
        }

    }

    private static int[] arraySort(int[] array){
        for (int i=0;i<array.length;i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < min){
                    min = array[j];
                    min_i = j;
                }
            if(i!=min_i){
                int temp = array[i];
                array[i] = array[min_i];
                array[min_i] = temp;
            }
        }
        return array;
    }

    private static void fourth() {
        long dateUntill;
        long dateAfter;
        long index = 0;
        long number;
        while (true){
            dateUntill = System.currentTimeMillis();
            number =  fibonachi(index);
            dateAfter = System.currentTimeMillis();
            System.out.println(number);
            if(dateAfter-dateUntill>=1000){
                System.out.println("Находить число фибоначи рекурсией  на этом компьютере не рационально после "+index+" числа");
                break;
            }
            index++;
        }
    }

    private static long fibonachi(long index){
        if(index==0)
            return 0;
        if(index==1)
            return 1;
        return fibonachi(index-1)+fibonachi(index-2);
    }
}
