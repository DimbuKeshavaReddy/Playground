from collections import deque 
def getIndex(s, i): 
	if s[i] != '[': 
		return -1
	d = deque() 
	for k in range(i, len(s)): 
		if s[k] == ']': 
			d.popleft() 
		if s[k] == '[': 
			d.append(s[i]) 
		if not d: 
			return k 
	return -1
def test(s, i): 
	matching_index = getIndex(s, i) 
	print("Closing bracket at index : "+ str(matching_index)) 
def main():
	expression=input()
	index=int(input())
	test(expression,index)
if __name__ == "__main__": 
	main() 