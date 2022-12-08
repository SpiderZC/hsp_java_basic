#!/bin/zsh

current_dir=$(cd $(dirname $0);pwd)
cd $current_dir

filename=out

if [ ! -d $filename ]; then
    mkdir -p out
else
    rm -rf out
fi

mkdir -p out

echo $(find . -name "*.java")
javac -sourcepath $(find . -name "*.java") -d out
