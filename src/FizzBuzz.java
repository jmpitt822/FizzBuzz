/**
 * Created by jeremypitt on 12/19/16.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        int counter = 1;

        while(counter <= 100){
            if(counter % 3 == 0 && counter % 5 == 0){
                System.out.println("Fizzbuzz");
            }
            else if(counter % 3 == 0){
                System.out.println("Fizz");
            }
            else if (counter % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(counter);
            }
            counter++;
        }
    }
}
