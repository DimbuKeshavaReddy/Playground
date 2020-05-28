class Node:
  def __init__(self,x):
    self.data=x
    self.next=None
class sll:
  def __init__(self):
    self.head=None
  def display(self):
    temp=self.head
    while(temp!=None):
      print(temp.data,end=" -> ")
      temp=temp.next
    print("NULL")  
  def insertatend(self,x):
    t=Node(x)
    if(self.head==None):
      self.head=t
    else:
      temp=self.head
      while(temp.next!=None):
        temp=temp.next
      temp.next=t
  '''def insertatbegin(self,x):
    t=Node(x)
    if(self.head==None):
      self.head=t
    else:
      t.next=self.head
      self.head=t'''
  def delatbegin(self):
    if (self.head==None):
      print("List is empty")
    else:
      self.head=self.head.next
  def delatend(self):
    temp=self.head
    if(self.head.next==None):
      self.head=None
    else:
      while(temp.next.next!=None):
        temp=temp.next
      temp.next=None
  def dele(self,x):
    temp=self.head
    c=0
    while(temp.next!=None):
      if(temp.next.data==x):
        c=1
        temp.next=temp.next.next
        break
      temp=temp.next  
    if(c==0):
      print("Element not found")
l=sll()
while 1:
  n=int(input())
  if(n==1):
    x=int(input())
    l.insertatend(x)
  elif(n==2):
    l.delatbegin()
  elif(n==3):
    l.delatend()
  elif(n==4):
    x=int(input())
    l.dele(x)
  elif(n==5):
    l.display()
  elif(n==6):
    break
    
  