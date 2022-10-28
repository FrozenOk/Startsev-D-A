"""""""""
#1 задание
def pomogite ():
    global N,q
    while q<=N:
        for i in range (1, N):           
            q=i**2           
            if q<=N:
                print(q)

N =  int(input ('введите число N'))
q = 0
pomogite ()
"""""""""
"""""""""
#2 задание (фига я ее за минуты 2 решил)
def pomogite ():
    global N,q
    while N>=2:
        if N%q ==0:
            print (q)
            break
        else:
            q +=1

N =  int(input ('введите число N'))
q = 2
pomogite ()
"""""""""
"""""""""
#3 задание
def pomogite ():
    global N,q,w
    while q<N:
        for i in range (1, N+1):           
            q = i           
            w *= 2
N =  int(input ('введите число N'))
q = 0
w = 1
pomogite ()
print('степень',q)
print('показатель степени двойки',w)
"""""""""
"""""""""
#4 задание
def pomogite ():
    global x,y,w
    while x<y:
        q=x*10/100
        x=x+q
        w+=1
        #print('km',x)
        #print('day',w)

x =  int(input ('введите число x'))
y =  int(input ('введите число y'))
q = 0
w = 1
pomogite ()
print(w)
"""""""""
"""""""""
#5 задание (тут вообще спидран решения)
def pomogite ():
    global N,q
    while N>0:
        N =  int(input ('введите число N'))
        q +=1
N =  1
q = 0
pomogite ()
print(q-1)
"""""""""
"""""""""
#6 задание
def pomogite ():
    global N, w,q
    while N>0:
        N =  int(input ('введите число N'))
        w = w + N
        q +=1

N =  1
w = 0
q = 0
pomogite ()
print(w/(q-1))
"""""""""
"""""""""
#7 задание
def pomogite ():
    global N,q, w,e
    while N>0:
        N =  int(input ('введите число N'))
        q = N
        if q > w:
            w = q
            e +=1
N =  1
q = 0
w = 0
e = 0
pomogite ()
print(e-1)
"""""""""
"""""""""
#8 задание
def pomogite ():
    global N, w,q,n
    while N>0:
        N =  int(input ('введите число N'))
        if N ==w:
            q +=1
        if n == N:
            q +=1
            n = 0
            w = N
        else:
            w = N
            n = 0

            
            
N = 1
n =  int(input ('введите число N'))
w = 0
q = 0
pomogite ()
print(q)
"""""""""