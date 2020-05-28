class salary:
  def __init__(self,x):
    self.x=x
  def gettotal(self):
    self.m=x*12
    
class employee:
  def __init__(self,y):
    self.y=y
  def annual(self):
     a=salary(x)
     self.k=a.x*12+y
     print("Total: {}".format(self.k))
  
x=int(input())
y=int(input())
#a=salary(x)
z=employee(y)
z.annual()
    