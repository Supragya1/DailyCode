class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& v) {
        
        vector<int>result;

        int i = 0, j = 0;
        int rows = v.size();
        int cols = v[0].size();

        vector<vector<int>> visit(rows + 1, vector<int>(cols + 1, 0));

        while (result.size() != (rows * cols)){
            while(j < cols) {
                if(visit[i][j]){
                    break;
                }
                visit[i][j]=1;
                result.push_back(v[i][j]);
                j++;
            }
            i++;
            j--;

            while(i < rows){
                if(visit[i][j]){
                    break;
                }
                visit[i][j]=1;
                result.push_back(v[i][j]);
                i++;
            }
            j--;
            i--;

            while(j >= 0){
                if(visit[i][j]){
                    break;
                }

                visit[i][j]=1;
                result.push_back(v[i][j]);
                j--;
            }
            i--;
            j++;

            while(i >= 0){
                if(visit[i][j]){
                    break;
                }

                visit[i][j]=1;
                result.push_back(v[i][j]);
                i--;
            }
            j++;
            i++;
        }
        return result;
    }
};