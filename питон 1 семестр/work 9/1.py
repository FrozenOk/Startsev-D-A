# -- coding: utf-8 --
#4 вариант (да написал хрень но в целом это все таки работает)
def da():
    n = 3
    p = 4   
    x =0
    y = 0
    z = 0
    zz = float('inf')
    l = 0
    k =0
    kk = 0
    a= []
    for i in range(n):
        b = []
        for j in range (p):
            print ( 'введите [ ',i, ',',j, '] элемент' )
            x= (int(input()))
            y = y+x
            b.append (x)  
        a.append(b)
        l +=1
        if y > z:
            z = y
            k = l
        if y < zz:
            zz = y
            kk = l   
        y=0
    print (z, 'наибольшая сумма в строке', k)
    print (zz,'наименьшая сумма в строке', kk)
    for i in range (n):
        for j in range (p):
            print(a[i][j], end=' ')
        print()

da()