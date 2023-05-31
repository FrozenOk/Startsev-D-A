# -- coding: utf-8 --
def pomogite ():
    global N,q
    while N>0:
        N =  int(input ('введите число N'))
        q +=1
N =  1
q = 0
pomogite ()
print(q-1)