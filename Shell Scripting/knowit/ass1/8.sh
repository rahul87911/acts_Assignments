#!/bin/bash

# Print top 10 memory-consuming processes
ps -eo pid,ppid,cmd,%mem --sort=-%mem | head -n 11

