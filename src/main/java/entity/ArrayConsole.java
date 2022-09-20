package entity;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConsole {
private final int[] arr;
public ArrayConsole(){
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    String[] numbers = str.split("\\s+");
    int countItem = 0;
    for (String ii: numbers){
        countItem++;
        try{
            Integer.parseInt(ii);
        }
        catch (NumberFormatException e){
            countItem--;
        }
    }
    arr = new int[countItem];
    countItem = 0;
    for (String jj : numbers){
        try{
            arr[countItem] = Integer.parseInt(jj);
            countItem++;
        }
        catch (NumberFormatException ignored){
        }
    }
}

    public int[] getArr() {
        return arr;
    }
@Override
public String toString() {
    return "ArrayConsole{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
