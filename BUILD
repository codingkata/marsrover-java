java_library(
    name = "Main",
    srcs = glob(["src/main/java/huoxingche/**/*.java"]),
)

java_library(
    name = "position_test",
    srcs = ["src/test/java/huoxingche/maps/PositionTest.java"],
    deps =[
        ":java_test_deps",
        ":Main"
    ],
)

java_test(
    name = "alltests",
    test_class ="huoxingche.maps.PositionTest",
    runtime_deps = [
        ":position_test",
    ],
)


java_library(
    name = "java_test_deps",
    exports = [
        "@maven//:junit_junit",
        "@maven//:org_hamcrest_hamcrest_library",
    ],
)
