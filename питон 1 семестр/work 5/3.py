# -- coding: utf-8 --
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