age = 18

if age>=18:
    print("You are old enough to vote.")
else:
    print("You are not old enough to vote.")

day = "Monday"
match day:
    case "Monday":
        print("It's the start of the week.")
    case "Friday":
        print("It's almost the weekend.")
    case _:
        print("It's just another day.")
    
for i in range(1,6):
    print(i)

int = 1 
while i<= 5:
    print(i)
    i += 1

def greet(name):
    return f"Hello, {name}"

print(greet("Sıla"))

