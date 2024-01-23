public class sorting {

    public static void printarray(int arr[]){
        // int [] arr = {7,5,3,1,6};
        for(int  i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {7,5,3,1,6};
// bubble sort
        // for(int i=0; i<arr.length-1;i++){
        //     // inner loop -> push the greater element at the last position
        //     for(int j=0;j<arr.length-i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }printarray(arr);


        // selection sort:-

        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp =arr[smallest];
            arr[smallest] = arr[i];
            arr[i]=temp;
        }printarray(arr);

        
    }
}


