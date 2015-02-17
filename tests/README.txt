java TaskSchedulerSim -i in01.txt -o output01.txt
java TaskSchedulerSim -i in02.txt -o output02.txt
java TaskSchedulerSim -i in03.txt -o output03.txt
java TaskSchedulerSim -i in04.txt -o output04.txt
java TaskSchedulerSim -i in05.txt -o output05.txt


diff output01.txt out01.txt
diff output02.txt out02.txt
diff output03.txt out03.txt
diff output04.txt out04.txt
diff output05.txt out05.txt