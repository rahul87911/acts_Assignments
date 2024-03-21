#!/bin/bash


source string_functions.sh


concatenated=$(concatenate_strings "Hello, " "World!")
echo "Concatenated string: $concatenated"

length=$(string_length "Hello")
echo "Length of the string: $length"

compare_strings "hello" "hello"
compare_strings "hello" "world"

is_palindrome "radar"
is_palindrome "hello"

reversed=$(reverse_string "hello")
echo "Reversed string: $reversed"

