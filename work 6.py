#вариант 2
s = input('введите строку')
q = ('%')
p = ('')
w = 0
for i in range(len(s)):
    if s[i] != ':' :
        p += s[i]
    else:
        p += '%'
        w += 1
print (p, 'заменено', w ,'симбволов')