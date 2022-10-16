#include<bits/stdc++.h>
using namespace std;

void towerofHonoi(int n,char beg,char aux,char end){

    if(n==1){
        printf("Disk1 is moved from A to C\n");
        return;
    }
    towerofHonoi(n-1,beg,end,aux);
    printf("Disk%d is moved from %c to %c \n",n,beg,end);
    towerofHonoi(n-1,aux,beg,end);
}
 
int main()
{
    int n;
    cin>>n;
    towerofHonoi(n,'A','B','C');

 return 0;
}