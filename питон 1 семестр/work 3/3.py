
# -- coding: utf-8 --
def jopa(min):
    if min>=1440:
        print('слишком много давай поменьше')
    else:
        print (str((min//60)%24) + ' часов')
        print (str(min%60) + ' минут')

min = int(input('введите минуты'))
jopa (min)