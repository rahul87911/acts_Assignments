#!/bin/bash

echo "Enter a number:"
read number

is_prime=true

if [ $number -le 1 ]; then
    is_prime=false
fi

for ((i = 2; i * i <= number; i++)); do
    if [ $((number % i)) -eq 0 ]; then
        is_prime=false
        break
    fi
done

if [ "$is_prime" = true ]; then
    echo "$number is a prime number."
else
    echo "$number is not a prime number."
fi

