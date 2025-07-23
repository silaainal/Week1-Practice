class User:
    #__init__ method to initialize the User object, constructor
    #self is like the this keyword in Java
    def __init__(self, name, email, user_id):
        self.name = name
        self.email = email
        self.user_id = user_id

    def display_info(self):
        print(f"Name: {self.name}, Email: {self.email}, User ID: {self.user_id}")

    def change_email(self, new_email):
        self.email = new_email
        print(f"Email changed to: {self.email}")

class Product:
    def __init__(self, name, price, category):
        self.name = name
        self.price = price
        self.category = category

    def display_info(self):
        print(f"Name: {self.name}, Price: {self.price}, Category: {self.category}")

    def apply_discount(self, discount_percent):
        discount_amount =self.price * (discount_percent / 100)
        self.price -= discount_amount
        print(f"New price after {discount_percent}% discount: {self.price}")


user1 = User("Sıla", "silainal@gmail.com", 170304)
user1.display_info()

product1 = Product("Laptop", 15000, "Computer")
product1.display_info()

user1.change_email("silainal0@gmail.com")
product1.apply_discount(10)

