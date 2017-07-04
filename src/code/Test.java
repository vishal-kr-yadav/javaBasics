package code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Sum{
int[] twoSum(int[] numbers, int target) {
    int result[] = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < numbers.length; i++) {
        if (map.containsKey(target - numbers[i])) {
            result[1] = i + 1;
            System.out.println(result[1]);
            result[0] = map.get(target - numbers[i]);
            System.out.println(result[0]);
            return result;
           
        }
        System.out.println("i==========="+i);
        map.put(numbers[i], i + 1);
    }
    
    return result;
}
}

public class Test {

	public static void main(String[] args) {
		
	 Sum s=new Sum();
	 int a[]={2, 7, 11, 15};
	
	int b[]=s.twoSum(a,9);
	System.out.println(b.getClass().getName());
	System.out.print(Arrays.toString(b));
	
	
	}

}
