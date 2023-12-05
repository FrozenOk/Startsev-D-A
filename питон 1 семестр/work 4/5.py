
# -- coding: utf-8 --
def pomogite ():
    global N, q
    for i in range (1,N+1):
        q *= i 

N =  int(input ('введите число N'))
q = 1
pomogite()
print(q)