#!/bin/bash

# Prompt user to enter the number of lines
echo "Enter the number of lines to copy:"
read num_lines

# Prompt user to enter the filename
echo "Enter the name of the file to copy from:"
read source_file

# Check if the source file exists
if [ ! -f "$source_file" ]; then
    echo "Source file '$source_file' not found."
    exit 1
fi

# Copy top n lines from source file to fileCopy.txt
head -n "$num_lines" "$source_file" > fileCopy.txt

# Check if the copy was successful
if [ $? -eq 0 ]; then
    echo "Top $num_lines lines copied from '$source_file' to 'fileCopy.txt' successfully."
else
    echo "Failed to copy top $num_lines lines from '$source_file' to 'fileCopy.txt'."
fi

