class List:
  def __init__(self,x,y):
    self.x=x
    self.y=y
  def add(self):
    print("Result: ",self.x+self.y)
  def sub(self):
     print("Result: ",self.x-self.y)
  def mul(self):
    print("Result: ",self.x*self.y)
  def div(self):
     print("Result: ",self.x/self.y)
  
x=int(input())
y=int(input())
a=List(x,y)
while(1):
  print("0. Exit\n1. Add\n2. Subtraction\n3. Multiplication\n4. Division")
  print("Enter choice:")
  n=int(input())
  if n==1:
    a.add()
  elif n==2:
    a.sub()
  elif n==3:
    a.mul()
  elif n==4:
    a.div()
  else:
    print("Exiting!")
    break
    