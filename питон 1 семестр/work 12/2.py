#блок Б номер 2
def qwerty ():
    n =  int(input ('введите число'))
    if n == 0:
        max_list = max(z)
        z.remove (max_list) 
        pre_max_list = max (z)
        print (pre_max_list, 'второй по велечине элемент')
    else:
        z.append (n)
        print (z)
        qwerty ()

z = []
max_list =0
pre_max_list = 0
qwerty ()
# это ужас часа 2 пытался решить первую задачу ничего не получилось попробовал вторую а она решается за пару минут и зачем я только потратил столько времени в пустую Т_Т