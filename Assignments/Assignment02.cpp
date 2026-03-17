#include <iostream>
using namespace std;

// First Question :
void question01(){
    int n;
    cout << "Enter the value of n : ";
    cin >> n;
    int sp = 0;
    int row = 1;
    while(row <= n){
       int st = 1;
       while(st <= n){
        cout << "* ";
        st++;
       }
       cout << endl;
       row++;
    }
}

void pattern02(){
    int n;
    cin >> n;
    int row = 1;
    while(row <= n){
        int st = 1;
        while(st <= row){
            cout << "* ";
            st++;
        }
        cout << endl;
        row++;
    }
}

void pattern03(){
    int n;
    cin >> n;
    int row = 1;
    while(row <= n){
        int st = 1;
        while(st <= n-row+1){
            cout << "* ";
            st++;
        }
        cout << endl;
        row++;
    }
}

void pattern04(){
    int n;
    cin >> n;
    
    int row = 1;
    while(row <= n){
        // print space : 
        int sp = 1;
        while(sp <= n-row){
            cout << "  ";
            sp++;
        }
        // print star :
        int st = 1;
        while(st <= row){
            cout << "* ";
            st++;
        }

        cout << endl;
        row++;
    }
}

void pattern05(){
    int n;
    cin >> n;

    int row = 1;
    while(row <= n){
        // print space :
        int sp = 1;
        while(sp <= row-1){
            cout << "  ";
            sp++;
        }

        // print star :
        int st = 1;
        while(st <= n-row+1){
            cout << "* ";
            st++;
        }

        cout << endl;
        row++;
    }
}

void pattern06(){
    int n;
    cin >> n;

    int row = 1;
    while(row <= n){
        // print space :
        int sp = 1;
        while(sp <= (row-1)*2){
            cout << "  ";
            sp++;
        }
        // print star :
        int st = 1;
        while(st <= n-row+1){
            cout << "* ";
            st++;
        }

        cout << endl;
        row++;
    }
}

void pattern07(){
    int n;
    cin >> n;

    int row = 1;
    while(row <= n){
        int col = 1;
        while(col <= n){
            if(col == 1 | col == n | row == 1 | row == n){
                cout << "* ";
            }else{
                cout << "  ";
            }
            col++;
        }

        cout << endl;
        row++;
    }
}

void pattern08(){
    int n;
    cin >> n;

    int row = 1;
    while(row <= n){
        int col = 1;
        while(col <= n){
            if(col == row | col == n-row+1){
                cout << "* ";
            }else{
                cout << "  ";
            }
            col++;
        }

        cout << endl;
        row++;
    }
}

void pattern09(){
    int n;
    cin >> n;
    
    int row = 1;
    while(row <= n){
        // print space :
        int sp = 1;
        while(sp <= n-row){
            cout << "  ";
            sp++;
        }
        // print star : 
        int st = 1;
        while(st <= row*2-1){
            cout << "* ";
            st++;
        }

        cout << endl;
        row++;
    }
}

void pattern10(){
    int n;
    cin >> n;
    int row = 1;
    while(row <= n){
        // print space : 
        int sp = 1;
        while(sp <= row - 1){
            cout << "  ";
            sp++;
        }
        // print star : 
        int st = 1;
        while(st <= (n-row+1)*2-1){
            cout << "* ";
            st++;
        }

        cout << endl;
        row++;
    }
}

void pattern11(){
    int n;
    cin >> n;
    int row = 1;
    while(row <= n){
        // print space :
        int sp = 1;
        while(sp <= n-row){
            cout << "  ";
            sp++;
        }
        // print star :
        int st = 1;
        while(st <= row*2-1){
            if(st % 2 == 0){
                cout << "_ ";
            }else{
                cout << "* ";
            }
            st++;
        }

        cout << endl;
        row++;
    }
}

void pattern12(){
    int n;
    cin >> n;
    int row = 1;
    while(row <= n){
        // print space :
        int sp = 1;
        while(sp <= n - row){
            cout << "  ";
            sp++;
        }
        // print star :
        int st = 1;
        while(st <= row*2-1){
            if(st % 2 == 0){
                cout << "! ";
            }else{
                cout << "* ";
            }
            st++;
        }

        cout << endl;
        row++;
    }
}

void pattern13(){
    int n;
    cin >> n;
    int row = 1;
    while(row <= n*2-1){
        // print star : 
        int star = row;
        if(row > n){
            star = n * 2 - row;
        }
        int st = 1;
        while(st <= star){
            cout << "* ";
            st++;
        }

        cout << endl;
        row++;
    }
}

void pattern14(){
    int n;
    cin >> n;
    int row = 1;
    while(row <= n*2-1){
        int space = n - row;
        int star = row;
        if(row > n){
            space = row - n;
            star = n * 2 - row;
        }
        // print space :
        int sp = 1;
        while(sp <= space){
            cout << "  ";
            sp++;
        }
        // print star : 
        int st = 1;
        while(st <= star){
            cout << "* ";
            st++;
        }

        cout << endl;
        row++;
    }
}

void pattern15(){
    int n;
    cin >> n;
    int row = 1;
    while(row <= n*2-1){
        int space = row * 2 - 2;
        int star = n - row + 1;
        // logic for spcae and star afte row > n :
        if(row > n){
            space = (n * 2 - row) * 2 - 2;
            star = (row - n) + 1;
        }
        // print space : 
        int sp = 1;
        while(sp <= space){
            cout << "  ";
            sp++;
        }
        // print star :
        int st = 1;
        while(st <= star){
            cout << "* ";
            st++;
        }

        cout << endl;
        row++;
    }
}

void pattern16(){
    int n;
    cin >> n;
    int row = 1;
    while(row <= n*2 - 1){
        int space = n - row;
        int star = n - row + 1;
        if(row > n){
            space = row - n;
            star = row - n + 1;
        }
        // print space :
        int sp = 1;
        while(sp <= space){
            cout << "  ";
            sp++;
        }
        // print star : 
        int st = 1;
        while(st <= star){
            cout << "* ";
            st++;
        }

        cout << endl;
        row++;
    }
}

void pattern17(){
    int N;
    cin >> N;
    int n = (N+1)/2;

    int row = 1;
    while(row <= N){
        int star = n - row;
        int space = row * 2 - 1;
        if(row > n){
            star = row - n;
            space = (n * 2 - row) * 2 - 1;
        }
        // print first star : 
        int st = 1;
        while(st <= star){
            cout << "* ";
            st++;
        }
        // print space : 
        int sp = 1;
        while(sp <= space){
            cout << "  ";
            sp++;
        }
        // print second star : 
        int st2 = 1;
        while(st2 <= star){
            cout << "* ";
            st2++;
        }

        cout << endl;
        row++;
    }

}

void pattern18(){
    int N;
    cin >> N;
    int n = (N+1)/2;

    int row = 1;
    while(row <= N){
        int space = n - row;
        int star = row * 2 - 1;
        if(row > n){
            space = row - n;
            star = (n * 2 - row) * 2 - 1;
        }
        // print space :
        int sp = 1;
        while(sp <= space){
            cout << "  ";
            sp++;
        }
        // print star : 
        int st = 1;
        while(st <= star){
            cout << "* ";
            st++;
        }

        cout << endl;
        row++;
    }
}

void pattern19(){
    int N;
    cin >> N;
    int n = (N+1)/2;

    int row = 1;
    while(row <= N){
        int star = n - row + 1;
        int space = (row - 1) * 2 - 1;
        int star2 = n - row;
        if(row > n){
            star = row - n + 1;
            space = ((n-1)*2 - row) * 2 + 1;
            star2 = row - n;
        }
        // print first star :
        int st = 1;
        while(st <= star){
            cout << "* ";
            st++;
        }
        // print space : 
        int sp = 1;
        while(sp <= space){
            cout << "  ";
            sp++;
        }
        cout << "* ";
        // print second star : 
        int st2 = 1;
        while(st2 <= star2){
            cout << "* ";
            st2++;
        }

        cout << endl;
        row++;
    }
}

void pattern019(){
    int N;
    cin >> N;
    int n = (N+1)/2;
    int row = 1;
    while(row <= N){
        int star = n - row;
        int space = (row - 1) * 2 - 1;
        if(row > n){
            star = row - n;
            space = ((n * 2 - row) - 1) * 2 - 1;
        }
        int st = 1;
        while(st <= star){
            cout << "* ";
            st++;
        }
        int sp = 1;
        if(row != 1 | row != N){
            cout << "* ";
        }else{
            cout << "* ";
        }
        while(sp <= space){
            cout << "  ";
            sp ++;
        }
        if(row != 1 | row != N){
            cout << "* ";
        }else{
            cout << "* ";
        }
        int st2 = 1;
        while(st2 <= star){
            cout << "* ";
            st2++;
        }

        cout << endl;
        row++;
    }
}

#include <iostream>
using namespace std;

void pattern0019() {
    int N;
    cin >> N;

    int n = N / 2;
    cout << n << endl;

    for (int row = 0; row < N; row++) {

        int star = (row <= n) ? n - row : row - n;
        int space = N - 2 * star;

        // Print left stars
        for (int i = 0; i < star; i++) {
            cout << "* ";
        }

        // Print middle hollow part
        for (int i = 0; i < space; i++) {
            if (i == 0 || i == space - 1)
                cout << "* ";
            else
                cout << "  ";
        }

        // Print right stars
        for (int i = 0; i < star; i++) {
            cout << "* ";
        }

        cout << endl;
    }
}


void pattern20(){
    int N;
    cin >> N;
    int n = N / 2 + 1;
    int row = 1;
    while(row <= N){
        int space = (row <= n) ? n - row : row - n;
        int star = N - space * 2;
        // print space : 
        int sp = 1 ;
        while(sp <= space){
            cout << "  ";
            sp++;
        }
        // print diamond space with star : 
        int st = 1;
        while(st <= star){
            if(st == 1 || st == star){
                cout << "* ";
            }else{
                cout << "  ";
            }
            st++;
        }

        cout << endl;
        row++;
    }
}

void pattern21(){
    int n ;
    cin >> n;
    int row = 1;
    while(row <= n){
        int star = row - 1;
        int space = (n - star) * 2 - 1;
        // Print left star :
        int st = 1;
        while(st <= star){
            cout << "* ";
            st++;
        }
        // Print space : 
        int sp = 1;
        while(sp <= space){
            if(sp == 1 || sp == space){
                cout << "* ";
            }else{
                cout << "  ";
            }
            sp++;
        }
        // Print right star :
        int st2 = 1;
        while(st2 <= star){
            cout << "* ";
            st2++;
        }

        cout << endl;
        row++;
    }
}

void pattern22(){
    int n;
    cin >> n;
    int row = 1;
    while(row <= n){
        int star = n - row;
        int space = row * 2 - 1;
        // print left star :
        int st = 1;
        while(st <= star){
            cout << "* ";
            st++;
        }
        // print space :
        int sp = 1;
        while(sp <= space){
            if(sp == 1 || sp == space){
                cout << "* ";
            }else{
                cout << "  ";
            }
            sp++;
        }
        // print right star :
        int st2 = 1;
        while(st2 <= star){
            cout << "* ";
            st2++;
        }

        cout << endl;
        row++;
    }
}

void pattern23(){
    int n;
    cin >> n;
    int row = 1;
    while(row <= n){
        int star = n - row;
        int space = row * 2 - 1;
        // print left star :
        int st = 1;
        while(st <= star){
            cout << "  ";
            st++;
        }
        // print space :
        int sp = 1;
        while(sp <= space){
            cout << "1 ";
            sp++;
        }

        cout << endl;
        row++;
    }
}

void pattern24(){
    int n;
    cin >> n;
    int row = 1;
    while(row <= n){
        int star = n - row;
        int space = row * 2 - 1;
        // print left star :
        int st = 1;
        while(st <= star){
            cout << "  ";
            st++;
        }
        // print space :
        int sp = 1;
        while(sp <= space){
            cout << row << " ";
            sp++;
        }

        cout << endl;
        row++;
    }
}

void pattern25(){
    int n;
    cin >> n;
    int count = 1;
    int row = 1;
    while(row <= n){
        int star = n - row;
        int space = row * 2 - 1;
        // print left star :
        int st = 1;
        while(st <= star){
            cout << "\t";
            st++;
        }
        // print space :
        int sp = 1;
        while(sp <= space){
            cout << count << "\t";
            sp++;
            count++;
        }

        cout << endl;
        row++;
    }
}

void pattern26(){
    int n;
    cin >> n;
    int row = 1;
    while(row <= n){
        int star = n - row;
        int space = row * 2 - 1;
        // print left star :
        int st = 1;
        while(st <= star){
            cout << "  ";
            st++;
        }
        // print space :
        int sp = 1;
        while(sp <= space){
            cout << sp << " ";
            sp++;
        }

        cout << endl;
        row++;
    }
}

void pattern27(){
    int n;
    cin >> n;
    int row = 1;
    while(row <= n){
        int space = n - row;
        int star = row;
        int star2 = row - 1;
        // print space :
        int sp = 1;
        while(sp <= space){
            cout << "  ";
            sp++;
        }
        // print star :
        int st = 1;
        while(st <= star){
            cout << st << " ";
            st++;
        }
        // print right star :
        int st2 = star2;
        while(st2 >= 1){
            cout << st2 << " ";
            st2--;
        }

        cout << endl;
        row++;
    }
}

void pattern28(){
    int n;
    cin >> n;
    int row = 1;
    while(row <= n){
        int space = n - row;
        int star = row;
        int star2 = row - 1;
        // print space :
        int sp = 1;
        
        while(sp <= space){
            cout << "  ";
            sp++;
            
        }
        // print star :
        int count = row;
        int st = 1;
        while(st <= star){
            cout << count << " ";
            count++;
            st++;
        }
        // print right star :
        int count2 = row * 2 - 2;
        int st2 = star2;
        while(st2 >= 1){
            cout << count2 << " ";
            st2--;
            count2--;
        }

        cout << endl;
        row++;
    }
}

void pattern29(){
    int n;
    cin >> n;
    int row = 1;
    while(row <= n){
        int space = n - row;
        int star = row;
        int star2 = row - 1;
        // print space :
        int sp = 1;
        while(sp <= space){
            cout << "  ";
            sp++;     
        }
        // print star :
        int st = 1;
        while(st <= star){
            if(st == 1){
                cout << row << " ";
            }else{
                cout <<  "0 ";
            }
            st++;
        }
        // print right star :
        int st2 = star2;
        while(st2 >= 1){
            if(st2 == 1){
                cout << row << " ";
            }else{
                cout <<  "0 ";              
            }
            st++;
            st2--;
        }

        cout << endl;
        row++;
    }
}

void pattern30(){
    int n;
    cin >> n;
    int row = 1;
    while(row <= n){
        int st = n;
        while(st >= 1){
            cout << st << " ";
            st--;
        }
        cout << endl;
        row++;
    }
}

void pattern31(){
    int n;
    cin >> n;
    int row = 1;
    while(row <= n){
        int st = n;
        while(st >= 1){
            if(st == row){
                cout << "* ";
            }else{
                cout << st << " ";
            }
            st--;
        }
        cout << endl;
        row++;
    }
}

void pattern32(){
    int n;
    cin >> n;
    int count = 0;
    int row = 1;
    while(row <= n*2-1){
        int end ;
        if(row <= n){
            end = row * 2 - 1;
            count++;
        }else{
            end = (n * 2 - row) * 2 - 1;
            count--;
        }
        int st = 1;
        while(st <= end){
            if(st % 2 == 0){
                cout << "* ";
            }else{
                cout << count << " ";
            }
            st++;
        }
        cout << endl;
        row++;
    }
}

void pattern33(){
    int n;
    cin >> n;
    int row = n;
    while(row >= 1){
        int space = row - 1;
        int star = n - row;
        int star2 = n - row - 1;
        // print space :
        int sp = 1;
        while(sp <= space){
            cout << "  ";
            sp++;
        }
        // print left star : 
        int st = space;
        while(st >= 1){
            if(row == n){
                cout << "0 ";
            }else{
                cout << st << " ";
            }
            st--;
        }
        // print right star :
        int st2 = 1;
        while(st2 <= star2){
            cout << "* ";
            st2++;
        }
        cout << endl;
        row--;
    }

}

void pattern033(){
    int n;
    cin >> n;
    int row = n;
    while(row >= 1){
        int space = row - 1;
        int star = (n - row + 1) * 2 - 1;
        // print space :
        int sp = 1;
        while(sp <= space){
            cout << "  ";
            sp++;
        }

        //print star : 
        int num = row;
        int st = 1;
        while(st <= star){
            if(num>9) cout<<"0 ";
            else cout<<num<<" ";
            if(st<star/2+1){
                num++;
            }
            else{
                num--;
            }
            
            st++;
        }

        cout << endl;
        row--;
    }
}

int main(){
    // question01();
    // pattern02();
    // pattern03();
    // pattern04();
    // pattern05();
    // pattern06();
    // pattern07();
    // pattern08();
    // pattern09();
    // pattern10();
    // pattern11();
    // pattern12();
    // pattern13();
    // pattern14();
    // pattern15();
    // pattern16();
    // pattern17();
    // pattern18();
    // pattern19();
    // pattern0019();
    // pattern20();
    // pattern21();
    // pattern22();
    // pattern23();
    // pattern24();
    // pattern25();
    // pattern26();
    // pattern27();
    // pattern28();
    // pattern29();
    // pattern30();
    // pattern31();
    // pattern32();
    // pattern33();
    pattern033();

    return 0;
}

