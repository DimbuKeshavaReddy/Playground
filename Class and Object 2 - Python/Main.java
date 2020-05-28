class Shape:
  def square(self,s):
    print("The side of square =",s)
    print("Area of square =",s*s)
  def rec(self,l,b):
    print("The length and breadth of rectangle =",l,",",b)
    print("Area of rectangle =",l*b)


s=int(input())
l=int(input())
b=int(input())
x=Shape()
x.square(s)
x.rec(l,b)