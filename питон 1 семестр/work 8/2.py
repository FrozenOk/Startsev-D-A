# -- coding: utf-8 --
#1 вариант\
def da():
    for o in range(3):
        a = []
        q = 0
        s = 0
        for i in range(5):
            print('введите', i, 'число массива', o)
            a.append (int(input()))
        for i in range(5):
            q += a[i]
        s = q/5
        print ('исходный массив №',o, a)   
        print ('среднее всех его чисел', s)  
        print ('ссума всех его чисел', q)

da()