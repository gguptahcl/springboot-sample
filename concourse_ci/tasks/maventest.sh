#!/bin/bash

set -e

echo "Starting unit tests in maven test...."
cd spring-boot-sample

ls -lt
chmod +x concourse_ci/tasks/maventest.sh
chmod +x ./mvnw

echo "Present working directory is...."
echo "$(pwd)"

./mvnw clean test --s settings.xml -Dmaven.wagon.http.ssl.insecure=true -Dmaven.wagon.http.ssl.allowall=true -Dmaven.wagon.http.ssl.ignore.validity.dates=true

#./mvnw clean test --s settings.xml

echo "Present working director yat the end -----------...."

ls -lt

cd target

ls -lt 

cd test-results

ls 

echo "Present working directory is...."
echo "$(pwd)"

cd ../../
echo "Present working directory is.4..."
echo "$(pwd)"

cp -R target spring-boot-sample-unit-test-output

ls -lt

echo "Present working directory is.5..."
echo "$(pwd)"

cd ../
ls -lt 