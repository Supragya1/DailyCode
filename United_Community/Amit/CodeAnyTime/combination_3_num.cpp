#include <iostream>

using namespace std;

int main() {
    int a, b, c;
    cout << "Enter 3 digits: ";
    cin >> a >> b >> c;

    int arr[] = {a, b, c};

    int result[6];
    int x = 0;
    int result_num;

    for (int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                if (i != j && j != k && k != i) {
                    result_num = arr[i]*100 + arr[j]*10 + arr[k];
                    result[x] = result_num;
                    x++;
                }
            }
        }
    }
    
    for (int i  = 0; i < 6; i++) {
        int flag = 0;
        for (int j = i+1; j < 6; j++) {
            if (result[i] == result[j]) {
                flag = 1;
            }
        }
        if (flag == 0) {
                cout << result[i] << endl;
            }
    }

    return 0;
}