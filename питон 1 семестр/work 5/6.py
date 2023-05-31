# -- coding: utf-8 --
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