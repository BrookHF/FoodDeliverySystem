# FoodDeliverySystem

> This is a cloud based online restaurant POS system, where costomers can select food from restaurant to be delivered, and pay for it. The system uses Microservices architecture and Spring Cloud.

> The food delivery system consisted of three microservices: Restaurant Menu Service, Meal Order Service, Payment Service and Restaurant Notification Service.

1. Restaurant Menu Service

Providing information about restaurants and menus including restaurant's name and menu item's name, price.

  domain:

  restaurants: restaurant id, restaurant name
  foods: food id, food name, restaurant name, food price

  API:

| Description| Verb| Url|
| ------------- |:-------------:| -----:|
| Get a list of Restaurants| get| http://localhost:60000/restaurant|
| Add a list of Restaurants| post| http://localhost:60000/restaurant|
| delete all Restaurants| delete| http://localhost:60000/restaurant|
| delete Restaurant by name| delete| http://localhost:60000/restaurant/{restaurantName}|
| get a menu by restaurant name| get| http://localhost:60000/menu/{restaurantName}|
| add a list of food items| post| http://localhost:60000/menu|
| delete all food items in one restaurant| delete| http://localhost:60000/menu/{restaurantName}|
| delete one food item by restaurant and food name| delete| http://localhost:60000/menu/{restaurantName,foodName}|

2. Meal Order Service

> Keeping track of orders from customers including user's order item, restaurant, quantity, note, order time, estimated delivery time and delivery address. Obtain payment status from payment service.

  domain:

  Ordesr: order id, customer name, restaurant name, list of items, full price, order time, delivery address, estimated delivery time, payment status.
  items: food id, food name, price, quantity.

  API:

| Description| Verb| Url|
| ------------- |:-------------:| -----:|
| Get an order by order id| get| http://localhost:60000/order/{orderId}|
| create an order| post| http://localhost:60000/order|
| update order| put| http://localhost:60000/order/{orderId}|
| delete a order by order id| delete| http://localhost:60000/order/{orderId}|
| delete all order| delete| http://localhost:60000/order|



3. Payment Service

> Handling payment for orders provided by meal order service. Accept credit card number, expiration date, and security code from customer.

  domain:

  payment: payment id, order id, customer name, credit card number, expiration date, security code, payment status, transition time.

  API:

| Description| Verb| Url|
| ------------- |:-------------:| -----:|
| get an payment by order id      | get | http://localhost:60000/payment/{orderId} |
| create a payment by order id      | post      | http://localhost:60000/payment/{orderId}   |
| provide payment information by order id      | put      | http://localhost:60000/payment/{orderId}   |
| cancel a payment by order id      | put      | http://localhost:60000/payment/cancel/{orderId}   |

