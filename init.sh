#!/bin/bash

num=$1

if [ "$#" -ne 1 ]; then
    echo "引数がたりません"
    exit 1
fi

dir_name="$num"
file_name="Leetcode$num"
file_distination="$dir_name/$file_name.java"

mkdir "$dir_name"

sed "s/Template/$file_name/g" ./template/Template.java > "$file_distination"

echo "Directory '$dir_name' and file '$file_name' have been created."





