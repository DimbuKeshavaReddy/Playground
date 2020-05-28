class Node:
  def __init__(self,x):
    self.data=x
    self.next=None
    self.prev=None
class dll:
  def __init__(self):
    self.head=None
  def insertatbegin(self,x):
    t=Node(x)
    if(self.head==None):
      self.head=t
    else:
      t.next=self.head
      self.head.prev=t
      self.head=t
  def display(self):
    temp=self.head
    while(temp!=None):
      print(temp.data,end=" ")
      temp=temp.next  
  def displayrev(self):
    temp=self.head
    while(temp.next!=None):
      temp=temp.next
    t=temp  
    while(t!=None):
      print(t.data,end=" ")
      t=t.prev

o=dll()      
while 1:
  n=int(input())
  if(n==-1):
    break
  o.insertatbegin(n)
print("Original Linked List")  
o.display() 
print("\nReversed Linked List")
o.displayrev()
    