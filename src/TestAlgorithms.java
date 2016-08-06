import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestAlgorithms {

	@Test
	public void test() {
		int [] nullCase = new int[0];
		int [] nullSorted = Algorithms.mergeSort(nullCase);
		Algorithms array = new Algorithms();
		System.out.println(Arrays.toString(nullCase));
		System.out.println(Arrays.toString(nullSorted));
		System.out.println(Arrays.toString(array.getArray()));
		int[] sorted = Algorithms.mergeSort(array.getArray());
		System.out.println(Arrays.toString(sorted));;
	}

}
