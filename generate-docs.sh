#!/bin/sh

javadoc -public -splitindex -use -author -version -d docs $(find . -name "*.java")
