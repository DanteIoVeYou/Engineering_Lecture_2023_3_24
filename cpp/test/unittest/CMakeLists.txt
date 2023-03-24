cmake_minimum_required(VERSION 3.14.0)
project(cal_unittest)
file(GLOB_RECURSE UNITTEST_FILES ${CMAKE_CURRENT_SOURCE_DIR}/src/*.cpp)
include_directories(
    ../../include
)
add_executable(${PROJECT_NAME} ${UNITTEST_FILES} ${CMAKE_SOURCE_DIR}/src/cal.cpp)
target_link_libraries(${PROJECT_NAME} gtest pthread)
