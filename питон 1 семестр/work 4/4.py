
# -- coding: utf-8 --
def pomogite ():
    global N, q
    for i in range (1,N+1):
        q = q + i**3

N =  int(input ('введите число N'))
q = 0
pomogite()
print(q+1)
