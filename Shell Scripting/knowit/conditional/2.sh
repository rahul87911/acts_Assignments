#!/bin/bash

echo "Enter the first number:"
read num1

echo "Enter the second number:"
read num2

if [ $num1 -lt $num2 ]; then
    echo "The smallest number is: $num1"
else
    echo "The smallest number is: $num2"
fi

