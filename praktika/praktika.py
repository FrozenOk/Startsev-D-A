import json
import numpy as np
import datetime
import pathlib
from tkinter import *
from tkinter.scrolledtext import ScrolledText
from tkinter import scrolledtext

# -- coding: utf-8 --


def new_polzovatel():
    p = open( N + '.json', 'w' )
    p.write ('0\n0\n0\n0\n0')
    p.close()
    scrolledtext.insert(END,  '\nНовый пользователь успешно создан!')

def zabrat():
    pop = int(txt2.get())
    data = np.genfromtxt (N + '.json',  delimiter='\t', dtype=np.intc)
    print('data',data)
    poloj = pop
    data[0]-= poloj
    print ('data2',data)
    if data [0] <0:
        scrolledtext.insert(END,  '\nУ вас нет столько деняк')
        
    else:
        p = open( N + '.json', 'w' )
        p.write (str(data))
        print ('test', p)
        p.close
        scrolledtext.insert(END,  '\nВаш баланс составляет ')
        scrolledtext.insert(END,  data[0])
        scrolledtext.insert(END,  'Р.')
        
def polojit():
    pop = int(txt1.get())
    data = np.genfromtxt (N + '.json',  delimiter='\t', dtype=np.intc)
    print('data',data)
    poloj = pop
    data[0]+= int(poloj)
    print ('data2',data)
    p = open( N + '.json', 'w' )
    p.write (str(data))
    print ('test', p)
    p.close
    scrolledtext.insert(END,  '\nВаш баланс составляет ')
    scrolledtext.insert(END,  data[0])
    scrolledtext.insert(END,  'Р.')

def vlojit():
    pop = int(txt3.get())
    dnii =  int(dni.get())
    data = np.genfromtxt (N + '.json',  delimiter='\t', dtype=np.intc)
    if data [3] == 0:
        print('data',data)
        polojj = pop
        vremya = dnii
        procent = polojj + polojj/10*vremya
        print ('procent',procent)
        i = datetime.datetime.now()
        vremyasegot = (int(i.strftime("%d")))
        mesyac = (int(i.strftime("%m")))
        vremyasum = vremyasegot + vremya
        print ('vr',vremyasum)
        while vremyasum > 31:
            if mesyac % 2 == 0:
                print ('четное')
                if vremyasum > 30:
                    mesyac+=1
                    vremyasum-= 30
            else:
                print('нечетное')
                if vremyasum >31:
                    mesyac+=1
                    vremyasum-= 31
        data[4]+= procent
        data[3]+= vremyasum
        data[2]+= mesyac
        scrolledtext.insert(END,  '\n вы успешно вложили ')
        scrolledtext.insert(END,  polojj)
        scrolledtext.insert(END,  'Р. ')
        scrolledtext.insert(END,  'на ')
        scrolledtext.insert(END,  vremya)
        scrolledtext.insert(END,  ' дней. ')
        scrolledtext.insert(END,  'Вы получите ')
        scrolledtext.insert(END,  data[4])
        scrolledtext.insert(END,  'Р.')
        
        p = open( N + '.json', 'w' )
        p.write (str(data))
        p.close
    else:
        scrolledtext.insert(END,  '\n Вы уже вложили деньги под процент')

def proverit():
    data = np.genfromtxt (N + '.json',  delimiter='\t', dtype=np.intc)
    i = datetime.datetime.now()
    vremyasegot = (int(i.strftime("%d")))
    mesyac = (int(i.strftime("%m")))
    print ('mesyac', mesyac, 'den', vremyasegot)
    print ('data2', data[2],'data3', data[3] )
    
    if data[2] <= mesyac:
        print('прошел проверку месяца')
        if data[3] <= vremyasegot:
            print('прошел проверку дня')
            data[0]+= data[4]
            data[2] = 0
            data[4] =  0
            data[3] =  0
            print ('data2',data)
            p = open( N + '.json', 'w' )
            p.write (str(data))
            p.close
            
        else:
            scrolledtext.insert(END,  '\n вам придет ')
            scrolledtext.insert(END,  data[4])
            scrolledtext.insert(END,  'Р. ')
            scrolledtext.insert(END,  data[3])
            scrolledtext.insert(END,  ' числа, ')
            scrolledtext.insert(END,  data[2])
            scrolledtext.insert(END,  ' месяца.')
    else:
        scrolledtext.insert(END,  '\n вам придет ')
        scrolledtext.insert(END,  data[4])
        scrolledtext.insert(END,  'Р. ')
        scrolledtext.insert(END,  data[3])
        scrolledtext.insert(END,  ' числа, ')
        scrolledtext.insert(END,  data[2])
        scrolledtext.insert(END,  ' месяца.')
    scrolledtext.insert(END,  '\n ваш баланс составляет ')
    scrolledtext.insert(END,  data[0])
    scrolledtext.insert(END,  'Р.')
    if data[3] == 0:
        scrolledtext.insert(END,  '\n У вас нет вложений под  процент')
def cistka():
    with open(N + '.json', "r", encoding='utf-8-sig') as f:
        string = f.read()
    print (string)

    o = string.replace('[', '') 
    o = o.replace(']', '') 
    print ('o',o)
    p = open (N + '.json', 'w+' )
    p.write (o)
    cistkaa()

def cistkaa():
    with open(N + '.json', "r", encoding='utf-8-sig') as f:
        string = f.read()
    print (string)

    o = string.replace(' ', '\n') 
    o = o.replace(' ', '\n') 
    print ('o2',o)
    p = open (N + '.json', 'w+' )
    p.write (o)

def nacalo():
    global N
    pop = txt.get()
    N = pop
    path = pathlib.Path(N + '.json')
    if (path.is_file()):
        scrolledtext.insert(END,  '\nДобро пожаловать ')
        scrolledtext.insert(END,  N)
        scrolledtext.insert(END,  '!')
    else:
        new_polzovatel()

root = Tk()
root.geometry('1200x1000')

label = Label(root, anchor=CENTER, text='Введите имя пользователя')
scrolledtext = ScrolledText(root)
button1 = Button(root, height=2, width=10, text='Подтвердить',  command = nacalo)
button1.bind ('<button-1>')
button1.bind ('<return>')
button2 = Button(root, height=2, width=10, text='Подтвердить', command=lambda:[polojit(), cistka(), cistkaa()])
button3 = Button(root, height=2, width=10, text='Подтвердить',command=lambda:[zabrat(), cistka(), cistkaa()])
button4 = Button(root, height=2, width=10, text='Подтвердить',command=lambda:[vlojit(), cistka(), cistkaa()])
button5 = Button(root, height=2, width=10, text='Подтвердить',command=lambda:[proverit(), cistka(), cistkaa()])
entry1 = Entry(root, width=20, textvariable=StringVar)
entry2 = Entry(root, width=10, textvariable=IntVar)
entry3 = Entry(root, width=10, textvariable=IntVar)
entry4 = Entry(root, width=10, textvariable=IntVar)
entry6 = Entry(root, width=10, textvariable=IntVar)
txt = entry1
txt1 = entry2
txt2 = entry3
txt3 = entry4
dni =  entry6


label.grid(padx=5,pady=5)
entry1.grid()
button1.grid()
Label(root, anchor=CENTER, padx=5, pady=5, text='Вложить').grid()
entry2.grid()
button2.grid()
Label(root, anchor=CENTER, padx=5, pady=10, text='Вывести').grid()
entry3.grid()
button3.grid()
Label(root, anchor=CENTER, padx=5, pady=15, text='Вложить под 10%').grid()
entry4.grid()
Label(root, anchor=CENTER, padx=5, pady=18, text='на сколько дней').grid()
entry6.grid()
button4.grid()
Label(root, anchor=CENTER, padx=5, pady=20, text='Проверить').grid()
button5.grid()
scrolledtext.grid()


root.mainloop()