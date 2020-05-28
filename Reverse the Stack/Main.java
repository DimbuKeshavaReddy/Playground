def insertAtBottom(stack, item): 
	if isEmpty(stack): 
		push(stack, item) 
	else: 
		temp = pop(stack) 
		insertAtBottom(stack, item) 
		push(stack, temp) 
def reverse(stack): 
	if not isEmpty(stack): 
		temp = pop(stack) 
		reverse(stack) 
		insertAtBottom(stack, temp) 
def createStack(): 
	stack = [] 
	return stack 
def isEmpty( stack ): 
	return len(stack) == 0

# Function to push an 
# item to stack 
def push( stack, item ): 
	stack.append( item ) 

# Function to pop an 
# item from stack 
def pop( stack ): 

	if(isEmpty( stack )): 
		print("Stack Underflow ") 
		exit(1) 

	return stack.pop() 
# Function to print the stack 
def prints(stack): 
	for i in range(len(stack)-1, -1, -1): 
		print(stack[i], end = ' ') 
	print() 
stack = createStack() 
while True:
  x=int(input())
  if x!=-1:
    push(stack,x)
  else:
    break
print("Original Stack ") 
prints(stack) 
reverse(stack) 
print("Reversed Stack ") 
prints(stack) 

