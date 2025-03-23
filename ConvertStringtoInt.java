import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ConvertStringtoInt {
    // March 23,2025
    // write code that turns written number (String) into an int.
    // ex: "three hundred million" ---> 300,000,000
    public static void main(String[] args){
        System.out.println(stringToNumber("three hundred million"));
    }
    public static int stringToNumber(String n){
        int answer=0;
        int tempAnswer=1;
        ArrayList<String> nums = new ArrayList<>(Arrays.asList(n.split(" ")));
        HashMap<String,Integer> numbers = new HashMap<>();
        numbers.put("hundred",100);
        numbers.put("thousand",1000);
        numbers.put("million",1000000);
        numbers.put("billion",1000000000);
        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("three",3);
        numbers.put("four",4);
        numbers.put("five",5);
        numbers.put("six",6);
        numbers.put("seven",7);
        numbers.put("eight",8);
        numbers.put("nine",9);
        numbers.put("ten",10);
        numbers.put("eleven",11);
        numbers.put("twelve",12);
        numbers.put("thirteen",13);
        numbers.put("fourteen",14);
        numbers.put("fifteen",15);
        numbers.put("sixteen",16);
        numbers.put("seventeen",17);
        numbers.put("eighteen",18);
        numbers.put("twenty",20);
        numbers.put("thirty",30);
        numbers.put("forty",40);
        numbers.put("fifty",50);
        numbers.put("sixty",60);
        numbers.put("seventy",70);
        numbers.put("eighty",80);
        numbers.put("ninety",90);



        for(String num:nums){
            if(numbers.containsKey(num)){
                int numValue = numbers.get(num);
                if(numValue == 1000 ||numValue == 1000000||numValue == 1000000000){
                    answer+= tempAnswer * numValue;
                    tempAnswer = 0;
                }else if(numValue == 100){
                    tempAnswer *= numValue;
                }else{
                    tempAnswer *= numValue;
                }
            }
        }
        answer += tempAnswer;
        return answer;
    }
}
