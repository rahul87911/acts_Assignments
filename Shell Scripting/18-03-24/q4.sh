#!/bin/bash


current_day=$(date +%u)


if [ $current_day -ge 1 ] && [ $current_day -le 5 ]; then
    echo "Today is a working day (Monday to Friday)."
else
    echo "Today is not a working day (Saturday or Sunday)."
fi

