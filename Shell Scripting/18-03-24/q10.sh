#!/bin/bash


if [ "$#" -ne 1 ]; then
    echo "Error: Please provide exactly one argument."
    exit 1
fi


file_type=$(stat -c %F "$1")


echo "File type of '$1': $file_type"

