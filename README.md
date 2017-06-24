# FoodDeliverySystem

This is a cloud based online restaurant POS system, where costomers can select food from restaurant to be delivered, and pay for it. The system uses Microservices architecture and Spring Cloud.

The food delivery system consisted of three microservices: Restaurant Menu Service, Meal Order Service, Payment Service and Restaurant Notification Service.

Restaurant Menu Service

Providing information about restaurants and menus including restaurant's name and menu item's name, price.

Meal Order Service

Keeping track of orders from customers including user's order item, quantity, note, order time, estimated delivery time and delivery address. Obtain payment status from payment service.

Payment Service

Handling payment for orders provided by meal order service. Accept credit card number, expiration date, and security code from customer.
