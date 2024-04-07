#!/bin/bash

# Source directory containing files
source_dir="/path/to/source_directory"

# Destination directory to move files
destination_dir="/path/to/destination_directory"

# Ensure destination directory exists
if [ ! -d "$destination_dir" ]; then
    echo "Destination directory does not exist."
    exit 1
fi

echo "Moving files larger than 0 bytes to $destination_dir..."

# Move files larger than 0 bytes to the destination directory
find "$source_dir" -type f -size +0 -exec mv -t "$destination_dir" {} +

echo "Files moved successfully."

