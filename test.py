# importing the datetime module
from tkinter import *
from tkinter.scrolledtext import ScrolledText
class Window:

    def init(self, title="s", resizeble=(False, False), icon=None):
        self.root = Tk()
        self.root.title(title)
        self.root.geometry('800x600')


        if icon:
            self.root.iconbitmap(icon)

        self.label = Label(self.root, anchor=CENTER, text='Введите имя пользователя')
        self.scrolledtext = ScrolledText(self.root)
    def widget(self):
        self.label.grid(padx=5,pady=5)
        Entry(self.root, width=20).grid()
        Button(self.root, height=2, width=10, text='Подтвердить').grid()
        Label(self.root, anchor=CENTER, padx=5, pady=5, text='Вложить').grid()
        Entry(self.root, width=10).grid()
        Button(self.root, height=2, width=10, text='Подтвердить').grid()
        Label(self.root, anchor=CENTER, padx=5, pady=10, text='Вывести').grid()
        Entry(self.root, width=10).grid()
        Button(self.root, height=2, width=10, text='Подтвердить').grid()
        Label(self.root, anchor=CENTER, padx=5, pady=15, text='Вложить под %').grid()
        Entry(self.root, width=10).grid()
        Button(self.root, height=2, width=10, text='Подтвердить').grid()
        Label(self.root, anchor=CENTER, padx=5, pady=20, text='Проверить').grid()
        Entry(self.root, width=10).grid()
        Button(self.root, height=2, width=10, text='Подтвердить').grid()
        self.scrolledtext.grid()


    def run(self):
        self.widget()
        self.root.mainloop()

if name == "main":
    Window = Window("d")
    Window.run()