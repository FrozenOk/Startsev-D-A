# -- coding: utf-8 --
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