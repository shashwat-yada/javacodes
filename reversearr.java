class reversearr{
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6};
        //int temp=0;
        int n=arr1.length;

        for(int i=0;i<n/2;i++){
            int temp=arr1[i];
            arr1[i]=arr1[n-1-i];
            arr1[n-1-i]=temp;

        }
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]);
        }




    }
}