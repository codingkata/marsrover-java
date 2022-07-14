java_test(
    name = "alltests",
    test_class ="huoxingche.maps.PositionTest",
    runtime_deps = [
        "//src/test/java/huoxingche/maps:position_test",
    ],
)

java_library(
    name = "java_test_lib_deps",
    exports = [
        "@maven//:junit_junit",
        "@maven//:org_hamcrest_hamcrest_library",
    ],
    ## 这是公共的测试 lib ，设置全局可见。
    visibility = ["//visibility:public"],
    
)

java_library(
    name = "main",
    srcs = glob(["src/main/java/huoxingche/*.java"]),
    deps = [
        "//src/main/java/huoxingche/maps:maps",
        "//src/main/java/huoxingche/rover:rover",
    ]
)