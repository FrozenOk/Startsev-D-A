# -- coding: utf-8 --
#1 вариант
import math
def treugolnik ():
    a =  int(input ('введите сторону а'))
    b =  int(input ('введите сторону b'))
    c =  int(input ('введите сторону c'))
    p=(a+b+c)/2
    s=math.sqrt (p*(p-a)*(p-b)*(p-c))
    print ('площадь треугольника', s)
    
def kvadrat ():
    a =  int(input ('введите сторону а'))
    s = a**2
    print ('площадь квадрата', s)

def pryamougolnik ():
    a =  int(input ('введите сторону а'))
    b =  int(input ('введите сторону b'))
    s = a*b
    print ('площадь прямоугольника', s)

f =  int(input ('введите тип фигуры: треугольник (1), квадрат (2), прямоугольник (3'))
if f == 1:
    treugolnik ()
if f == 2:
    kvadrat ()
if f == 3: 
    pryamougolnik ()