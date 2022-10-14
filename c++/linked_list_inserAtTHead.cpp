#include<bits/stdc++.h>
using namespace std;

class node{
  public:
  int data;
  node* next;
  node(int val){
    data=val;
    next=NULL;
  }
};

void insertAtHead(node* &head,int val){

  node* c=new node(val);
  if(head==NULL){
    head=c;
    return;
  }
  node *temp=c;
  temp->next=head;
  head=temp;
}

void display(node* head){
  node* temp=head;
  while(temp!=NULL){
    cout<<temp->data<<"-->";
    temp=temp->next;
  }
  cout<<"NULL";
}

bool search(node* head,int key){
  node* temp=head;
  while(temp!=NULL){
    if(temp->data==key){
      return true;
    }
    temp=temp->next;
  }
  return false;
}

void deleteAtHead(node* &head){
  node* todelete=head;
  head=head->next;
  delete todelete;
}

void deletion(node* &head,int val){

  if(head==NULL){
    return;
  }
  if(head->next==NULL){
    cout<<"head deleted"<<endl;
    delete head;
  }
  node* temp=head;
  while(temp->next->data!=val){
    temp=temp->next;
  }
  node* todelete=temp->next;
  temp->next=temp->next->next;
  delete todelete;
}
 
int main()
{
    node* head=NULL;
    insertAtHead(head,1);
    // insertAtHead(head,2);
    // insertAtHead(head,3);
    // deletion(head,2);
    deletion(head,1);
    display(head);
    cout<<endl;
    // cout<<search(head,4)<<endl;

 return 0;
}