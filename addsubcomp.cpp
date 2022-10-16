#include<iostream.h>
#include<conio.h>
#include<math.h>

struct complex
{
float rel;
float img;
}s1,s2;

void main()
{
clrscr();
float a,b;
cout<<“Enter real and imaginary part of 1st complex number:”;
cin>>s1.rel>>s1.img;
cout<<“Enter real and imaginary part of 2nd complex number:”;
cin>>s2.rel>>s2.img;
//Addition
a=(s1.rel)+(s2.rel);
b=(s1.img)+(s2.img);
cout<<“nAddition: “<<“(“<<a<<“)”<<“+”<<“(“<<b<<“)”<<“i”;

//Subtraction
a=(s1.rel)-(s2.rel);
b=(s1.img)-(s2.img);
cout<<“nSubtraction: “<<“(“<<a<<“)”<<“+”<<“(“<<b<<“)”<<“i”;

//Multiplication
a=((s1.rel)*(s2.rel))-((s1.img)*(s2.img));
b=((s1.rel)*(s2.img))+((s2.rel)*(s1.img));
cout<<“nMultiplication: “<<“(“<<a<<“)”<<“+”<<“(“<<b<<“)”<<“i”;
//Division
a=(((s1.rel)*(s2.rel))+((s1.img)*(s2.img)))/(pow(s2.rel,2)+pow(s2.img,2));
b=(((s2.rel)*(s1.img))-((s1.rel)*(s2.img)))/(pow(s2.rel,2)+pow(s2.img,2));
cout<<“nDivision: “<<“(“<<a<<“)”<<“+”<<“(“<<b<<“)”<<“i”;

getch();
}
