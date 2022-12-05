# -- coding: utf-8 --
#блок А номер 1
def qwerty (n,f,g,x):
    if f <= 1:
        print (x**n/g)
    else:
        g=g*(f-1)
        f -=1
        qwerty (n,f,g,x)
    
n = 5 #число n
x = 3 #число x
g = n
f = n
qwerty (n,f,g,x)