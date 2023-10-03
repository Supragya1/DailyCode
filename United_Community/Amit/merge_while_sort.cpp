#include <iostream>

using namespace std;

void swap(int &n1, int &n2) {
    int temp;
    temp = n1;
    n1 = n2;
    n2 = temp;
}

//compare with all values of arr1 && with all values of arr2
void merge_sort(int arr1[], int arr2[], int arr3[], int number_of_elements_1, int number_of_elements_2) {
    int min_index_1, min_index_2;
    int k = 0;
    for (int i1 =0, i2 = 0; i1 < number_of_elements_1, i2 < number_of_elements_2;) {
    min_index_1 = i1;
    min_index_2 = i2;
        for (int j = i1 + 1; j < number_of_elements_1; j++) {
            if (arr1[j] < arr1[min_index_1]) {
                min_index_1 = j;
            }
        }
        
        for (int j = i2 + 1; j < number_of_elements_2; j++) {
            if (arr2[j] < arr2[min_index_2]) {
                min_index_2 = j;
            }
        }
        
        if (arr1[min_index_1] < arr2[min_index_2]) {
            arr3[k] = arr1[min_index_1];
            k++;
            swap(arr1[min_index_1], arr1[i1]);
            i1++;
        }
        else {
            arr3[k] = arr2[min_index_2];
            k++;
            swap(arr2[min_index_2], arr2[i2]);
            i2++;
        }
    }
}

int main() {

int number_of_elements_1, number_of_elements_2;
//defining first array
cout << "Enter the number of elements in arr1: ";
cin >> number_of_elements_1;
int arr1[number_of_elements_1];
cout << "Enter the elements of arr1: ";
for (int i = 0; i < number_of_elements_1; i++) {
    cin >> arr1[i];
}

//defining second array
cout << "Enter the number of elements in arr2: ";
cin >> number_of_elements_2;
int arr2[number_of_elements_2];
cout << "Enter the elements of arr2: ";
for (int i = 0; i < number_of_elements_2; i++) {
    cin >> arr2[i];
}

int arr3[number_of_elements_1 + number_of_elements_2];

int max1, max2;
for (int i = 0; i < number_of_elements_1; i++) {
    if (arr1[i] > arr1[i+1]);
    max1 = i;
}
for (int i = 0; i < number_of_elements_2; i++) {
    if (arr2[i] > arr2[i+1]);
    max2 = i;
}
if (arr1[max1] > arr2[max2]) {
swap(arr1[max1], arr2[max2]);
}

merge_sort(arr1, arr2, arr3, number_of_elements_1, number_of_elements_2);

//printing arr3
cout << "Sorted Array: \n";
for (int i = 0; i < number_of_elements_1 + number_of_elements_2; i++) {
    cout << arr3[i] << " ";
}
cout << endl;

return 0;
}
