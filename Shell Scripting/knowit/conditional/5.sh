#!/bin/bash

# Function to perform addition
add() {
    result=$(echo "$1 + $2" | bc)
    echo "Result: $result"
}

# Function to perform subtraction
sub() {
    result=$(echo "$1 - $2" | bc)
    echo "Result: $result"
}

# Function to perform multiplication
mul() {
    result=$(echo "$1 * $2" | bc)
    echo "Result: $result"
}

# Function to perform division
div() {
    if [ $2 -eq 0 ]; then
        echo "Error: Division by zero!"
    else
        result=$(echo "scale=2; $1 / $2" | bc)
        echo "Result: $result"
    fi
}

# Menu-driven program
while true; do
    echo "Menu:"
    echo "1. Addition"
    echo "2. Subtraction"
    echo "3. Multiplication"
    echo "4. Division"
    echo "5. Exit"
    echo "Enter your choice:"
    read choice

    case $choice in
        1)
            echo "Enter two numbers:"
            read num1 num2
            add $num1 $num2
            ;;
        2)
            echo "Enter two numbers:"
            read num1 num2
            sub $num1 $num2
            ;;
        3)
            echo "Enter two numbers:"
            read num1 num2
            mul $num1 $num2
            ;;
        4)
            echo "Enter two numbers:"
            read num1 num2
            div $num1 $num2
            ;;
        5)
            echo "Exiting program."
            exit 0
            ;;
        *)
            echo "Invalid choice. Please enter a valid option."
            ;;
    esac
done

