import java.util.*;
public class LeaderElement
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[n-1];
        ArrayList<Integer> list=new ArrayList<>();
        list.add(max);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                list.add(max);
            }
        }
        Collections.reverse(list);
        System.out.println("Leader Elements");
        for(int l:list){
            System.out.print(l+" "); 
        }
    }
}