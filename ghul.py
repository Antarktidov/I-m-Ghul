import time
a = 1000
b = 7
while a > b:
    d = a
    a = a - b
    c = str(a)
    print(f'{d} - {b} =' + c)
    time.sleep(0.1)
print('Я гуль!')
