#!/bin/bash


log_file="log1.txt"


if [ "$#" -ne 5 ]; then
    echo "Error: Please provide RollNo, Name, Marks_Hindi, Marks_Maths, and Marks_Physics."
    exit 1
fi


roll_no="$1"
name="$2"
marks_hindi="$3"
marks_maths="$4"
marks_physics="$5"


if grep -q "^$roll_no:" student; then
    echo "Roll number $roll_no already exists." >> "$log_file"
fi


if [ $marks_hindi -lt 1 ] || [ $marks_hindi -gt 99 ] || [ $marks_maths -lt 1 ] || [ $marks_maths -gt 99 ] || [ $marks_physics -lt 1 ] || [ $marks_physics -gt 99 ]; then
    echo "Marks for RollNo $roll_no are out of range." >> "$log_file"
fi


total_marks=$((marks_hindi + marks_maths + marks_physics))
percentage=$((total_marks / 3))
if [ $percentage -ge 90 ]; then
    grade="A"
elif [ $percentage -ge 80 ]; then
    grade="B"
elif [ $percentage -ge 70 ]; then
    grade="C"
elif [ $percentage -ge 60 ]; then
    grade="D"
else
    grade="F"
fi


echo "Total marks for $name (RollNo: $roll_no): $total_marks"
echo "Percentage: $percentage%"
echo "Grade: $grade"

