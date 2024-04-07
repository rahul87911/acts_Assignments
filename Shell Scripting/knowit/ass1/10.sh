#!/bin/bash

# Count number of files
num_files=$(find . -maxdepth 1 -type f | wc -l)

# Count number of directories (excluding '.' and '..')
num_dirs=$(find . -maxdepth 1 -mindepth 1 -type d | wc -l)

echo "Number of files: $num_files"
echo "Number of directories: $num_dirs"

