#!/bin/bash

echo "Enter the starting number (m):"
read m
echo "Enter the ending number (n):"
read n

count=0
echo "Even numbers from $m to $n:"
for ((i = m; i <= n; i++)); do
    if [ $((i % 2)) -eq 0 ]; then
        echo -n "$i "
        count=$((count + 1))
    fi
done

echo
echo "Count: $count"

