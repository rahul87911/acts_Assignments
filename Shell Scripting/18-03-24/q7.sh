#!/bin/bash


data_file="student_records.txt"


modify_record() {
    echo "Roll No Found. You can modify the record."
    read -p "Enter new name for the student: " new_name
    read -p "Enter new marks for subject 1: " new_marks1
    read -p "Enter new marks for subject 2: " new_marks2
    read -p "Enter new marks for subject 3: " new_marks3


    sed -i "/$roll_no/s/.*/$roll_no:$new_name:$new_marks1:$new_marks2:$new_marks3/" "$data_file"

    echo "Record updated successfully."
}


read -p "Enter the roll number to search: " roll_no


if grep -q "^$roll_no:" "$data_file"; then
    modify_record
else
    echo "Roll No Not Found."
fi

