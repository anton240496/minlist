package com.company;
class Main{
    public static void main(String args[]){
        Printer print = new Printer();
        Integer []array = {10, 11, 88, 2, 12, 120};
        // Вызов метода getMin () для получения минимального значения
        print.<Integer>print(array);
       // Integer min = getMin(array);
        Printer1<Integer> min = new Printer1<Integer>(getMin(array));
        Integer min1 = min.min1();


        System.out.println("\nMinimum Value is: "+min1);
    }
        // здесь находим минимум
    public static int getMin(Integer[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}






