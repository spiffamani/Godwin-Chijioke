investment_value = 0
investment_interest = 0
Roi_percentage = 0
Roi_ return = 0
roi_inpercentage = 0
Roi = 0


principal = int(input('Enter principal')

interestrate = int(input('Enter rate')

numberofyears = int(input('Enter number of years')


investment_value = principal * (1 + interestrate) ** numberofyears

investment_interest =  investment_value  - principal

Roi_return = (investment_value - principal ) / principal

roi_inpercentage =( principal * Roi_return ) / 100

Roi = principal + roi_inpercentage

print('ROI return is ' , Roi)



