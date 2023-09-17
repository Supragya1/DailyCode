//input array, find element in array, print result

#include <iostream>

using namespace std;

void swap(int &n1, int &n2) {
    int temp;
    temp = n1;
    n1 = n2;
    n2 = temp;
}

int recursive_binary_search(int arr[], int low, int high, int search) {
    if (high >= low) {
        int mid = low + (high - low)/2;

        if (arr[mid] == search) {
            return mid;
        }

        if (arr[mid] > search) {
            return recursive_binary_search(arr, low, mid - 1, search);
        }
        else {
            return recursive_binary_search(arr, mid + 1, high, search);
        }
    }   
    return -1;
}

int iterative_binary_search(int arr[], int low, int high, int search) {
    while (low <= high) {
        int mid = low + (high - low)/2;

        if (arr[mid] == search) {
            return mid;
        }

        if (arr[mid] > search) {
            high = mid - 1;
        }
        else {
            low = mid + 1;
        }

    }

    return -1;
}

void selection_sort(int arr[], int number_of_elements) {
    int min_index;
    for (int i = 0; i < number_of_elements - 1; i++) {
        min_index = i;
        for (int j = i + 1; j < number_of_elements; j++) {
            if (arr[j] < arr[min_index]) {
                min_index = j;
            }
        }
        if (min_index != i) {
            swap(arr[min_index], arr[i]);
        }
    }
}


int main() {
    //defining array
    int number_of_elements;
    cout << "Enter number of elements to be entered: ";
    cin >> number_of_elements;
    int arr[number_of_elements];
    cout << "Enter numbers to be added to array: ";
    for (int i = 0; i < number_of_elements; i++) {
        cin >> arr[i];
    }

    //organizing array - bubble sort
    for (int j = 0; j < number_of_elements; j++) {
        for (int i = 0; i < number_of_elements - 1-j; i++) { //why was this working without -1 for values under 10
            if (arr[i] > arr[i+1]) {
                swap(arr[i], arr[i+1]);
            }
        }
    }

    // selection sort
    selection_sort(arr, number_of_elements);

    
    //output sorted array
    cout << "\nSorted Array: \n";
    for (int i = 0; i < number_of_elements; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    //searching for value
    int search;
    cout << "Search for: ";
    cin >> search;

    //result of recursive binary search
    int result = recursive_binary_search(arr, 0, number_of_elements-1, search);
    (result == -1) 
        ? cout << "Element not present" 
        : cout << "Element present at index " << result+ 1;

    //result of iterative binary search
    int result = iterative_binary_search(arr, 0, number_of_elements-1, search);
    (result == -1) 
        ? cout << "Element not present" 
        : cout << "Element present at index " << result + 1;

    return 0;
}