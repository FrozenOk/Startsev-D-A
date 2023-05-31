
# -- coding: utf-8 --
#1вариант
def su():
    N = int(input('введите длину массива'))
    a = []
    q = 0
    for i in range(N):
        print('введите', i, 'число массива')
        a.append (int(input()))
        if a[i] > q:
            q = a[i]
    print ('исходный массив', a)
    print ('наибольшее число', q)
    a.reverse()
    print ('ваш массив в обратном порядке', a)
su()