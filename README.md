# Rental Car Calculator
```
Step 1
IMPORTANT: DO NOT just start coding - take time to plan the flow of your
application in your notebook.
Read the requirements below and consider how you would calculate the cost if
you did not have a computer. Practice several scenarios (with different options)
in your notebook before you create your project in IntelliJ.
Take a picture or screenshot of your notebook and save the image to your project
directory (after you create the project).

Step 2
Create a Java application named RentalCarCalculator that estimates the cost of
reserving a rental car. Prompt the user for the following information:
        a. pickup date (store as a string)
        b. number of days for the rental
        c. whether they want an electronic toll tag at $3.95/day (yes/no)
        d. whether they want a GPS at $2.95/day (yes/no)
        e. whether they want roadside assistance at $3.95/day (yes/no)
        f. their current age
Calculate and display:
        a. basic car rental
        b. options cost
        c. underage driver surcharge
        d. total cost
The basic car rental is $29.99 per day. There is a 30% surcharge on the basic car
rental for drivers under 25. All taxes have already been incorporated into the
fees shown.
```

Calculates the cost of renting a car based on:
- Number of rental days

- Optional add-ons (toll tag, GPS, roadside assistance)

- Age of the driver (with underage fee if under 25)

# Features
Prompts the user for:
- Pickup date (string input)

- Number of days for the rental

- Whether they want extra options (toll tag, GPS, roadside assistance)

- Age of the driver

Calculates:
- Basic rental cost → $29.99 per day

- Options cost → toll tag ($3.95/day), GPS ($2.95/day), roadside assistance ($3.95/day)

- Underage driver fee → 30% surcharge if the driver is under 25

- Total cost

Display a detailed summary with costs rounded to two decimal places.

Follow the prompts in the console to enter your rental details.
```
Example Run

Enter pickup date:
2025-10-01
Enter number of days:
3
Do you want an electric toll tag for $3.95/day? (yes/no)
yes
Do you want GPS for $2.95/day? (yes/no)
no
Do you want roadside assistance for $3.95/day? (yes/no)
yes
Enter your age:
22


Output:

Pickup Date: 2025-10-01
Basic car rental cost is: $89.97
Options Cost is: $11.85
Underage fee is: $26.99
Your total is: $128.81
```
# Code Breakdown
- Scanner → reads user input from the console.

- Variables → store rates, number of days, and user choices.

- If statements / ternary operator → calculate optional costs.

- Condition for underage fee → applies a 30% surcharge if driver < 25.

- Formatted output (%.2f) → ensures costs display with two decimal places.

# Future Improvements
- Add input validation (e.g., prevent negative days, accept only “yes/no”).
