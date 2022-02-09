package JavaCourseTasks;

import java.util.Arrays;

public class Task2UniqueValue {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4, 5};

        int[] arrUnique = returnUnique1(arr);
        System.out.println(Arrays.toString(arrUnique));

        arrUnique = returnUnique2(arr);
        System.out.println(Arrays.toString(arrUnique));

        arrUnique = returnUnique3(arr);
        System.out.println(Arrays.toString(arrUnique));
    }

    public static int[] returnUnique1(int[] arr) {
        int tempArrIndex = 0; //var of unique values quantity
        int[] tempArr = new int[arr.length];

        for (int j : arr) {
            boolean gotMatch = false;
            for (int i : tempArr) {
                if (j == i) {
                    gotMatch = true;
                    break;
                }
            }
            if (!gotMatch) {//matching was not found
                tempArr[tempArrIndex] = j; //so add unique value to the temporary array
                tempArrIndex++; //counter of unique values
            }
        }
        int[] arrOnlyUniqueValues = new int[tempArrIndex];
        System.arraycopy(tempArr, 0, arrOnlyUniqueValues, 0, tempArrIndex);
        return arrOnlyUniqueValues;
    }

    public static int[] returnUnique2(int[] arr) {
        Arrays.sort(arr);
        int[] uniqueArr = new int[arr.length];
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            while (i < arr.length - 1 && arr[i] == arr[i + 1])
                i++;
            uniqueArr[x] = arr[i];
            x++;
        }
        int[] arrOnlyUniqueValues = new int[x];
        System.arraycopy(uniqueArr, 0, arrOnlyUniqueValues, 0, x);
        return arrOnlyUniqueValues;
    }

    public static int[] returnUnique3(int[] arr) {
        int[] temp = new int[arr.length];
        boolean check;
        int ind = 0;
        for (int k : arr) {
            check = true;
            for (int i : temp) {
                if (k == i) {
                    check = false;
                    break;
                }
            }
            if (check) {
                temp[ind++] = k;
            }
        }
        int[] arrOnlyUniqueValues = new int[ind];
        System.arraycopy(temp, 0, arrOnlyUniqueValues, 0, arrOnlyUniqueValues.length);
        return arrOnlyUniqueValues;
    }
}