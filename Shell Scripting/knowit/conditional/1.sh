#!/bin/bash

# Create a file named "fruits.txt" and add data to it
echo "apple
apple
apple
banana
mango
mango
pineapple
grapes" > fruits.txt

# a. Remove duplicate lines from fruits.txt using 'uniq' command
echo "Removing duplicate lines from fruits.txt:"
uniq fruits.txt

# b. Remove duplicate lines, also count them, from fruits.txt using 'uniq -c' command
echo "Removing duplicate lines and counting occurrences from fruits.txt:"
uniq -c fruits.txt

