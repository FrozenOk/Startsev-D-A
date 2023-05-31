# -- coding: utf-8 --
def da():
    y = int(input('Введите год'))
    if y % 4 != 0:
        print('нет')
    elif y % 100 == 0:
        if y % 400 == 0:
            print('да')
        else:
            print('нет')
    else:
        print('да')
da()