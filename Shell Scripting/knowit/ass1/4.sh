#!/bin/bash

# Check if the file exists
if [ -f "MoreCountries1" ]; then
    # Display the contents of the file
    cat MoreCountries1
else
    echo "File 'MoreCountries1' not found."
fi

