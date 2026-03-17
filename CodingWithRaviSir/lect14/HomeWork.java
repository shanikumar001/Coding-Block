package CodingWithRaviSir.lect14;

public class HomeWork {
    // Question 01 : 
    public static void Question01(int arr[]){
        int n = arr.length;
        // int newArr[n];
        for(int i = 1; i < n; i++){
            arr[i] = arr[i] + arr[i-1];    
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    // Question 2 :
    public static void Question02(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = arr[i] * arr[i];
        }
        // sorting : 
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i : arr){
            System.out.print(i + " ");
        }        
    }
    
    // Question 03 :
    public static void Question03(int arr[], int target){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("target is on indeces : " + arr[i] + " and " + arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 3, 2, 5};
        int target = 8;
        Question03(arr, target);

    }
}
