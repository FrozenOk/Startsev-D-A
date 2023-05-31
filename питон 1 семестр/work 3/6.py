# -- coding: utf-8 --
#я знаю на сколько я бредовым путем это решил но мне самому было интересно смогу ли я ее решить таким не стандартным методом(лучше не пытайтесь понять как это работает)
def doska():
    beloe = 2
    chernoe = 1,4
    xxx =  int(input ('введите координату x для первой доски'))
    yyy =  int(input ('введите координату y для первой доски'))
    xxx1 =  int(input ('введите координату x для второй доски'))
    yyy1 =  int(input ('введите координату y для второй доски'))
    if xxx == 1 or xxx == 3 or xxx == 5 or xxx == 7:
        xx = 1
    if xxx == 2 or xxx == 4 or xxx == 6 or xxx == 8:
        xx = 2
    if xxx > 8:
        print ('ты дэбил?')
    if yyy == 1 or yyy == 3 or yyy == 5 or yyy == 7:
        yy = 1
    if yyy == 2 or yyy == 4 or yyy == 6 or yyy == 8:
        yy = 2
    if yyy > 8:
        print ('ты дэбил?')
    if xxx1 == 1 or xxx1 == 3 or xxx1 == 5 or xxx1 == 7:
        xx1 = 1
    if xxx1 == 2 or xxx1 == 4 or xxx1 == 6 or xxx1 == 8:
        xx1 = 2
    if xxx1 > 8:
        print ('ты дэбил?')
    if yyy1 == 1 or yyy1 == 3 or yyy1 == 5 or yyy1 == 7:
        yy1 = 1
    if yyy1 == 2 or yyy1 == 4 or yyy1 == 6 or yyy1 == 8:
        yy1 = 2
    if yyy1 > 8:
        print ('ты дэбил?')
    x = xx*yy
    y = xx1*yy1

    if x == 1 or x == 4:
        print('первый квадратик черный')
    else:
        print('первый квадратик белый')
    if y == 1 or y == 4:
        print('второй квадратик черный')
    else:
        print('второй квадратик белый')
    if x == y:
        print ('квадраты одинаковые')
    else:
        print ('квадраты не одинаковые')
doska()