package Array;

public class RotationOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Inserting element in between the array
		/*
		int A[]=new int[10];
        A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;
        int n = 6;
        
        for(int x:A)
        {
        	System.out.print(x+" , ");
        }
        for(int i=0;i<n;i++)
            System.out.print(A[i]+",");
        System.out.println("");
        
        int x=20;
        int index=2;
        
        for(int i=A.length-1;i>index;i--)
            A[i]=A[i-1];
        A[index]=x;
        
        for(int i=0;i<A.length;i++)
            System.out.print(A[i]+",");
        System.out.println("");
        */
		
		// LEFT ROtation
        
        int A[]={3,9,7,8,12,6,15,5,4,10};
        
        for(int x:A)
            System.out.print(x+",");
        System.out.println("");
        int temp=A[0];
        
        for(int i=1;i<A.length;i++)
        {
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;
        
        for(int x:A)
            System.out.print(x+",");
        System.out.println("");
	}

}
