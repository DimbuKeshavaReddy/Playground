class Shape:
  def square(self,s):
    print("The side of square =",self.s)
    print("Area of square =",self.s*self.s)
  def rec(self,l,b):
    #print("The length and breadth of rectangle =",l,",",b)
    print(l*b)
l=int(input())
b=int(input())
x=Shape()
#x.square(s)
x.rec(l,b)