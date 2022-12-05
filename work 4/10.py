# -- coding: utf-8 --
def pomogite (n):
    x = 0
    y = 1
    z = 0
    for i in range(n):
        z += x
        j = x + y
        x = y
        y = j
    return y
n1=int(input('введите число n'))
n2=int(input('введите число k'))
print('фибиночи говорит ',pomogite(n1) - pomogite(n2))