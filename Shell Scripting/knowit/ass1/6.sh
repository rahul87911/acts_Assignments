#!/bin/bash

# Prompt user to enter the source file name
echo "Enter the name of the source file:"
read source_file

# Check if the source file exists
if [ ! -f "$source_file" ]; then
    echo "Source file '$source_file' not found."
    exit 1
fi

# Prompt user to enter the destination file name
echo "Enter the name of the destination file:"
read dest_file

# Copy contents of source file to destination file
cp "$source_file" "$dest_file"

# Check if the copy was successful
if [ $? -eq 0 ]; then
    echo "Contents of '$source_file' copied to '$dest_file' successfully."
else
    echo "Failed to copy contents of '$source_file' to '$dest_file'."
fi

