#!/bin/bash


concatenate_strings() {
    local str1="$1"
    local str2="$2"
    local concatenated="$str1$str2"
    echo "$concatenated"
}


string_length() {
    local str="$1"
    local length=${#str}
    echo "$length"
}


compare_strings() {
    local str1="$1"
    local str2="$2"
    if [ "$str1" = "$str2" ]; then
        echo "Strings are equal."
    else
        echo "Strings are not equal."
    fi
}


is_palindrome() {
    local str="$1"
    local reversed_str=$(echo "$str" | rev)
    if [ "$str" = "$reversed_str" ]; then
        echo "String is a palindrome."
    else
        echo "String is not a palindrome."
    fi
}


reverse_string() {
    local str="$1"
    local reversed_str=$(echo "$str" | rev)
    echo "$reversed_str"
}

