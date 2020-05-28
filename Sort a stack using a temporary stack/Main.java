def sortStack ( stack ): 
	tmpStack = createStack() 
	while(isEmpty(stack) == False): 
		tmp = top(stack) 
		pop(stack) 

		
		while(isEmpty(tmpStack) == False and
			int(top(tmpStack)) > int(tmp)): 
			
			
			push(stack,top(tmpStack)) 
			pop(tmpStack) 

		push(tmpStack,tmp) 
	
	return tmpStack 


def createStack(): 
	stack = [] 
	return stack 


def isEmpty( stack ): 
	return len(stack) == 0


def push( stack, item ): 
	stack.append( item ) 


def top( stack ): 
	p = len(stack) 
	return stack[p-1] 


def pop( stack ): 

	
	if(isEmpty( stack )): 
		print("Stack Underflow ") 
		exit(1) 

	return stack.pop() 

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
print("Sorted numbers are: ") 
sortedst = sortStack ( stack ) 
prints(sortedst) 


