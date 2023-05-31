# -- coding: utf-8 --
#4 вариант (да написал хрень но в целом это все таки работает)
def da():
    n = 4  
    x =0
    a= []
    for i in range(n):
        b = []
        for j in range (n):
            print ( 'введите [ ',i, ',',j, '] элемент' )
            x= (int(input()))
            if x<0:
                x = 0
            else:
                x = 1
            b.append (x)  
        a.append(b)


    for i in range (n):
        print()
        for j in range (n):
            print(a[i][j], end=' ')
    print ()
    print ('элементы нижней треугольной матрицы')
    for i in range (n):
        for j in range (n):
            if i>j:
                print(a[i][j], end=' ')
    print()
da()
    