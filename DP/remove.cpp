#include<iostream>
#include<vector>
#include<string>

using namespace std;

int main(){
    int n;
    cin >> n;
    vector<int> dp(n + 1, 1e9);
    dp[0] = 0;
    for(int i = 1; i <= n; i++){
        string s = to_string(i);
        for(char c : s){
            int d = c - '0';
            if(d != 0){
                dp[i] = min(dp[i], dp[i - d] + 1);
            }
        }
    }
    cout << dp[n] << endl;
    return 0;
}
