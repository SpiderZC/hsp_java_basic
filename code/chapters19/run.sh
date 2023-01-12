#!/bin/zsh

cd $(cd `dirname $0`;pwd)

echo "Enter 1 or 2 to select main or test"
echo "1. main"
echo "2. test"
read number

echo $number
if [ $number -eq 1 ]
then
    echo "run Main"
    echo "please enter mainClass"
    read mainClass
    if [ ! -d target ]
    then
        mvn compile
        # mvn exec:java -Dexec.mainClass="com.xxx.Jdbc01" -Dexec.cleanupDaemonThreads=false
        mvn exec:java -Dexec.mainClass="$mainClass" -Dexec.cleanupDaemonThreads=false
    else
        mvn clean
        mvn compile
        mvn exec:java -Dexec.mainClass="$mainClass" -Dexec.cleanupDaemonThreads=false
    fi
elif [ $number -eq 2 ]
then
    echo "run Test"
    echo "please enter testClass"
    read testClass
    echo "please enter testMethod"
    read testMethod
    if [ ! -d target ]
    then
        mvn compile
        mvn -Dtest=$testClass#$testMethod test
    else
        mvn clean
        mvn compile
        mvn -Dtest=$testClass#$testMethod test
    fi
else
    echo "Enter Wrong!"
fi


