package ForEachIterator;

import java.util.ArrayList;

public class ForEachIterator {

	public static void main(String[] args) {


		ArrayList<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(56);
		list.add(2);
		list.add(0);
		list.add(-9);
		list.stream().forEach(System.out::println);
		

	}

}
