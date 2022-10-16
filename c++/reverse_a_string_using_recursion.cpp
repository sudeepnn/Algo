#include <bits/stdc++.h>
using namespace std;

void reverse(string s)
{
    if (s.length() == 0)
    {
        return;
    }
    string yo = s.substr(1);
    reverse(yo);
    cout << s[0];
}

int main()
{
    reverse("Binod");

    return 0;
}