
# -- coding: utf-8 --
def naimenshee(q,w,e):
    if e>q<w:
        print(str(q) + ' наименьшее число')
    if w>e<q:
        print(str(e) + ' наименьшее число')
    if q>w<e:
        print(str(w) + ' наименьшее число')
    
q =  int(input ('введите первое число'))
w =  int(input ('введите второе число'))
e =  int(input ('введите третье число'))
naimenshee(q,w,e)