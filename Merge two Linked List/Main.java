class Node:
  def __init__(self,data):
    self.data=data
    self.next=None
    
class Linkedlist:
  def __init__(self):
    self.head=None
    self.last_node=None
  def push(self,data):
    if self.last_node is None:
      self.head= Node(data)
      self.last_node= self.head
    else:
      self.last_node.next= Node(data)
      self.last_node= self.last_node.next
  def printList(self):
      temp= self.head
      while(temp):
        print(temp.data,end="->")
        temp=temp.next
        
def mergeLists(head1,head2):
    temp=None
    if head1 is None:
      return head2
    if head2 is None:
      return head1
    if head1.data<=head2.data:
      temp=head1
      temp.next= mergeLists(head1.next,head2)
    else:
        temp=head2
        temp.next= mergeLists(head1,head2.next)
    return temp
    
  
list1=Linkedlist()
list2= Linkedlist()
list3= Linkedlist()
n=int(input())
for i in range(n):
  d=int(input())
  list1.push(d)
print("List1:")
list1.printList()
for i in range(n):
  d=int(input())
  list2.push(d)
print("\nList2:")
list2.printList()
list3.head=mergeLists(list1.head,list2.head)
print("\nMerged Linked List:",end=" ")
list3.printList()
