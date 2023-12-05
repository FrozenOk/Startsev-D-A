# -- coding: utf-8 --
def qwerty ():
    n = int(input('Введите число n для  уравнения n + n^2 + n^3 + n^4 + n^5'))
    n = n**2 + n**3 + n**4 + n**5
    print('Ответ:' + str(n))
qwerty ()