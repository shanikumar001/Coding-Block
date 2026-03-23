#include <iostream>
using namespace std;

// Recursion : 
// 1. Print all numbers to n : 
void printNumbers(int n){
    int m = 100;
    if(n == m){
        cout << m << " " << endl;
        return ;
    }
    cout << n << " ";
    printNumbers(n+1);
}

// 2. Print Fibonacci Serries : 
// 0, 1, 1 ,2, 3, 5, 8,.....n

void prinFib(int a, int b, int n){
    // using for loop : 
    // for(int i = 1; i < n; i++){
    //     cout << a << " ";
    //     int temp = a;
    //     a = b;
    //     b = a + temp;
        
    // }

    // using recursion : 
    if(n == 0) return;
    cout << a << " ";
    prinFib(b, a+b, n-1);
}

int printFibonacciOfNth(int n){
    if(n == 1 || n == 0){
        return n;
    }
    return printFibonacciOfNth(n-1) + printFibonacciOfNth(n-2);
}


// 03. Factorial of n :
int fact(int n){
    if(n == 0) return 1;
    return n * fact(n-1);
} 

// 04. Sum of N natural number : 
int sumOfN(int n){
    if(n == 0) return 0;
    return n + sumOfN(n-1);
}

// Reverse of an Array : 
void reverseArr(int arr[], int left, int right){
    if(left > right) return;
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
    reverseArr(arr, left+1, right-1);

}

// Inverse of an Array : 
void inverseArr(int arr[], int newArr[], int i, int n){
    if(i == n) return;

    newArr[arr[i]] = i;
    inverseArr(arr, newArr, i + 1, n);
}

// Concatenation of an array : 
void concatArr(int arr[], int n){
    int ans[2*n];
    int i = 0;
    while(i < 2*n){
        ans[i] = arr[i];
        if(i >= n){
            ans[i] = arr[i - n];
        }
        i++;
    }
    for(int i : ans){
        cout << i << " ";
    }
}
    
int main(){
    // printNumbers(0);
    // printFibonacci(2);
    // prinFib(0, 1, 16);
    // cout << fact(5);
    // cout << sumOfN(5);
    int arr[] = {0, 2, 4, 1, 3};
    // reverseArr(arr, 0, 5);
    // int newArr[4];
    // inverseArr(arr, newArr, 0, 4);
    concatArr(arr, 5);
    
    return 0;
}