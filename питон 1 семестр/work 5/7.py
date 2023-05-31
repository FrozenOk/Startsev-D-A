# -- coding: utf-8 --
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