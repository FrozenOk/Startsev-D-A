
print  ('"Курс Основы программирования начался"')

print ( 16823 * 12302 / 3092 % 1)

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


seconds = int(input('введите секунды'))
days = seconds//86400
print (str(days) + ' дней')
hours = (seconds//3600)%24
print (str(hours) + ' часов')
min = (seconds//60)%60
print (str(min) + ' минут')
sec = seconds%60
print (str(sec) + ' секунд')

n = int(input('Введите число n для  уравнения n + n^2 + n^3 + n^4 + n^5'))
n = n**2 + n**3 + n**4 + n**5
print('Ответ:' + str(n))

y = int(input('Введите значение y'))
x = int(input('Введите значение X'))
r = x
t = y
x = t
y = r
print('бам теперь Y=' + str(y) + ' а X=' + str(x))

number = float(input('Введите число'))
if number %2 == 0:
    print('Число четное')
else:
    print('Число не четное!!!!')
