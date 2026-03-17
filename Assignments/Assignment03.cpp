#include <iostream>
using namespace std;

// 01 : Convert a binary number to decimal format.
int toDecimal(int n){
    int decimal = 0;
    int power = 1;
    while(n > 0){
        int digit = n % 10;
        decimal += digit * power;
        power *= 2;
        n /= 10;
    }
    return decimal;
}

// 02 : Print first N1 terms of the series 3n + 2 which are not multiples of N2.
void nSeries(int N1, int N2){
    int n = 1;
    while(N1 > 0){
        if((3 * n + 2) % N2 != 0){
            cout << 3 * n + 2 << endl;
            N1--;
        }
        n++;
    }
}

// 03 : Find LCM of two numbers.
int lcmOfTwo(int num1, int num2, int hcf){
    // int lcm = 1;
    // int n = 1;
    // while(true){
    //     if((num1 * n) % num2 == 0){
    //         return num1 * n;
    //     }else{
    //         n++;
    //     }
        
    // }

    // second efficient method : 
    return (num1 * num2) / hcf;
}

// 04 : Find HCF of two numbers.
int hcfOfTwo(int num1, int num2){
    int hcf = 1;
    int rem;
    while(true){   
        rem = num1 % num2;
        if(rem != 0){
            num1 = num2;
            num2 = rem;
        }else{
            return num2;
        }
    }
}

// 05 : Print Nth Fibonacci number (0-based indexing).
void fibonacci(int N){
    int n = 2;
    int a = 0;
    int b = 1;
    int c;
    if(N >= 0) cout << a << " " << endl;
    if(N >= 1) cout << b << " ";
    for(int i = 2; i <= N; i++){
        c = a + b;
        cout << c << " " << endl;
        a = b;
        b = c;
        
    }
}

// 06 : Convert Fahrenheit to Celsius in given range with step.
void toCelsius(int min, int max, int step){
    float celsius;
    for(int i = min; i <= max; i += step){
        celsius = (i - 32) * 5 / 9;
        cout << i << " : " << celsius << " " << endl;
    }
}

// 07 : Convert Celsius to Fahrenheit in given range with step.
void toFahrenheit(int min, int max, int step){
    float fahrenheit;
    for(int i = min; i <= max; i += step){
        fahrenheit = (i * 9 / 5) + 32;
        cout << i << " : " << fahrenheit << " " << endl;
    }
}

// 08 : ConvertCheck whether a number is Prime or Not.
void isPrime(int n){
    if (n <= 1) {
        cout << n << " is not a Prime Number";
        return;
    }
    bool isPrime = true;
    for(int i = 2; i * i <= n; i++){
        if(n % i == 0){
            isPrime = false;
            break;
        }
    }
    if (isPrime)
        cout << n << " is a Prime Number";
    else
        cout << n << " is not a Prime Number";

}

// 09 : Find GCD of two numbers.
int fintGCD(int num1, int num2){
    while(num2 != 0){
        int rem = num1 % num2;
        num1 = num2;
        num2 = rem;
    }
    return num1;
}

// 10 : Chewbacca and Number (invert digits to get minimum number). 


int main(){
    // cout << toDecimal(101010) << endl;
    // nSeries(10, 4);
    // int hcf = hcfOfTwo(4, 6);
    // cout << lcmOfTwo(4, 6, hcf) << endl;
    // fibonacci(10);
    // toCelsius(0, 100, 20);
    // toFahrenheit(0, 100, 20);
    isPrime(12001);
    return 0;
}