class Abc:
  def __init__(self):
    self.s=""
  def put(self,x):
    self.s=x
  def get(self):
    print("The method that the string accepted is:")
    print(self.s)
    
x=input()
a=Abc()
a.put(x)
a.get()