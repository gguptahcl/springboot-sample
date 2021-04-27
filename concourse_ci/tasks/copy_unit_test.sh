#!/bin/bash

set -e

echo "copy unit tests...."
cd spring-boot-sample

ls -lt
chmod +x concourse_ci/tasks/copy_unit_test.sh