class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> map;
        
        for(auto s: strs){
            string word = s;
            sort(word.begin(), word.end());
            map[word].push_back(s);
        }
        vector<vector<string>> ans;
        for(auto s: map){
            ans.push_back(s.second);
        }
        return ans;
    }
};