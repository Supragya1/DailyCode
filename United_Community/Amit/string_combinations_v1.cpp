#include <iostream>

void swap(char &n1, char &n2) {
    char temp;
    temp = n1;
    n1 = n2;
    n2 = temp;
}

void get_comb(std::string& input, std::string& current, bool used[]) {

    if (current.length() == input.length()) {
        std::cout << current << std::endl;
        return;
    }

    for (int i = 0; i < input.length(); ++i) {
        if (used[i] || (i > 0 && input[i] == input[i-1] && !used[i-1])) {
            continue;
        }

        current.push_back(input[i]);
        used[i] = true;

        get_comb(input, current, used);

        current.pop_back();
        used[i] = false;
    }
}

void print_comb(std::string& input) {
    std::string current;
    bool used[input.length()] = { false };

    for (int i = 0; i < input.length(); i++) {
        for (int j = i+1; j < input.length(); ++j) {
            if (input[i] > input[j]) {
                swap(input[i], input[j]);
            }
        }
    }
    get_comb(input, current, used);
}

int main() {
    std::string input;
    std::cout << "Enter a string: ";
    std::cin >> input;

    std::cout << "All possible combinations without repetition:" << std::endl;
    print_comb(input);

    return 0;
}