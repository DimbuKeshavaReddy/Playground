class List:
  def __init__(self):
    self.a=[]
  def add(self,x):
    self.a.append(x)
  def delete(self,x):
    print("Enter number to remove:",end=" ")
    self.a.remove(x)
  def display(self):
      print("List: ",end=" ")
      print(self.a)
    
a=List()
while(1):
  print("0. Exit\n1. Add\n2. Delete\n3. Display")
  n=int(input())
  if n==1:
    print("Enter number to append:",end=" ")
    x=int(input())
    a.add(x)
    a.display()
  elif n==2:
    x=int(input())
    a.delete(x)
    a.display()
  elif n==3:
    a.display()
  else:
    print("Exiting!")
    break
    