import java.util.Random;
import java.util.Arrays;

public class Algorithms {
	
	private Random rand = new Random();
	private int[] array = new int[rand.nextInt(24)+1];
	
	public Algorithms (){
		for (int i=0; i<array.length; i++){
			array[i]= rand.nextInt(99);
		}
	}
	
	public int[] getArray(){
		return array;
	}
	
	public static int[] mergeSort(int[] parent){
		if (parent.length>1){
			int[] a = Arrays.copyOfRange(parent,0,parent.length/2);
			int[] b = Arrays.copyOfRange(parent,parent.length/2,parent.length);
			return merge(mergeSort(a),mergeSort(b));
		}
		else {
			return parent;
		}
	}

	private static int[] merge(int[] a, int[] b) {
		int[] sorted = new int[a.length+b.length];
		int i = 0;
		int j = 0;
		for (int count=0; count<(a.length+b.length); count++){
			if ((i<a.length)&&(j<b.length)){
				if (a[i]<=b[j]){
					sorted[count]=a[i];
					i++;
				}
				else{
					sorted[count]=b[j];
					j++;
				}
			}
			else if(j<b.length) {
				sorted[count]=b[j];
				j++;
			}
			else {
				sorted[count]=a[i];
				i++;
			}
		}
		return sorted;
	}
	
	public static int[] quickSort(int[] parent){
		int[] array = new int[parent.length];
		for (int i=0; i<parent.length; i++){
			array[i] = parent[i];
		}
		if (array.length > 1){
			int pivot = array[array.length/2];
			int i = 0;
			int j = array.length-1;
			while (i < j){
				if ((array[i] >= pivot)&&(array[j] <= pivot)){
					int hi = array[i];
					int lo = array[j];
					array[i] = lo;
					array[j] = hi;
					i++;
					j--;
				}
				else if (array[i] < pivot){
					i++;
				}
				else {
					j--;
				}
			}
			
			int[] l,r;
			if (array[i] < pivot){
				l = Arrays.copyOfRange(array,0,i+1);
				r = Arrays.copyOfRange(array,i+1,array.length);
			}
			else {
				l = Arrays.copyOfRange(array,0,i);
				r = Arrays.copyOfRange(array,i,array.length);
			}
			
			return concatenate(quickSort(l),quickSort(r));
			
		}
		else {
			return array;
		}		
	}

	private static int[] concatenate(int[] left, int[] right) {
		int[] whole = new int[left.length+right.length];
		int i;
		for (i=0; i<left.length; i++){
			whole[i] = left[i];
		}
		for (int j=0; j<right.length; j++){
			whole[i+j] = right[j];
		}
		return whole;
	}

}
