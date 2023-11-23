#include <iostream>

using namespace std;

int main() {

    //defining array
    int number_of_elements;
    cout << "Enter number of elements in array: ";
    cin >> number_of_elements;
    int arr[number_of_elements];
    cout << "\nEnter elements to be added to array: ";
    for (int i = 0; i < number_of_elements; i++) {
        cin >> arr[i];
    }

    //sorting array
    for (int j = 0; j < number_of_elements; j++) {
        for (int i = 0; i < number_of_elements - 1; i++) {
            if (arr[i] > arr[i+1]) {
                swap(arr[i], arr[i+1]);
            }
        }
    }
    cout << "\nSorted Array: \n";
    for (int i = 0; i < number_of_elements; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    //search input
    int search;
    cout << "Search for: ";
    cin >> search;

    //linear search
    int result_index;
    for (int i = 0; i < number_of_elements; i++) {
        if (arr[i] == search) {
            result_index = i+1;
        }
    }

    cout << "Element's last entry was at index " << result_index << endl;

    return 0;
}