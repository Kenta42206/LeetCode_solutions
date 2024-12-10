#!/bin/bash

num=$1
pName=$2

if [ "$#" -ne 2 ]; then
    echo "ERROR: arg is missing."
    echo "Please enter the question number and the question name."
    exit 1
fi

dir_name="$num"
problem_name="$pName"
file_name="Leetcode$num"
file_distination="$dir_name/$file_name.java"

mkdir "$dir_name"

Url="https://leetcode.com/problems/$problem_name"

echo "// Problem URL: $Url" > "$file_distination"

sed "s/Template/$file_name/g" ./template/Template.java >> "$file_distination"

echo "Directory '$dir_name' and file '$file_name' have been created."





