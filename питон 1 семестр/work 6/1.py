# -- coding: utf-8 --
# #вариант 2
def pomogite ():
    q = ('%')
    p = ('')
    w = 0
    s = input('введите строку')
    for i in range(len(s)):
        if s[i] != ':' :
            p += s[i]
        else:
            p += '%'
            w += 1
    print (p, 'заменено', w ,'симбволов')



pomogite ()