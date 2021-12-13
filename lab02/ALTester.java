import java.util.*;

public class ALTester {

public static boolean check(ArrayList<Integer> a) {
	for (int i = 0; i < a.size() - 1; i++) {
			if (a.get(i) > a.get(i + 1))
				return false;
		}
		return true;
	}


	public static ArrayList _data = new ArrayList();

	public static void main(String[] args) {
		for (int i = 0; i < 23; i++)
			
		OrderedArrayList.add(_data, 23 - i);		
		printArrayList(_data);
		System.out.println(isSorted(_data));
		_data.add(50);
	}

}
