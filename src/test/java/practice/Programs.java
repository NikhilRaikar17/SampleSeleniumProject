package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Programs {
	
//  	public static void main(String[] args) {
        // Create a list of numbers
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        // Use a lambda expression to filter out even numbers
//        List<Object> oddNumbers = numbers.stream()
//            .filter(n -> n % 2 != 0)
//            .collect(Collectors.toList());
//
//        // Print the filtered list
//        System.out.println("Odd numbers: " + oddNumbers);
		
//  		TestFunctionalInterface greeting = () -> System.out.println("Hello, World!");
//  		greeting.sayHello();
//     }
	
	static {
        // This block is executed once when the class is loaded
        System.out.println("Static block executed.");
    }

    public static void main(String[] args) {
    	Programs example = new Programs();
    	System.out.println("test");
    }

}
