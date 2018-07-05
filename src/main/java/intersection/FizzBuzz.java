package intersection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args){

        List<Integer> ints = new ArrayList();
        for(int i=1; i <=20; i++) {
            ints.add(i);
        }

        System.out.println(processInts(ints));
    }

    public static String processInts(List<Integer> ints){
        StringBuilder result = new StringBuilder();
        for(int i=0; i< ints.size(); i++){
            int currInt = ints.get(i);
            if(currInt % 15 == 0){
                result.append("fizzbuzz");
            }
            else if(currInt % 3 == 0){
                result.append("fizz");
            }
            else if(currInt % 5 == 0){
                result.append("buzz");
            }
            else {
                result.append(currInt);
            }
            if(i < ints.size() - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
