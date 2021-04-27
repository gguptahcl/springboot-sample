#!/bin/bash

set -e

echo "Starting unit tests in maven test...."
cd spring-boot-sample

ls -lt
chmod +x concourse_ci/tasks/maventest.sh
chmod +x ./mvnw


echo "$(pwd)"

# ./mvnw test --s settings.xml -Dmaven.wagon.http.ssl.insecure=true -Dmaven.wagon.http.ssl.allowall=true -Dmaven.wagon.http.ssl.ignore.validity.dates=true

./mvnw test


cp -R target/test spring-boot-sample-unit-test-output