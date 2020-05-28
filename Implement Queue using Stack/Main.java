class Queue:
  def __init__(self):
    self.s1=[]
    self.s2=[]
  def enQueue(self,x):
    while(len(self.s1)!=0):
      self.s2.append(self.s1[-1])
      self.s1.pop()
    self.s1.append(x)
    while(len(self.s2)!=0):
      self.s1.append(self.s2[-1])
      self.s2.pop()
  def deQueue(self):
    if(len(self.s1)==0 ):
      print("Q is Empty")
    x=self.s1[-1]
    self.s1.pop()
    return x
  def display(self):
    if(len(self.s1)==0):
      print("Queue is Empty")
    else:
      print("Queue elements are: ")
      for i in range(len(self.s1)-1,-1,-1):
        print(self.s1[i],end=" ")

q=Queue()
num=int(input())
for i in range(num):
  q.enQueue(int(input()))
r=int(input())
for i in range(r):
  q.deQueue()
q.display()