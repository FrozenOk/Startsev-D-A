# -- coding: utf-8 --
#4 вариант (да написал хрень но в целом это все таки работает)
def da():
    n = 4  
    x =0
    a= []
    vvod = open('D:\\sosiska\\Startsev-D-A\\work 10\\vvod.json', 'r', encoding = 'utf-8')
    
    for line in vvod:
        a.append([int(x) for x in line.split()])
        file.close()
    
    for i in range(n):
        mx = []
        mn = []
    for i in range(n):
        mn.append(min(a[i]))
        mx.append(max(a[i]))
    str(mn)
    str(mx)
    file = open('D:\\sosiska\\Startsev-D-A\\work 10\\vivod.json', 'w')
    file.write(str(mn))
    file.write(str(mx))
    file.close()
    print ()
    print ('элементы нижней треугольной матрицы')
    for i in range (n):
        for j in range (n):
            if i>j:
                print(a[i][j], end=' ')
    print()
da()
    