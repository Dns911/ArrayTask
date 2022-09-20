package service;

import entity.ArrayConsole;

public class ArrayService {
    public int minValue (ArrayConsole arr){
        int[] a = arr.getArr();
        int min = a[0];
        for (int i = 1; i < a.length; i++){
            if (min > a[i]){
                min = a[i];
            }
        }
        return min;
    }
    public int maxValue (ArrayConsole arr){
        int[] a = arr.getArr();
        int max = a[0];
        for (int i = 1; i < a.length; i++){
            if (max < a[i]){
                max = a[i];
            }
        }
        return max;
    }
    public int[] changeIf (ArrayConsole arr, int findValue, int changeValue){
        int[] a = arr.getArr();
        for (int i = 1; i < a.length; i++){
            if (a[i] == findValue){
                a[i] = changeValue;
            }
        }
        return a;
    }
    public double average (ArrayConsole arr){
        int[] a = arr.getArr();
        int sum = 0;
        for (int i = 1; i < a.length; i++){
            sum += a[i];
        }
        return (double) sum / a.length;
    }
    public int sumArray (ArrayConsole arr){
        int[] a = arr.getArr();
        int sum = 0;
        for (int i = 1; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }
    public int countPositive (ArrayConsole arr){
        int[] a = arr.getArr();
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] > 0){
                count++;
            }
        }
        return count;
    }
    public int countNegative (ArrayConsole arr){
        int[] a = arr.getArr();
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] < 0){
                count++;
            }
        }
        return count;
    }
}
