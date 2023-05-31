# -- coding: utf-8 --
#4 вариант (да написал хрень но в целом это все таки работает)
def da():
    n = 2
    p = 2   
    x =0
    y = 0
    z = 0
    zz = float('inf')
    l = 0
    k =0
    kk = 0
    a= []
    vvod = open('D:\\sosiska\\Startsev-D-A\\work 10\\vvod.json', 'r', encoding = 'utf-8')
    
    for line in vvod:
        a.append([int(x) for x in line.split()])
        
    
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
    x= (int(input()))
    y = y+x
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