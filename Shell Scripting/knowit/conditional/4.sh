#!/bin/bash

# Create the data file "Employee" with the provided data
echo "1425 Ravi 15.65
      4320 Anuja 26.27
      6830 Sita 36.15
      1450 Raju 21.86" > Employee

# Menu-driven program
while true; do
    echo "Menu:"
    echo "1. Sort by ID number"
    echo "2. Sort by Name"
    echo "3. Sort by Commission Earned"
    echo "4. Exit"
    echo "Enter your choice:"
    read choice

    case $choice in
        1)
            echo "Sorting by ID number:"
            sort -n -k1,1 Employee
            ;;
        2)
            echo "Sorting by Name:"
            sort -k2,2 Employee
            ;;
        3)
            echo "Sorting by Commission Earned:"
            sort -n -k3,3 Employee
            ;;
        4)
            echo "Exiting program."
            exit 0
            ;;
        *)
            echo "Invalid choice. Please enter a valid option."
            ;;
    esac
done

