class Solution {
public:
    string countAndSay(int n) {
        vector<string> result;
        string s = "";
        result.push_back(s);

        for (int i = 1; i <= n; i++) {
            s = result[i - 1];
            if (s == "") {
                result.push_back("1");
            } else {
                string new_res = "";
                int count = 1;

                for (int j = 0; j < s.size() - 1; j++) {
                    if (s[j + 1] == s[j]) {
                        count++;
                    } else {
                        new_res += (count + '0');
                        new_res += s[j];
                        count = 1;
                    }
                }

                new_res += (count + '0');
                new_res += s[s.size() - 1];
                result.push_back(new_res);
            }
        }
        return result[n];
    }
};
