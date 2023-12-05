# -- coding: utf-8 --
def pomogite ():
    x = 0
    n=int(input('введите число n'))
    y = 1
    z = 0
    for i in range(n):
        z += x
        j = x + y
        x = y
        y = j
    print('фибиночи говорит ',z)
pomogite()