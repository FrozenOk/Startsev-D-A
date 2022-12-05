# -- coding: utf-8 --
def qwerty ():
    seconds = int(input('введите секунды'))
    days = seconds//86400
    print (str(days) + ' дней')
    hours = (seconds//3600)%24
    print (str(hours) + ' часов')
    min = (seconds//60)%60
    print (str(min) + ' минут')
    sec = seconds%60
    print (str(sec) + ' секунд')

qwerty ()