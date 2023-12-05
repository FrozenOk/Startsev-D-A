# -- coding: utf-8 --
def qwerty ():

    age = int(input ('сколько вам лет?'))
    name = input ('Введите ваше имя')
    if name== 'Иван' or name== 'иван' or name== 'Ivan' or name== 'ivan' or name== 'Ваня' or name== 'ваня' :
        print ('Вани нам не нужны!')
    else:
        if age >= 75:
            print ('Ну ты и старье')
        else:
            if age < 16:
                let = 16-age  
        #тут я просто сделал условие чтоб нормально чиьалось года или лет 
                if let <5: 
                    print ('Сначала нужно окончить школу! Приходите через ' + str(let) + ' года' )       
                else: 
                    print ('Сначала нужно окончить школу! Приходите через ' + str(let) + ' лет' )
            else:
                print ('Поздравляем вы поступили в ВГУИТ')


qwerty ()