#!/bin/bash


read -p "Enter your weight in Kgs: " weight


if (( weight >= 30 )) && (( weight <= 250 )); then
    echo "Congratulations! You are accepted as a member of the MBT health club."
else
    echo "Sorry, your weight is not within the acceptable range (30-250 Kgs)."
fi

