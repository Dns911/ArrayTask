package main;

import entity.ArrayConsole;
import service.ArrayService;

import java.util.Arrays;

public class mainProject {
    public static void main (String[] args){
        ArrayConsole a = new ArrayConsole();
        System.out.println(a);
        ArrayService arrayService = new ArrayService();
        int min = arrayService.minValue(a);
        int max = arrayService.maxValue(a);
        System.out.println(min);
        System.out.println(max);
        int[] result = arrayService.changeIf(a, 3, 6);
        System.out.println(Arrays.toString(result));
        System.out.println(arrayService.average(a));
        System.out.println(arrayService.countPositive(a));
        System.out.println(arrayService.countNegative(a));
        int[] resultSort = arrayService.recursiveQuickSort(a);
        System.out.println(Arrays.toString(resultSort));
    }
}
