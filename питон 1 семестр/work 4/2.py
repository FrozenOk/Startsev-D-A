
# -- coding: utf-8 --
def da():
    A =  int(input ('введите первое число'))
    B =  int(input ('введите второе число'))
    if A<B:
        for i in range(A, B+1):
            print (i, end=";")
    else:
        while B < A:
            print(B)
            B += 1
        else:
                print (B)
da()