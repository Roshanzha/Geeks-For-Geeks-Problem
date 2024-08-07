

// User function Template for Java

class day7 {
    public long kthElement(int k, int arr1[], int arr2[]) {
        // code here
        int a[]=new int[arr1.length+arr2.length];
        int j=0;
        for(int i=0;i<arr1.length;i++)
        {
            a[i]=arr1[i];
           //System.out.print(" "+a[i]);
            j++;
        }
        for(int i=0;i<arr2.length;i++)
        {
            a[i+arr1.length]=arr2[i];
             //System.out.print(" "+a[i+arr1.length]);
        }
        int element=0;
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            if(k==i+1)element=a[i];
        }
        return element;
    }
}