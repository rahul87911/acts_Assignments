#!/bin/bash

echo "Deleting empty files in the current directory:"

# Find and delete empty files in the current directory
find . -type f -empty -delete

echo "Empty files deleted."

