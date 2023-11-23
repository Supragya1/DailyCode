#include <iostream>

using namespace std;

int main() {
    cout << "\t\tThis program gives the sum and product of two given matrices.\n\n";
    
    //taking input for dimensions
    int arr1_row, arr1_col, arr2_row, arr2_col;
    //do {
    cout << "Enter 2 numbers to define dimensions of first array: ";
    cin >> arr1_row >> arr1_col;
    cout << "Enter 2 numbers to define dimensions of second array: ";
    cin >> arr2_row >> arr2_col; //} while (arr1_col != arr2_row);

    //initializing arrays
    int arr1[arr1_row][arr1_col], arr2[arr2_row][arr2_col], sum[arr1_col][arr1_row], mul[arr1_row][arr2_col];

    //taking input for matrices
    cout << "\nEnter " << arr1_col*arr1_row << " numbers to be entered into first matrix: \n";
    for (int i = 0; i < arr1_row; i++) {
        for (int j = 0; j < arr1_col; j++) {
            cin >> arr1[i][j];
        }
    }

    cout << "\nEnter " << arr2_col*arr2_row << " numbers to be entered into second matrix: \n";
    for (int i = 0; i < arr2_row; i++) {
        for (int j = 0; j < arr2_col; j++) {
            cin >> arr2[i][j];
        }
    }

    //displaying given arrays
    cout << "\nArray 1: \n\n";
    for (int i = 0; i < arr1_row; i++) {
        for (int j = 0; j < arr1_col; j++) {
            cout << arr1[i][j] << " ";
        }
    cout << endl;
    }

    cout << "\nArray 2: \n\n";
    for (int i = 0; i < arr2_row; i++) {
        for (int j = 0; j < arr2_col; j++) {
            cout << arr2[i][j] << " ";
        }
    cout << endl;
    }

    //addition of arrays
    if ((arr1_col == arr2_col) && (arr1_row == arr2_row)) {
        for (int i = 0; i < arr1_row; i++) {
            for (int j = 0; j < arr1_col; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
    //displaying sum
    cout << "\nThe sum of the given matrix is: \n\n";
    for (int i = 0; i < arr1_col; i++) {
        for (int j = 0; j < arr1_row; j++) {
            cout << sum[i][j] << " ";
        }
    cout << endl;
    }
    }

    else {
        cout << "\nError: The given matrices cannot be added: Dimensions of both matrices are not equal\n";
    }

    //product of matrices
    if (arr1_col == arr2_row) {
    
    //initializing mul matrix
    for (int i = 0; i < arr1_row; i++) {
        for (int j = 0; j < arr2_col; j++) {
            mul[i][j] = 0;
        }
    }
    //multiplying matrices
    for (int i = 0; i < arr1_row; i++) {
        for (int j = 0; j < arr2_col; j++) {
            for (int k = 0; k < arr1_col; k++) {
                mul[i][j] += arr1[i][k]*arr2[k][j];
            }
        }
    }
    //displaying product
    cout << "\nThe product of the given matrices is: \n\n";
    for (int i = 0; i < arr1_row; i++) {
        for (int j = 0; j < arr2_col; j++) {
            cout << mul[i][j] << " ";
        }
    cout << endl;
    }
    }
    else {
        cout << "\nError: The given matrices cannot be multiplied: column of first matrix not equal to row of second\n";
    }

    return 0;
}
