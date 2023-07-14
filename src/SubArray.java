import java.util.*;

class Solution
{
    public int[] subarray(int[] array,int b,int c)
    {
        int n=Math.abs(c-b)+1;
        int[] solution=new int[n];
        int j=0;
        for(int i=b;i<=c;i++)
        {
            solution[j]=array[i];
            j++;
        }
        return solution;

    }
}

class SubArray
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        Solution solution =new Solution();
        System.out.println(Arrays.toString(solution.subarray(array,b,c)));
    }
}
