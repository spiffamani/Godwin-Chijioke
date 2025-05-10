#  positive number
numbers = int(input('Enter number: '))
while numbers <= 1:
	numbers = int(input('Enter a positive number: '))
for number in range(numbers, 0, -1):
	print(number)
print('Blast off')
 

