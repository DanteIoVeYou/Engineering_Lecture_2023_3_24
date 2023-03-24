#!/usr/bin/env python3
import argparse
import os

if __name__ == "__main__":
    parser = argparse.ArgumentParser()

    parser.add_argument("--build", action="store_true", default=False, help="build project")
    parser.add_argument("--run_unittest", action="store_true", default=False,help="run unittest")

    args = vars(parser.parse_args())

    if(args["build"]):
        print("build project")
        os.system("rm -rf ../build")
        os.system("mkdir ../build")
        os.system("cd ../build;cmake ..;make")
    if(args["run_unittest"]):
        print("run unittests")
        os.system("../build/test/unittest/cal_unittest")




