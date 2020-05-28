class Node:
  def __init__(self,x):
    self.data=x
    self.next=None
class sll:
  def __init__(self):
    self.head=None
  def insertatend(self,x):
    t=Node(x)
    if(self.head==None):
      self.head=t
    else:
      temp=self.head
      while(temp.next!=None):
        temp=temp.next
      temp.next=t
  def display(self):
    temp=self.head

    while(temp!=None):
      print(temp.data,end=" ")
      temp=temp.next
  def rotate(self):
    t=self.head
    self.head=t.next
    temp=self.head
    while (temp.next!=None):
      temp=temp.next
    temp.next=t
    t.next=None

l=sll()
n=int(input())
while(n!=-1):
  l.insertatend(n)
  n=int(input())
print("Given linked list:")
l.display()
N=int(input())
for i in range(N):
  l.rotate()
print("\nRotated Linked list:")  
l.display()
