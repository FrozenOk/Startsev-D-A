# -- coding: utf-8 --
def da():
    q = 1
    x = int(input('первое число'))
    y = int(input('второе число'))
    z = int(input('третье число'))
    if x == y or x == z or y == z:
        q+=1
    if x == y == z:
        q+=1
    if q == 1:
        print('0, нет совтпавших чисел')
    if q == 2:
        print('2, два числа совпали')
    if q == 3:
        print('3, все числа совпали')
    
da()