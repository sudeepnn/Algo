#include <iostream>
using namespace std;
class Node {
   public:
   int val;
   Node* next;
   Node(int val) {
      this->val = val;
      next = NULL;
   }
};
void solve(Node* head, int key) {
   if(head == NULL) {
      cout << "No";
   } else if(head->val == key) {
      cout << "Yes";
   } else {
      solve(head->next, key);
   }
}
int main() {
   Node* head = new Node(52);
   head->next = new Node(4651);
   head->next->next = new Node(42);
   head->next->next->next = new Node(5);
   head->next->next->next->next = new Node(12587);
   head->next->next->next->next->next = new Node(874);
   head->next->next->next->next->next->next = new Node(8);
   solve(head, 12587);
   return 0;
}
