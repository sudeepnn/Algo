#include<bits/stdc++.h>
using namespace std;
vector<vector<int>>memo;
int lcs(string s1,string s2,int m,int n){
    // cout<<"COME BAE!"<<endl;
    if (memo[m][n] != -1)
        return memo[m][n];
    int ans;
    if (m == 0 || n == 0)
        ans = 0;

    else
    {

        if (s1[m - 1] == s2[n - 1])
            ans = 1 + lcs(s1, s2, m - 1, n - 1);
        else
            ans = max(lcs(s1, s2, m - 1, n), lcs(s1, s2, m, n - 1));
        memo[m][n] = ans;
    }
    return ans;
}
int TabularForm(string s1,string s2){
    int m=s1.size(),n=s2.size();
    int dp[m+1][n+1];
    for (int i = 0; i < m; i++)
    {
        dp[i][0]=0;
    }
    for (int i = 0; i < n; i++)
    {
        dp[0][i]=0;
    }
    for (int i = 1; i <=m; i++)
    {
        for (int j = 1; j <=n; j++)
        {
            if(s1[i-1]==s2[j-1]){
                dp[i][j]=1+dp[i-1][j-1];
            }
            else{
                dp[i][j]=max(dp[i][j-1],dp[i-1][j]);
            }
        }
        
    }
    return dp[m][n];
}
int main()
{

    string a = "abcba",
           b = "abcbcba";
           for(int i=0;i<a.size()+1;i++){
            vector<int>t;
            for(int j=0;j<b.size()+1;j++){
                t.push_back(-1);
            }
            memo.push_back(t);
           }
    cout << lcs(a, b, a.size(), b.size())<<endl;
    cout<<TabularForm(a,b);
    return 0;
}
