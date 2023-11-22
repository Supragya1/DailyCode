#include <iostream>

using namespace std;

bool lucky_number_checker (int input) {
    int count = 2;
    while (true) {
        if(input % count == 0){
            cout<<"Number is NOT a Lucky Number"<<endl;
            return false;
        }
        input -= input/count;
        count++;
        if (count > input) {
            return true;
        }
    }
}

int main() {

    cout << "To check if a given number is a lucky number or not\n";
    cout << "Enter number to check: ";
    int input;
    cin >> input;
    
    bool result = lucky_number_checker(input);
    if (result == true) {
        cout << "Number is a lucky number" << endl;
    }
    
    return 0;
}