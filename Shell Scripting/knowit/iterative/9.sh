#!/bin/bash

echo "Contents of files in the current directory:"

# Loop through all files and directories in the current directory
for entry in *; do
    if [ -f "$entry" ]; then
        # If it's a file, display its name and contents
        echo "File: $entry"
        cat "$entry"
        echo "-----------------------------"
    elif [ -d "$entry" ]; then
        # If it's a directory, display a proper message
        echo "$entry is a directory."
        echo "-----------------------------"
    fi
done

