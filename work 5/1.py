# -- coding: utf-8 --
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