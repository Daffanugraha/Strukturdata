from queue import Queue

class Latihan2:
    def queueExample(self):
        queue = Queue()
        queue.put("Java")
        queue.put("Dotnet")
        queue.put("PHP")
        queue.put("HTML")
        print("get : ", queue.get())
        print("queue : ", queue.queue[0])
        print("get : ", queue.get())
        print("queue[0] : ", queue.queue[0])

if __name__ == "__main__":
    latihan = Latihan2()
    latihan.queueExample()
