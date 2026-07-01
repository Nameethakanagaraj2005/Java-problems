import java.util.ArrayDeque;
class QueueReverse{
	public static void main(Strng[] args){
		int[] arr={1,2,3,4,5};
		int k=3;
		ArrayQueue<Integer> p=new ArrayQueue<>();
		for(int i=0;i<k;i++){
			p.addFirst(arr[i]);
		}
		for(int i=k;i<arr.length;i++){
			p.addLast(arr[i]);
		}
		System.out.println(p);
	}
}
