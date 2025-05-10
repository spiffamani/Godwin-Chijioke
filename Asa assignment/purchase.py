buyingprice = 1000
buyingprice1 = 10000
buyingprice2 = 50000
discountamount = 0 
totalprice = 0

purchaseprice = int(input('Enter number' ))

if  purchaseprice < buyingprice and purchaseprice >= buyingprice1 :
	discountamount = purchaseprice * 5 / 100
	print('your discount is ', discountamount )
total = purchaseprice - discountamount 
print("your Total amount after discount is ",  total)

if (purchaseprice < buyingprice and purchaseprice != buyingprice):
	total = purchaseprice - discountamount 
print("your Total amount after discount is ",  total)



if  purchaseprice < buyingprice1 and purchaseprice >= buyingprice2  :
	discountamount = purchaseprice * 5 / 100
	print('your discount is ', discountamount )

if(purchaseprice < buyingprice and purchaseprice != buyingprice1):
	total = purchaseprice - discountamount 
print("your Total amount after discount is " , total)


if  purchaseprice == buyingprice1 and purchaseprice >= buyingprice1  :
	
	discountamount = purchaseprice * 5 / 100
	print('your discount is ', discountamount )

else:(purchaseprice < buyingprice2 and purchaseprice != buyingprice2)
total = purchaseprice - discountamount 
print("your Total amount after discount is ", total)
 
 
 

