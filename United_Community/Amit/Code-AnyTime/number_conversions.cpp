#include <iostream>
using namespace std;

string reverse(string &str) {
  int n = str.length();
  for (int i = 0; i < n / 2; i++) {
    swap(str[i], str[n - i - 1]);
  }
  return str;
}

int binary_decimal(int n) {
  int num = n;
  int dec_value = 0;
  int base = 1;
  while (num != 0) {
    int rem = num % 10;
    dec_value += rem * base;
    num /= 10;
    base *= 2;
  }
  return dec_value;
}

int decimal_binary(int n) {
  int binary_number = 0;
  int rem, i = 1;
  while (n != 0) {
    rem = n % 2;
    n /= 2;
    binary_number += rem * i;
    i *= 10;
  }
  return binary_number;
}

int octal_decimal(int n) {
  int decimal_number = 0;
  int base = 1;
  while (n > 0) {
    decimal_number += (n % 10) * base;
    base *= 8;
    n /= 10;
  }
  return decimal_number;
}

int decimal_octal(int n) {
  int octal_number = 0;
  int rem, i = 1;
  while (n != 0) {
    rem = n % 8;
    n /= 8;
    octal_number += rem * i;
    i *= 10;
  }
  return octal_number;
}

int hexadecimal_decimal(string n) {
  int decimal_number = 0;
  int base = 1;
  for (int i = n.length() - 1; i >= 0; i--) {
    int digit = n[i] - '0';
    if (digit > 9) {
      digit -= 7;
    }
    decimal_number += digit * base;
    base *= 16;
  }
  return decimal_number;
}

string decimal_hexadecimal(int n) {
  string hexadecimal_number = "";
  char hex_digits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
  while (n != 0) {
    int rem = n % 16;
    n /= 16;
    hexadecimal_number += hex_digits[rem];
  }
  reverse(hexadecimal_number);
  return hexadecimal_number;
}

int binary_octal(int n) {
  int decimal_number = binary_decimal(n);
  int octal_number = decimal_octal(decimal_number);
  return octal_number;
}

int octal_binary(int n) {
  int decimal_number = octal_decimal(n);
  int binary_number = decimal_binary(decimal_number);
  return binary_number;
}

int hexadecimal_octal(string n) {
  int decimal_number = hexadecimal_decimal(n);
  int octal_number = decimal_octal(decimal_number);
  return octal_number;
}

string binary_hexadecimal(int n) {
  int decimal_number = binary_decimal(n);
  string hexadecimal_number = decimal_hexadecimal(decimal_number);
  return hexadecimal_number;
}

string octal_hexadecimal(int n) {
  int decimal_number = octal_decimal(n);
  string hexadecimal_number = decimal_hexadecimal(decimal_number);
  return hexadecimal_number;
}

std::string hexadecimal_binary(const std::string& hex_number) {
  std::string binary_string = "";
  for (char hex_digit : hex_number) {
    switch (hex_digit) {
      case '0':
        binary_string += "0000";
        break;
      case '1':
        binary_string += "0001";
        break;
      case '2':
        binary_string += "0010";
        break;
      case '3':
        binary_string += "0011";
        break;
      case '4':
        binary_string += "0100";
        break;
      case '5':
        binary_string += "0101";
        break;
      case '6':
        binary_string += "0110";
        break;
      case '7':
        binary_string += "0111";
        break;
      case '8':
        binary_string += "1000";
        break;
      case '9':
        binary_string += "1001";
        break;
      case 'a':
      case 'A':
        binary_string += "1010";
        break;
      case 'b':
      case 'B':
        binary_string += "1011";
        break;
      case 'c':
      case 'C':
        binary_string += "1100";
        break;
      case 'd':
      case 'D':
        binary_string += "1101";
        break;
      case 'e':
      case 'E':
        binary_string += "1110";
        break;
      case 'f':
      case 'F':
        binary_string += "1111";
        break;
      default:
        cout << "Invalid input!";
    }
  }
  return binary_string;
}


void displayMenu() {
  cout << "1. Binary to decimal" << endl;
  cout << "2. Decimal to binary" << endl;
  cout << "3. Octal to decimal" << endl;
  cout << "4. Decimal to octal" << endl;
  cout << "5. Hexadecimal to decimal" << endl;
  cout << "6. Decimal to hexadecimal" << endl;
  cout << "7. Binary to octal" << endl;
  cout << "8. Octal to binary" << endl;
  cout << "9. Hexadecimal to octal" << endl;
  cout << "10. Octal to hexadecimal" << endl;
  cout << "11. Binary to hexadecimal" << endl;
  cout << "12. Hexadecimal to binary" << endl;
  cout << "13. Exit" << endl;
  cout << "Enter your choice: ";
  //binary to hex
  //hexa to binary
}

int main() {
  int choice, number;
  string hexadecimal_number;

  while (true) {
    displayMenu();
    cin >> choice;

    switch (choice) {
      case 1:
        cout << "Enter a binary number: ";
        cin >> number;
        cout << "The decimal equivalent of the binary number is: " << binary_decimal(number) << endl;
        break;
      case 2:
        cout << "Enter a decimal number: ";
        cin >> number;
        cout << "The binary equivalent of the decimal number is: " << decimal_binary(number) << endl;
        break;
      case 3:
        cout << "Enter an octal number: ";
        cin >> number;
        cout << "The decimal equivalent of the octal number is: " << octal_decimal(number) << endl;
        break;
      case 4:
        cout << "Enter a decimal number: ";
        cin >> number;
        cout << "The octal equivalent of the decimal number is: " << decimal_octal(number) << endl;
        break;
      case 5:
        cout << "Enter a hexadecimal number: ";
        cin >> hexadecimal_number;
        cout << "The decimal equivalent of the hexadecimal number is: " << hexadecimal_decimal(hexadecimal_number) << endl;
        break;
      case 6:
        cout << "Enter a decimal number: ";
        cin >> number;
        cout << "The hexadecimal equivalent of the decimal number is: " << decimal_hexadecimal(number) << endl;
        break;
      case 7:
        cout << "Enter a binary number: ";
        cin >> number;
        cout << "The octal equivalent of the binary number is: " << binary_octal(number) << endl;
        break;
      case 8:
        cout << "Enter an octal number: ";
        cin >> number;
        cout << "The binary equivalent of the octal number is: " << octal_binary(number) << endl;
        break;
      case 9:
        cout << "Enter a hexadecimal number: ";
        cin >> hexadecimal_number;
        cout << "The octal equivalent of the hexadecimal number is: " << hexadecimal_octal(hexadecimal_number) << endl;
        break;
      case 10:
        cout << "Enter an octal number: ";
        cin >> number;
        cout << "The hexadecimal equivalent of the octal number is: " << octal_hexadecimal(number) << endl;
        break;
      case 11:
        cout << "Enter an binary number: ";
        cin >> number;
        cout << "The hexadecimal equivalent of the octal number is: " << binary_hexadecimal(number) << endl;
        break;
      case 12:
        cout << "Enter an hexadecimal number: ";
        cin >> hexadecimal_number;
        cout << "The binary equivalent of the octal number is: " << hexadecimal_binary(hexadecimal_number) << endl;
        break;
      case 13:
        exit(0);
      default:
        cout << "Invalid choice!" << endl;
        //throw invalid_argument("Invalid choice!");
        
    }
  }

  return 0;
}
