
def areParanthesisBalanced(expr) :
    n=len(expr)
    if n == 0:
        return True
    if n == 1:
        return False
    if expr[0] == ')' or expr[0] == '}' or expr[0] == ']':
        return False
        
    s = [];
    
    
    for i in range(len(expr)) :
        
        if (expr[i] == '(' or expr[i] == '[' or expr[i] == '{') :
            s.append(expr[i]);
            continue;
    
        if (len(s) == 0):
            return False;
        if expr[i] == ')' :
            x = s.pop()
            if (x == '{' or x == '[') :
                return False;
        elif expr[i] == '}':
            x = s.pop();
            if (x == '(' or x == '[') :
                return False;
        elif  expr[i] == ']':
            x = s.pop();
            #print(x,expr[i])
            if (x =='(' or x == '{') :
                return False;
    
    if len(s) :
        return False
    else :
        return True


expr = input(); 

if (areParanthesisBalanced(expr)) : 
	print("Balanced"); 
else : 
	print("Not Balanced"); 


