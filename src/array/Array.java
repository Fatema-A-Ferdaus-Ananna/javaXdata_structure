package array;

import java.util.Scanner;


public class Array {

    //public int[] int_array1 = {1,2,3,4,5,6}; //Declarartion by value & size
    public String strings_array1[] = new String[5]; //Declarartion by specifying the size

    public void show_array_value(int[] int_array1){
        System.out.print("Array :  ");
        for(int index=0; index < int_array1.length; index++){
            System.out.print(int_array1[index] + " \t");
        }
        System.out.println("Array Size: " + int_array1.length);
    }

    public void take_array_value(){

        for(int index=0; index <strings_array1.length; index++){

            System.out.print("Enter a String :  ");
            Scanner instance_scanner_input = new Scanner(System.in);
            strings_array1[index] = instance_scanner_input.nextLine();
        }

        for(int index=0; index <strings_array1.length; index++){

            System.out.println(index + " Index's String is :  " + strings_array1[index]);
        }
    }


    public static void main(String[] args) {
        Array instance_array1 = new Array();

        int[] int_array1 = {1,2,3,4,5,6}; //Declarartion by value & size
        instance_array1.show_array_value(int_array1);
        instance_array1.take_array_value();
    }

}
