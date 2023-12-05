# -- coding: utf-8 --
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