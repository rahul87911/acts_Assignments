#!/bin/bash


sed -i '1 i\TechM Employees' EmpData


sed -i '1,3 s/|/ : /g' EmpData


sed -n '/director/p' EmpData > directors.txt
sed -n '/d.g.m/p' EmpData > dgms.txt
sed -n '/g.m/p' EmpData > gms.txt


sed -n '1,4 p' EmpData > Empupdate


sed -i 's/account/accounts/g' EmpData


sed -i '/g.m/!d' EmpData


sed -i 'G' EmpData

