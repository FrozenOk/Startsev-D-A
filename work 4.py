"""""""""
A =  int(input ('введите первое число'))
B =  int(input ('введите второе число'))
if A<=B:
    for i in range(A, B+1):
        print (i, end=";")
"""""""""
"""""""""
A =  int(input ('введите первое число'))
B =  int(input ('введите второе число'))
if A<B:
    for i in range(A, B+1):
        print (i, end=";")
else:
    while B < A:
        print(B)
        B += 1
    else:
            print (B)
"""""""""
"""""""""
A =  int(input ('введите первое число'))
B =  int(input ('введите второе число'))
if A>B:
    while(A%2)>0:
        print(A)
        A -= 2
        if A<=B:
            print (B)
            break
    else:
        A -= 1
        while(A%2)>0:
            print(A)
            A -= 2
            if A<=B:
                print (B)
                break
"""""""""
"""""""""
def pomogite ():
    global N, q
    for i in range (1,N+1):
        q = q + i**3

N =  int(input ('введите число N'))
q = 0
pomogite()
print(q+1)
"""""""""
"""""""""
def pomogite ():
    global N, q
    for i in range (1,N+1):
        q *= i 

N =  int(input ('введите число N'))
q = 1
pomogite()
print(q)
"""""""""
"""""""""
def pomogite ():
    global N, q, w
    for i in range (1,N+1):
        w *= i
        q += w 

N =  int(input ('введите число N'))
q = 0
w = 1
pomogite()
print(q)
"""""""""
"""""""""
def pomogite ():
    global N, q, w
    if N<=9:
        
        for i in range (2,N+1):
            w = q,i
            q = w
            print(w)
N =  int(input ('введите число N'))
q = 1
w = 1
pomogite()
"""""""""

