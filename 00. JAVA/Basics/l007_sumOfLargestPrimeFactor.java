package Basics;
public class l007_sumOfLargestPrimeFactor {
    public static int sumOfLargestPrimeFactor (int num)
    {
        int arr[] = new int[num + 1];
        int sum = 0;
        int max = num / 2;
        
        for (int i = 2; i <= max; i++)
        {
            System.out.println("value of i: "+ i);
            
        	if (arr[i] == 0)
	        {
        	    for (int j = i * 1; j <= num; j += i){
	                arr[j] = i;
                    System.out.print(arr[j] + " ");
                }

	        }
            System.out.println();
            for(int k=0; k < arr.length; k++){
                System.out.print(arr[k]+ " ");
            }
            System.out.println();
            
        }
        System.out.println();
        for(int k=0; k < arr.length; k++){
            System.out.print(arr[k]+ " ");
        }
        System.out.println();
        for (int i = 2; i <= num; i++)
        {
        	if (arr[i] != 0){
	            sum += arr[i];
                System.out.print(sum + " ");
            }
	        else{
	            sum += i;
                System.out.print(sum + " ");
            }
        }
        return sum;
  }
  public static void main (String[]args)
  {
    System.out.println (sumOfLargestPrimeFactor (10));
  }
}
