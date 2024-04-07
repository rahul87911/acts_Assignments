#!/bin/bash

# Prompt user to enter the file name
echo "Enter the name of the file:"
read filename

# Check if the file exists
if [ -f "$filename" ]; then
    # Display the contents of the file
    echo "Contents of $filename:"
    cat "$filename"
else
    echo "File '$filename' not found."
fi

