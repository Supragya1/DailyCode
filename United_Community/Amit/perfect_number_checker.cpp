#include <iostream>

using namespace std;

bool isPerfectNumber(long long n) {
  if(n==1) return 0;
  long sum = 1;

  for (int i = 2; i <=sqrt(n); i++) {
    if (n % i == 0) {
      sum += i;
      if (i != n/i) {
        sum += n / i;
      }
    }
  }

  return sum == n;
}

int main() {
  int n;
  cout << "Enter a number: ";
  cin >> n;

  if (isPerfectNumber(n)) {
    cout << n << " is a perfect number." << endl;
  } else {
    cout << n << " is not a perfect number." << endl;
  }

  return 0;
}