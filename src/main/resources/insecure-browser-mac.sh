#!/bin/bash
rm /Users/astondeveloper/sslkeyfile
export SSLKEYLOGFILE=/Users/astondeveloper/sslkeyfile
env | grep SSLKEY

pid=$(ps -ae | grep firefox | grep -v grep | awk '{print $1}')
echo $pid
if [[ -z $pid ]]; then
        echo "firefox not running... starting now"
        open /Applications/Firefox.app $1
else
        echo "firefox is currently running  ...stopping"
        kill $pid
        echo "starting new instance of firefox now"
        open /Applications/Firefox.app $1
fi
