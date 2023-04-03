stack = []

stack.append("aku")
stack.append("anak")
stack.append("Indonesia")

print("next!" + stack[-1])
stack.append("Raya")
print(stack.pop())

count = stack.count("Aku")
while count > 0:
    stack.pop()
    count -= 1

print(stack.pop())
print(not stack)
