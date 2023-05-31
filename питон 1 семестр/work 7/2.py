# -- coding: utf-8 --
#1вариант
def su():
    N = int(input('введите длину массива'))
    a = []
    q = 0
    for i in range(N):
        print('введите', i, 'число массива')
        a.append (int(input()))
    for i in range(N):
        q += a[i]
    q = q/N
    print ('исходный массив', a)   
    print ('среднее всех чисел', q)  
    
    for i in range(N):
        if a[i] == 0:
            a[i] = q
    print ('новый массив', a) 
su()