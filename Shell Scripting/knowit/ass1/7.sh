#!/bin/bash

# Print top 10 CPU-consuming processes
ps -eo pid,ppid,cmd,%cpu --sort=-%cpu | head -n 11

