#!/bin/bash

echo "Enter a number:"
read number

if [ $number -gt 0 ]; then
    factorial=1
    for ((i = 1; i <= $number; i++)); do
        factorial=$((factorial * i))
    done
    echo "Factorial of $number is: $factorial"
else
    echo "The number entered is not positive."
fi

