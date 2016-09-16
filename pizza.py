available = ["mushrooms", "onions", "ham", "garlic", "chicken", "extra cheese"]
pizza = []

items = int (raw_input("How many toppings do you want on your pizza? "))

for i in range(items):
    topping = raw_input("List a topping you want on your pizza: ")
    
    if topping in available:
        pizza.append(topping)
    else:
        print "Sorry, we don't have that topping."
        
    
print "You want a pizza with the following toppings: ",
print ", ".join(pizza) 
print "Thank you for ordering!"    
    
    
    
    
    
    
        
