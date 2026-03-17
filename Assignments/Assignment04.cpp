#include <iostream>
using namespace std;


// question 01 : 
void inverse(int arr[], int n){
    // int arr[n];
    for(int i = 0; i < n; i++){
        arr[arr[i]] = i;
    }
    for(int i = 0; i < n; i++){
        cout << i << " ";
    }
}

// QUestion 02 : 
void threeSum(int arr[], int n, int target){ 
    sort(arr, arr + n);
    for(int i = 0; i < n-2; i++){
        int left = i + 1;
        int right = n - 1;
        while(left < right){
            int sum = arr[i] + arr[left] + arr[right];
            if(sum == target){
                cout << arr[i] << ", " << arr[left] << " and " << arr[right] << endl;
                left++;
                right--;
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
    }
}

// Question 03 :
int findTarget(int arr[], int n, int target){
    for(int i = 0; i < n; i++){
        if(arr[i] == target){
            return i;
        }
    }
    return -1;
}

// Question 04 : 
void pairSum(int arr[], int n, int target){
    for(int i = 0; i < n; i++){
        for(int j = i + 1; j < n; j++){
            if(arr[i] + arr[j] == target && i != j){
                cout << i << " and " << j << endl;
            }
        }
    }
}

// Question 05 : 
int maxValue(int arr[], int n){
    int max = arr[0];
    for(int i = 0; i < n; i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }
    return max;
}

// Question 07 : 
int helpRamu(int c1, int c2, int c3, int c4, int n, int m, int rick[], int cabs[] ){
    // for risckshaw : 
    int costOfRickshaw = 0;
    for(int i = 0; i < n; i++){
        costOfRickshaw += min(rick[i] * c1, c2);
    }
    costOfRickshaw = min(costOfRickshaw, c3);

    int costOfCabs = 0;
    for(int i = 0; i < m; i++){
        costOfCabs += min(cabs[i] * c1, c2);
    }
    costOfCabs = min(costOfCabs, c3);

    return min(costOfCabs + costOfRickshaw , c4);
   
}

// Question 08 : 
void alexGoesShoping(int n, int items[]){
    int q;
    cin >> q;
    while(q--){
        int A, k ;
        cin >> A >> k;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(A % items[i] == 0){
                count++;
            }
        }
        if(count >= k){
            cout << " Yes " << endl;
        }else{
            cout << " No " << endl;
        }
    }
}

// Question 09 : 
void arraysReverse(){
    int n;
    cin >> n;
    int arr[n];
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }

    for(int i = 0; i < n/2; i++){
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
    }

    for(int i = 0; i < n; i++){
        cout << arr[i] << " ";
    }
}

#include <iostream>
using namespace std;

void SquareAndSortArrray(){
    int n;
    cin >> n;

    int arr[n];
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }

    int left = 0;
    int right = n - 1;
    int pos = n - 1;

    int result[n];

    while(left <= right){
        int leftsqr = arr[left] * arr[left];
        int rightsqr = arr[right] * arr[right];

        if(leftsqr > rightsqr){
            result[pos] = leftsqr;
            left++;
        }else{
            result[pos] = rightsqr;
            right--;
        }
        pos--;
    }

    for(int i = 0; i < n; i++){
        cout << result[i] << " ";
    }
}
// Question 11 : 
void sortrAndw(){
    int n;
    cin >> n;

    int arr[n];
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }
    int count = 0;
    // for(int i = 0; i < n; i++){
    //     if(arr[i] == 0){
    //         count++;
    //     }
    // }
    // for(int i = 0; i < n; i++){
    //     if(i < count){
    //         arr[i] = 0;
    //     }else{
    //         arr[i] = 1;
    //     }
    // }

    // Best Method : 
    int left = 0;
    int right  = n - 1;
    // void swap(int &a, int &b){
    //     int temp = a;
    //     a = b;
    //     b = temp;
    // }
    while(left < right){
        if(arr[left] == 1 && arr[right] == 0){
            swap(arr[left], arr[right]);
            left++;
            right--;
        }
        if(arr[left] == 0){
            left++;
        }
        if(arr[right] == 1){
            right--;
        }
    }

    for(int i : arr){
        cout << i << " ";
    }
}

// Question 12 : 
void calculateTheSum(){
    int n;
    cin >> n;
    long long arr[n];  // use long long for large numbers

    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }

    int x;
    cin >> x;  // the X for operation
    long long sum = 0;
    const long long MOD = 1000000007;

    for(int i = 0; i < n; i++){
        int lastNo = (i - x + n) % n;  // cyclic index
        sum += (arr[i] + arr[lastNo]);
        sum %= MOD;  // take mod at each step to avoid overflow
    }

    cout << sum << endl;
}

// Question 13 : 
void bubbleSort(){
    int n;
    cin >> n;
    int arr[n];
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }
    for(int i = 0; i < n-1; i++){
        int min = i;
        for(int j = 0; j < n-i-1; j++){
            if(arr[j] < arr[min]){
                min = j;
            }
        }
        swap(arr[i], arr[min]);
    }
    for(int i : arr){
        cout << i << " ";
    }
}

// Question 14 : 
void selectionSort(){
    int n;
    cin >> n;
    int arr[n];
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }
    for(int i = 0; i < n; i++){
        for(int j = i+1; j < n; j++){
            if(arr[i] > arr[j]){
                swap(arr[i], arr[j]);
            }
        }
    }
    for(int i : arr){
        cout << i << " ";
    }
}

void insertionSort(int arr[], int n){
    for(int i = 1; i < n; i++){
        int prev = i-1;
        int current = arr[i];
        while(prev >= 0 && arr[prev] > current){
            arr[prev+1] = arr[prev];
            prev--;
        }
        arr[prev+1] = current;
    }

    for(int i = 0; i < n; i++){
        cout << arr[i] << endl;
    }
}

// Question 18 : 
void sortingPatents(){
    int n;
	cin >> n;
	int arr[n];
	int r = 0, w = 0, b = 0;
	for(int i = 0; i < n; i++){
		cin >> arr[i];
		if(arr[i] == 0){
			r++;
		}else if(arr[i] == 1){
			w++;
		}else{
			b++;
		}
	}
     cout << r << w << b << endl;
	for(int i = 0; i < n; i++){
            if(i <= r-1){
                arr[i] = 0;
            }else if(r <= i && i <= w+r-1){
                arr[i] = 1;
            }else if((w+r) <= i && i <= (b+w+r-1)){
                arr[i] = 2;
            }
        }
    for(int i : arr){
        cout << i << " ";
    }
}

int main(){
    // int items[] = {100, 200, 400, 100};
    // alexGoesShoping(4, items);
    // arraysReverse();
    // SquareAndSortArrray();
    // sortrAndw();
    // calculateTheSum();
    // bubbleSort();
    // selectionSort();
    // int arr[] = {0, 1, 2, 1, 2};
    // insertionSort(arr, 5);
    sortingPatents();
}