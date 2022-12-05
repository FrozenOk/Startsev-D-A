
# -- coding: utf-8 --
def da():
    A =  int(input ('введите первое число'))
    B =  int(input ('введите второе число'))
    if A>B:
        while(A%2)>0:
            print(A)
            A -= 2
            if A<=B:
                print (B)
                break
        else:
            A -= 1
            while(A%2)>0:
                print(A)
                A -= 2
                if A<=B:
                    print (B)
                    break
da()