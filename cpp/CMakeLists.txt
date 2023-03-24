cmake_minimum_required(VERSION 3.14.0)
project(cal)
set(CMAKE_CXX_STANDARD 14)
file(GLOB_RECURSE CPP_FILES ${CMAKE_CURRENT_SOURCE_DIR}/src/*.cpp) 
add_executable(${PROJECT_NAME} ${CPP_FILES})
include_directories(
    ${CMAKE_CURRENT_SOURCE_DIR}/include
)
add_subdirectory(test/unittest)