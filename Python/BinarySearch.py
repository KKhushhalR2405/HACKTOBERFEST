def BinarySearch(l,x,a,b):
   
    mid=(a+b)//2
        
    if l[mid]==x:
        return mid
    
    elif x<l[mid]:
        b=l[mid]-1
        return BinarySearch(l,x,a,b)
    elif x>l[mid]:
        a=l[mid]+1
        return BinarySearch(l,x,a,b)
    else:
        return False
l=list(map(int,input().split('')))
x=int(input())
a=0
b=len(l)-1
o= BinarySearch(l,x,a,b)
print(o)
