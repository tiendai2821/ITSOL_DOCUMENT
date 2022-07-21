package Generic2;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
//		Printer<Integer> printer = new Printer<>(2);
//		printer.print();
//		
//		Printer<Double> doublePrinter = new Printer<>(33.3);
//		doublePrinter.print();
		// generic don't work with primitive type
		
		List<Integer> intList = new ArrayList<>();
		intList.add(3);
		//printList(intList);
		
		List<Cat> catList = new ArrayList<>();
		catList.add(new Cat());
		printList(catList);
		List<Octopus> octopi = new ArrayList<>();
		//octopi.add(new Octopus());
		printList2(octopi);
	}
//	private static <T, V> T shout(T thingToShout, V otherThingToShout) {
//		System.out.println(thingToShout + " ???EQ");
//		return thingToShout;
//	}
	
	private static void printList(List<? extends Animal> myList) {
		System.out.println("Cat eat and run");
	}
	private static void printList2(List<? extends Animal> myList) {
		System.out.println("Other animal");
	}

}
