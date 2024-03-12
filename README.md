# GroupP-Homework5

## Group members
1. Eli Wuerth
2. Kristyn Morgenthaler
3. Conor McLaughlin
4. Michael Keeney

### Project Overview
Homework 5 is a Java program which carries out the duties of a pizza restaurant named FakeSpeare. The program utilises both the Factory and Strategy design patterns in order to create, build, and cook four main types of pizzas: Margherita, Hawaiian, Vegetarian, and Supreme. Each of these pizza classes are subclasses which inherit the fields, methods, and attributes of an Abstract class named AbstractPizza. The program implements the Factory design pattern so that the user can easily create any of the four specified pizza types. Each of the four main types of pizzas have default toppings, but users can also add/remove toppings to fit their taste. As more toppings are added to the pizzas, the total price is updated to reflect the additional charges. The Strategy design is implemented to cook each pizza via the specified strategy. Users can select how their pizza is cooked, either via microwave, conventional oven, or brick oven, and each of these cooking strategies has a different price, microwave is the cheapest at $1 and brick oven is the most expensive adding an additional $10 to the pizza price. To keep track of all the pizzas a user orders, the PizzaOrder class creates a list of pizzas and makes sures pizzas are added to the list, are cooked properly, and the total bill is calculated based on the pizzas the user has ordered. Various methods and exceptions are in place to check for pizzas being created properly and all attributes about them being clarified.

### Key Contributions
- **Eli Wuerth**:
- **Kristyn Morgenthaler**:
- **Michael Keeney**:
- **Conor McLaughlin**:
-  
### How to Run
The program can be executed by running the `Main` class. The `Main` class instantiates a pizza order which allows the user to next add pizzas to their cart, customize their pizzas, and finally calculate and print out their pizza receipt. Ensure all Java files are present and dependencies within each class are satisfied to prevent malfunctions. Also note there are various error-checking and custom exceptions in order to prevent the program from crashing from erroneous input in the `Main` class.
