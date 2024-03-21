#!/bin/bash


if [ "$#" -lt 1 ]; then
    echo "Usage: $0 <RollNo>"
    exit 1
fi


data_file="student_records.txt"


roll_no="$1"


record=$(grep "^$roll_no:" "$data_file")
if [ -n "$record" ]; then
    echo "Record found for Roll No $roll_no:"
    echo "$record"


    read -p "Do you want to delete this record? (y/n): " confirm
    if [ "$confirm" = "y" ]; then

        sed -i "/^$roll_no:/d" "$data_file"
        echo "Record deleted successfully."
    else
        echo "Record not deleted."
    fi
else
    echo "Record not found for Roll No $roll_no."
fi

