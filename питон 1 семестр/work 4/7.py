# -- coding: utf-8 --
def pomogite ():
    n=int(input('введите число n'))
    x = 1
    y = 0
    for i in range(1, n+1):
        x = x*i
        y += x
    print(y)

pomogite()