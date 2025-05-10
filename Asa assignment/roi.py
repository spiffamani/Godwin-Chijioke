Roi = 0
Amount = 0

principal = int(input('Enter principal: '))

interestrate = int(input('Enter rate:')) / 100

numberofyears = int(input('Enter number of years:'))


for number in range(1,numberofyears + 1):
	Roi = principal * (1 + interestrate) ** number
	Amount  = Roi + principal
print('The return is ', number)