cmake_minimum_required(VERSION 4.0)
project(TESTEMODELO C)

set(CMAKE_C_STANDARD 11)

add_executable(TESTEMODELO main.c
        frotas.h
        frotas.c)
