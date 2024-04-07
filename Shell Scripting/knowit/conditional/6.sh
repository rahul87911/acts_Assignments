#!/bin/bash

# Function to check if a string is palindrome
is_palindrome() {


    # Check if the original and reversed strings are the same
    if [ "$1" = "$reversed" ]; then
        echo "The string \"$1\" is a palindrome."
    else
        echo "The string \"$1\" is not a palindrome."
    fi
}

# Accept input from user
echo "Enter a string:"
read input_string

# Call the function to check if the input string is a palindrome
is_palindrome "$input_string"

