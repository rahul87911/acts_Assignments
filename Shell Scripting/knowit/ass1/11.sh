#!/bin/bash

# Prompt user to enter the file extension
echo "Enter the file extension (e.g., txt, jpg, etc.):"
read extension

# Count number of files with the specified extension
num_files=$(find . -maxdepth 1 -type f -name "*.$extension" | wc -l)

echo "Number of .$extension files: $num_files"

