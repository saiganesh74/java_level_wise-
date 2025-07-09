# CRT based Java Programs
This repository contains beginner-level Java programs organized into levels based on complexity and concepts. These are helpful for understanding the fundamentals of Java programming like conditionals, loops, character handling, and user input.

- Level 1
: Fundamental Programs
 These programs cover basic operations such as ASCII values, digit counting, and conditional comparisons.

    ascii.java – Prints the ASCII value of a given character.

    big3.java – Determines the largest of three numbers.

   charsascii.java – Prints ASCII values for a set of characters.

  countdigits.java – Counts the number of digits in a given number.

   Main.java – Checks whether the entered year is a leap year .


- Level 2 : Logical and Conditional Programs
These programs dive into decision-making, basic simulations, and simple computations.

  alphatype.java – Checks whether a character is uppercase, lowercase, a digit, or a special character.
 
  atm.java – Simulates basic ATM operations like withdrawal and balance checking.

  bill.java – Calculates total cost based on quantity and unit price.

  countofvd.java – Counts the number of vowels and digits in a string.



## Installation

Use the [JDK](https://www.oracle.com/java/technologies/downloads/) to run the programs.

```bash
sudo apt update && sudo apt upgrade -y 
sudo apt install openjdk-17-jdk -y
```

## Example Usage

```java
package level1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter your year");
            int year = s.nextInt();
            String res = ((year % 4 == 0)&& (year %100 != 0))?"YES its a leap year":(year% 400 == 0)? "Yes its a leap year " :"The entered isnt a leap year ";
            s.close();
            System.out.println(res);
        }
}

```

## Contributing

Pull requests are welcome. For major changes, please open an issue first..
