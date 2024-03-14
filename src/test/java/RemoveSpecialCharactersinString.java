import java.util.Arrays;

public class RemoveSpecialCharactersinString {
    public static void main(String[] args) {
        String input = "sdf32432#@$#@$dcscEWR";
        //input = input.toLowerCase();

        //String s2 = Arrays.toString(input.split(" "));

        char[] arr = input.toCharArray();

        for(int i= 0; i< arr.length; i++){
            if(arr[i] =='#' ||arr[i] == '@' ||arr[i] =='$'){
                continue;
               // System.out.println();

            }
            System.out.print(arr[i]);

            }
        }
    }


