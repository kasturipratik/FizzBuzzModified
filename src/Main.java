import java.util.Random;
public class Main {

/*   random number generated and assigned to a variable for
     start and end. available to public use for all methods */
    public static int start = randomNum();
    public static int end = randomNum();

    //main method to run the programs
    public static void main(String[] args) {

       /*  programModify method called
         and assigned to a variable*/
        String message = programModify();

        /*rockPaper method called and assigned to an array*/
        String [] fizzBuzz =harryPotter();

        /*printing the message */
        System.out.println("::::::::::::::::::::::::::::::::::::::::\n"+message +
                "\n::::::::::::::::::::::::::::::::::::::::::::::::::::");

        /*printing the final values of the rockPaper method */
        for(int i=0;i < fizzBuzz.length;i++){

            System.out.println(fizzBuzz[i]);
        }
    }

/*  Method that returns the message
    as per the random number generated*/
    public static String programModify(){
        String message = "";
        if(start == end){
            message ="Shazam";
        }
        else if(start < end ){
            if(end - start < 10){
                message ="This won't take long";
            }
            else{
                message ="This is taking longer than expected";
            }
        }
        else if (start > end){
            message ="Opps!!!!";
        }
    return message;
    }
// Method that returns the array of the numbers with different
// fizz buzz text if the start number is less than end number
    public static String[] fizzBuzz(){
        int count =1;
        int a =0;
        String [] values = new String[count];
        if(start < end){
            count = end - start;
            values  = new String[count+1];
            for(int i = start; i <= end;i++){
                if(i %3 ==0){
                    if(i%5 ==0){
                        values[a] ="Fizz Buzz";
                    }
                    else{
                        values[a] = "Fizz";
                    }
                }
                else if(i % 5 ==0){
                    if(i % 3 == 0)
                    {
                        values[a] = "Fizz Buzz";
                    }else{
                        values[a] ="Buzz";
                    }

                }
                else if(i % 7 == 0){
                    values[a]= i + " - multiple of seven";
                }
                else{
                    values[a] = String.valueOf(i);
                }
                a++;
            }

        }
        else{
            values[0] ="The start number is greater than end number.\nProgram Ended";
        }

    return values;
    }

// method to generate generate rock, paper, scissors , lizard , spock
// for the even numbers greater than or eqal to 10
 public static String[] rockPaper(){
        String values[] = fizzBuzz();
        String finalValues[] = new String[values.length];
        int count=0;
        int a =0;
        int starting = start;
        String message[] = {" Rock", " Paper", " Scissors"," Lizard"," Spock"};
        if(start < end){
            for(int i=start;i<=end;i++){
                if(i%2 ==0 && starting >=10){
                    finalValues[count] = values[count] + " - " +message[a];
                    a++;
                    if(a >4){
                        a =0;
                    }
                }
                else{
                    finalValues[count] = values[count];
                }
                count++;
                starting++;
            }
        }
        else{
            finalValues[0]= values[0];
        }
        return finalValues;
 }
 /*Double bonus method to print Harry for the number grater than
 20 if the last digit has odd number and print potter for even number*/
 public static String[] harryPotter(){
     String values[] = rockPaper();
     String finalValues[] = new String[values.length];
     int higher = start;
     int a=0;
     if(start < end){
         for(int i = start ; i <= end ;i++){
             if(higher >20){
                 // getting the last digit of the integer
                 int last = i %10;
                 if(last %2 == 0){
                     finalValues[a] = values[a]+ " -- Potter";
                 }
                 else{
                     finalValues[a] = values[a] + " -- Harry";
                 }
             }
             else{
                 finalValues[a]= values[a];
             }

             a++;
             higher++;
         }
     }
     else
     {
         finalValues[0] = values[0];
     }

     return finalValues;
 }

// method to generate random number
// for start and end number
    public static int randomNum(){
        Random ran = new Random();
        int random  = 1+ ran.nextInt(100);
        return random;
    }
}
