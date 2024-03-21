#!/bin/bash


file_list=$(ls -l | grep "^-" | awk '{print $9}')


max_size=0
min_size=0


for file in $file_list
do

    size=$(stat -c %s "$file")
    

    if [ $size -gt $max_size ]; then
        max_size=$size
        max_file=$file
    fi
    

    if [ $min_size -eq 0 ]; then
        min_size=$size
        min_file=$file
    fi
    

    if [ $size -lt $min_size ]; then
        min_size=$size
        min_file=$file
    fi
done


echo "Files in the current directory:"
echo "$file_list"


echo "File with maximum size: $max_file (Size: $max_size bytes)"


echo "File with minimum size: $min_file (Size: $min_size bytes)"

