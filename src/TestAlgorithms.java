import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestAlgorithms {

	@Test
	public void testNull() {
		int[] nullCase = new int[0];
		int[] nullMergeSort = Algorithms.mergeSort(nullCase);
		int[] nullQuickSort = Algorithms.quickSort(nullCase);
		
		System.out.println(Arrays.toString(nullCase));
		System.out.println(Arrays.toString(nullMergeSort));
		System.out.println(Arrays.toString(nullQuickSort));
	}
	
	@Test
	public void testOne() {
		
		int[] oneCase = {5};
		int[] oneMergeSort = Algorithms.mergeSort(oneCase);
		int[] oneQuickSort = Algorithms.quickSort(oneCase);
		
		System.out.println(Arrays.toString(oneCase));
		System.out.println(Arrays.toString(oneMergeSort));
		System.out.println(Arrays.toString(oneQuickSort));
	}
	
	@Test
	public void testFixed() {
		int[] fixedCase = {1,2,3,4,5,6,7,8,9,10};
		int[] fixedMergeSort = Algorithms.mergeSort(fixedCase);
		int[] fixedQuickSort = Algorithms.quickSort(fixedCase);
		
		System.out.println(Arrays.toString(fixedCase));
		System.out.println(Arrays.toString(fixedMergeSort));
		System.out.println(Arrays.toString(fixedQuickSort));
	}
	
	@Test
	public void testFixed1() {
		int[] fixedCase = {10,9,8,7,6,5,4,3,2,1};
		int[] fixedMergeSort = Algorithms.mergeSort(fixedCase);
		int[] fixedQuickSort = Algorithms.quickSort(fixedCase);
		
		System.out.println(Arrays.toString(fixedCase));
		System.out.println(Arrays.toString(fixedMergeSort));
		System.out.println(Arrays.toString(fixedQuickSort));
	}
	
	@Test
	public void testFixed2() {
		int[] fixedCase = {99,0,8,88};
		int[] fixedMergeSort = Algorithms.mergeSort(fixedCase);
		int[] fixedQuickSort = Algorithms.quickSort(fixedCase);
		
		System.out.println(Arrays.toString(fixedCase));
		System.out.println(Arrays.toString(fixedMergeSort));
		System.out.println(Arrays.toString(fixedQuickSort));
	}
	
	@Test
	public void testRandom(){
		for (int i=0; i<=100; i++){
			Algorithms array = new Algorithms();
			int[] mergeSorted = Algorithms.mergeSort(array.getArray());
			int[] quickSorted = Algorithms.quickSort(array.getArray());
			assertEquals("",Arrays.toString(mergeSorted),Arrays.toString(quickSorted));
		}
	}
}
