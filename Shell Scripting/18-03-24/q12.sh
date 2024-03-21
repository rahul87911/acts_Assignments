#!/bin/bash


add_student_records() {

    if [ -e "$1" ]; then
        echo "File '$1' already exists. Appending records."
    else

        echo "RollNo:Name:Marks_Hindi:Marks_Maths:Marks_Physics" > "$1"
    fi


    while true; do
        read -p "Enter RollNo (or type 'done' to finish): " roll_no
        if [ "$roll_no" = "done" ]; then
            break
        fi
        read -p "Enter Name: " name
        read -p "Enter Marks in Hindi: " marks_hindi
        read -p "Enter Marks in Maths: " marks_maths
        read -p "Enter Marks in Physics: " marks_physics
        echo "$roll_no:$name:$marks_hindi:$marks_maths:$marks_physics" >> "$1"
    done


    num_students=$(($(wc -l < "$1") - 1))
    sed -i "s/$batch_code:[^:]*:[^:]*$/$batch_code:$faculty_name:$num_students/" master
}


if [ "$#" -ne 1 ]; then
    echo "Error: Please provide the batch code."
    exit 1
fi


master_file="master"


batch_code="$1"


if grep -q "^$batch_code:" "$master_file"; then

    faculty_name=$(grep "^$batch_code:" "$master_file" | cut -d ':' -f 2)
    echo "Batch code '$batch_code' found in master file."
    echo "Faculty Name: $faculty_name"
    echo "Updating records for batch code '$batch_code'..."
    add_student_records "$batch_code"
else
    echo "Batch code '$batch_code' not found in master file."
fi

