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

}
