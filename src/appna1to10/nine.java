package appna1to10;

public class nine {
    static void main(String[] args) {
        int arr[]= {20,45,35,45};

        int sum=0;
        int min= arr[0];
        int max= arr[0];

        for(int i=0; i<arr.length; i++){
           sum= sum+arr[i];

           if(arr[i]>max){
               max=arr[i];
           }

           if(arr[i] <min){
               min=arr[i];
           }
        }

        System.out.println(" Sum : "+sum);
        System.out.println(" Maximum : "+max);
        System.out.println(" Minin "+min);
    }
}
