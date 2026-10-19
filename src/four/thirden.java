package four;

public class thirden {
    public static void main(String[] args){

        int[] arr= {3,4,5,6,7};

        int smaller=arr[0];
        int largest=arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]< smaller){
                smaller= arr[i];
            }

            if (arr[i] > largest){
                largest= arr[i];
            }
        }
        System.out.println(" Smaller number: " +smaller);
        System.out.println(" Largesgt Number: " +largest);

    }
}
