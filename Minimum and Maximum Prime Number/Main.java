class Node:
  def __init__(self,x):
    self.data=x
    self.next=None
class sll():
  def __init__(self):
    self.head=None
  def insertatbegin(self,x):
    t=Node(x)
    if (self.head==None):
      self.head=t
    else:
      t.next=self.head
      self.head=t
  def display(self):
    temp=self.head
    while(temp!=None):
      print(temp.data,end="->")
      temp=temp.next
  def isprime(self,N):
    c=0
    for i in range(1,N+1):
      if (N%i==0):
        c+=1
    return c  
  def maxmin(self):
    global max
    max=0
    temp=self.head
    while(temp.next!=None):
      if(temp.data>max):
        c=sll().isprime(temp.data)
        if(c==2):
          max=temp.data
      temp=temp.next
    if(temp.data>max):
        c=sll().isprime(temp.data)
        if(c==2):
          max=temp.data  
    return max
  def min(self):
    min=max
    temp=self.head
    while(temp.next!=None):
      if(temp.data<min):
        c=sll().isprime(temp.data)
        if(c==2):
          min=temp.data
      temp=temp.next
    if(temp.data<min):
        c=sll().isprime(temp.data)
        if(c==2):
          min=temp.data  
    return min      
l=sll()
n=int(input())
while(n!=-1):
  l.insertatbegin(n)
  n=int(input())
l.display()
M=l.maxmin()
m=l.min()
print("\nMinimum :  {}".format(m))
print("Maximum :  {}".format(M))