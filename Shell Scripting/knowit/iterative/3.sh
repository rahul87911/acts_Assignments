#!/bin/bash

count=0
number=1

echo "First 10 odd numbers:"
while [ $count -lt 10 ]; do
    echo "$number"
    number=$((number + 2))
    count=$((count + 1))
done

