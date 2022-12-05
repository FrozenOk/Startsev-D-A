# -- coding: utf-8 --
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