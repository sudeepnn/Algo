#include <stdio.h>  
#include<string.h>  
int main()  
{  
   char str1[20];  // declaration of char array  
   char str2[20];  // declaration of char array  
   int value; // declaration of integer variable  
   printf("Enter the first string : ");  
   scanf("%s",str1);  
   printf("Enter the second string : ");  
   scanf("%s",str2);  
   // comparing both the strings using strcmp() function  
   value=strcmp(str1,str2);  
   if(value==0)  
   printf("strings are same");  
   else  
   printf("strings are not same");  
   return 0;  
}  
