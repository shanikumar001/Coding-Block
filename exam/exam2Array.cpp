#include<iostream>
using namespace std;
void Question01(){
    int n;
    cin >> n;
    int arr[n];
    int z = 0; int o = 0; int t = 0;
    for(int i = 0; i < n; i++){
        cin >> arr[i];
        if(arr[i] == 0){
            z++;
        }else if(arr[i] == 1){
            o++;
        }else{
            t++;
        }
        
    }
    cout << z << o << t << endl;
    for(int i = 1; i <= n; i++){
        if(i <= z){
            arr[i-1] = 0;
        }else if(z < i && i <= (o + z)){
            arr[i-1] = 1;
        }else{
            arr[i-1] = 2;
        }
    }
    for(int i : arr){
        cout << i << " ";
    }
}

void Question02(){
    int arr[] = {4, 1, 2, 10};
    int n = 4;
    int max = arr[0];
    int a = 0;
    int b = 0;
    int left = 0;
    int right = n-1;
    int i = 0 + 2;
    while(left <= right){
        if(i % 2 == 0){
            if(arr[left] > arr[right]){
                a += arr[left];
                left++;
            }else{
                a += arr[right];
                right--;
            }
            i++;
        }else{
            if(arr[left] > arr[right]){
                b += arr[left];
                left++;
            }else{
                b += arr[right];
                right--;
            }
            i++;
        }
    }
    cout << a << " " << b;
}

void question03(){
    int arr[] = {2, 2, 3, 1, 3, 2, 1, 1};
    int n = 8;
    sort(arr, arr+n);
    bool isMajority = false;
    // int st = 0;
    // for(int i = 0; i < n; i++){
    //     int count = 0;
    //     for(int j = st; j < n; j++){
    //         if(arr[i] == arr[j]){
    //             count++;
    //             st++;
    //         }
    //     }
    //     if(count > n/3){
    //         cout << arr[i] << " ";
    //         isMajority = true;
    //     }
    // }
    // if(!isMajority){
    //     cout << "No Majority Elements";
    // }
    // Effecient Method : 
    int count = 1;
    for(int i = 1; i < n; i++){
        if(arr[i] == arr[i-1]){
            count++;
        }else{
            if(count > n/3){
                cout << arr[i] << " ";
                isMajority = true;
            }
            count = 1;
        }
    }
    if(count > n/3){
        cout << arr[n-1] << " ";
        isMajority = true;
    }
    if(!isMajority){
        cout << "No Majority Elements";
    }
}

int main(){
    // question03();
    // Question01();
    question03();
    return 0;
}