java_library(
    name = "maps",
    srcs = glob(["src/main/java/huoxingche/maps/*.java"]),
)

java_library(
    name = "position_test",
    srcs = ["src/test/java/huoxingche/maps/PositionTest.java"],
    deps =[
        ":java_test_deps",
        ":maps"
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

java_library(
    name = "rover",
    srcs = glob(["src/main/java/huoxingche/rover/*.java"]),
    deps = [
        ":maps",
    ]
)

java_library(
    name = "main",
    srcs = glob(["src/main/java/huoxingche/*.java"]),
    deps = [
        ":maps",
        ":rover",
    ]
)