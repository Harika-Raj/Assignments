package FizzBuzz;

public class FizzBuzz {

    public String print(int number) {
        if(number % 3 ==0){
            return "FIZZ";
        }
        return "" + number;
    }
}