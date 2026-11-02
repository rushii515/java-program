package appna1to10;

public class Ten {
    static void main(String[] args) {
        int arr[] ={ 10,20,30,45};
        int start= 0;
       int end= arr.length-1;


       while ( start<end){
           int temp= arr[start];
           arr[start]= arr[end];
           arr[end]=temp;

           start++;
           end--;

       }


        System.out.println(" Reverse Number");
       for (int i=0; i<arr.length; i++){
           System.out.print(arr[i] + " ");
       }
    }
}
