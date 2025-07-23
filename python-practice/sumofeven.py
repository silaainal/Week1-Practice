N = int(input("Enter the first number: "))
total = 0

for i in range(1, N):
    if i % 2 == 0:
        total += i

print(f"The sum of even numbers from 1 to {N} is {total}")
