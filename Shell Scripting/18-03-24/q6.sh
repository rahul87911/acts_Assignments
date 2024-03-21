#!/bin/bash


current_hour=$(date +%H)


if [ $current_hour -ge 5 ] && [ $current_hour -lt 12 ]; then
    greeting="Good morning"
elif [ $current_hour -ge 12 ] && [ $current_hour -lt 18 ]; then
    greeting="Good afternoon"
else
    greeting="Good evening"
fi


echo "$greeting! Welcome!"

