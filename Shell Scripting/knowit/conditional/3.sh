#!/bin/bash

echo "Enter the file name:"
read filename

if [ -f "$filename" ]; then
    if [ -r "$filename" ]; then
        echo "Contents of $filename:"
        cat "$filename"
    else
        echo "Error: $filename exists but you do not have read permission."
    fi
else
    echo "Error: $filename does not exist."
fi

