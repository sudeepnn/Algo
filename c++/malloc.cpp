#include <iostream>  
using namespace std;  
int main()  
{  
 int *ptr;  // integer pointer variable declaration  
 ptr=new int; // allocating memory to the pointer variable ptr.  
 std::cout << "Enter the number : " << std::endl;  
 std::cin >>*ptr;  
 std::cout << "Entered number is " <<*ptr<< std::endl;  
return 0;  
}  
