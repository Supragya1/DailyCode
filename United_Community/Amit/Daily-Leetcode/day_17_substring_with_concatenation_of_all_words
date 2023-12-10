class Solution {
public:
    vector<int> findSubstring(string s, vector<string>& words) {
        vector<int> ans;
        int s_num = s.size();
        int words_num = words.size();
        int word_len = words[0].size();
        int total_len = words_num * word_len;

        if (s_num < total_len || words_num == 0) {
            return ans;
        }

        unordered_map<string, int> w_count;

        for (const auto& word : words) {
            w_count[word]++;
        }

        for (int i = 0; i <= s_num - total_len; i++) {
            unordered_map<string, int> c_count;
            int j = 0;

            for (; j < words_num; j++) {
                string word = s.substr(i + j * word_len, word_len);

                if (w_count[word] == 0 || c_count[word]++ >= w_count[word]) {
                    break;
                }
            }

            if (j == words_num) {
                ans.push_back(i);
            }
        }

        return ans;
    }
};

// class Solution {
// public:
//     vector<int> findSubstring(string s, vector<string>& words) {
//         int s_num = s.size();
//         unordered_map<string,int> map;
//         for(auto &word : words) map[word]++;
        
//         int words_num = words.size(), word_let = words[0].size();
//         vector<int> ans;
        
//         for(int i = 0; i < s_num - (words_num * word_let) + 1; i++){
//             unordered_map<string,int> count;
//             int j = 0;
//             for( ; j<words_num; j++){
//                 string str = s.substr(i + (j * word_let), word_let);
//                 if(map.find(str) != map.end()){
//                     count[str]++;
//                     if(count[str] > map[str]) {
//                         break;
//                     }
//                 } else{
//                     break;
//                 }
//             }
//             if (j == words_num) ans.push_back(i);
//         }
//         return ans;
//     }
// };