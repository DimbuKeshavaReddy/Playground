class Node:
  def __init__(self,x):
    self.data=x
    self.next=None
    self.prev=None
class dll:
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
      t.prev=temp
  def display(self):
    temp=self.head
    while(temp!=None):
      print(temp.data,end=" ")
      temp=temp.next
  def search(self,x):
    c=0
    d=0
    temp=self.head
    while(temp!=None):
      if(temp.data==x):
        print("\n{} found at location  {}".format(x,c+1))
        d+=1
        break
      c+=1  
      temp=temp.next
    if(d==0):
      print("\n{}  not found".format(x))
o=dll()      
while(1):
  n=int(input())
  if(n==-1):
    break
  o.insertatend(n)
print("Circular doubly linked list is:",end=" ")  
o.display()
s=int(input())
o.search(s)