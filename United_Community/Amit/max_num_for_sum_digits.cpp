#include <iostream>

using namespace std;

int main() {
    int num_dig, sum;
    cout << "Enter number of digits: ";
    cin >> num_dig;
    cout << "Enter sum of digits: ";
    cin >> sum;
    int ans;
    string answer;
    
    if (num_dig*9 < sum) {
        cout<<"No such numbers exists";
        goto End;
    }

    while (num_dig > 0) {
        if (sum > 9) {
            sum -= 9;
            answer += '9';
        }
        else {
            answer += to_string(sum);
        }
    num_dig--;
    }
    
    cout << answer;
    
    End:
    return 0;
}