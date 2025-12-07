from threading import Thread
from time import sleep

class Hello(Thread):
    def run(self):
        for i in range(5):
            print("hello")
            sleep(1)


class Hi(Thread):
    def run(self):
        for i in range(5):
            print("Hi")
            sleep(1)


t1 = Hello()
t2 = Hi()

t1.start()
sleep(0.2) # this is to avoid collision(when both threads come to cpu at the same time)
t2.start()

# this will help in executing this "print("Bye")" after t1 and t2 thread will done their work
t1.join()
t2.join()

print("Bye")