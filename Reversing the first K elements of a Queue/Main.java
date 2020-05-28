from queue import Queue  
def reverseQueueFirstKElements(k,Queue): 
	if (Queue.empty() == True or
			k > Queue.qsize()): 
		return
	if (k <= 0): 
		return

	Stack = [] 
	for i in range(k): 
		Stack.append(Queue.queue[0]) 
		Queue.get()
	while (len(Stack) != 0 ): 
		Queue.put(Stack[-1]) 
		Stack.pop() 
	for i in range(Queue.qsize() - k): 
		Queue.put(Queue.queue[0]) 
		Queue.get() 

def Print(Queue): 
	while (not Queue.empty()): 
		print(Queue.queue[0],end=" ") 
		Queue.get() 

if __name__ == '__main__':
    Queue = Queue()
    num=int(input())
    for i in range(num):
        Queue.put( int(input()) )
    k=int(input())
    reverseQueueFirstKElements(k,Queue)
    Print(Queue)