# Homework 1 - Java Programming Exercises

**Author:** sanchezyander  
**Course:** Programming Fundamentals  
**IDE:** NetBeans 27

## Project Description

This project contains a collection of Java programming exercises implemented as a menu-driven application. Each exercise demonstrates different programming concepts and algorithms.

## Exercises Included

1. **IMCApp** - Body Mass Index Calculator
2. **AmstrongApp** - Armstrong Number Checker
3. **NumeroPerfectoApp** - Perfect Number Checker
4. **NumerosAmigosApp** - Amicable Numbers Checker
5. **ArrayDuplicatedNumbersApp** - Duplicate Numbers in Array
6. **EjercicioPositivoFactorial** - Positive Number Factorial (First Partial Exam - Oct 1, 2025)

## Running the Project

### Option 1: NetBeans IDE

1. Open NetBeans 27
2. Go to `File` → `Open Project`
3. Navigate to the project folder and select it
4. Right-click on `Homework1.java` in the `src/homework1` package
5. Select `Run File` or press `F6`

### Option 2: Command Line (Console)

1. **Compile the project:**

    ```bash
    cd /path/to/Homework1
    javac -d build/classes src/homework1/*.java
    ```

2. **Run the main application:**

    ```bash
    java -cp build/classes homework1.Homework1
    ```

3. **Run individual exercises:**

    ```bash
    # Example: Run IMC Calculator
    java -cp build/classes homework1.IMCApp

    # Example: Run Armstrong Number Checker
    java -cp build/classes homework1.AmstrongApp
    ```

## Project Structure

```
src/homework1/
├── Homework1.java          # Main menu application
├── Exercise.java           # Interface for exercises
├── IMCApp.java            # BMI Calculator
├── AmstrongApp.java       # Armstrong Numbers
├── NumeroPerfectoApp.java # Perfect Numbers
├── NumerosAmigosApp.java  # Amicable Numbers
├── ArrayDuplicatedNumbersApp.java # Array duplicates
└── EjercicioPositivoFactorial.java # Factorial exercise
```

## Requirements

-   Java 8 or higher
-   NetBeans 27 (recommended) or any Java IDE
-   Command line tools (for console execution)

## Usage

The application presents a menu where you can select which exercise to run. Each exercise will prompt for input and display results accordingly. Type `0` to exit the application.
