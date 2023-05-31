# -- coding: utf-8 --
def pomogite ():
    global x,y,w
    while x<y:
        q=x*10/100
        x=x+q
        w+=1
        #print('km',x)
        #print('day',w)

x =  int(input ('введите число x'))
y =  int(input ('введите число y'))
q = 0
w = 1
pomogite ()
print(w)