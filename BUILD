java_test(
    name = "alltests",
    test_class ="bzlexample.maps.PositionTest",
    runtime_deps = [
        "//src/test/java/bzlexample/maps:position_test",
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
    srcs = glob(["src/main/java/bzlexample/*.java"]),
    deps = [
        "//src/main/java/bzlexample/maps:maps",
        "//src/main/java/bzlexample/rover:rover",
    ]
)

java_binary(
    name = "myapp",
    main_class = "bzlexample.Main",
    visibility = ["//visibility:public"],
    runtime_deps = [":main"],
    # 下面的属性与 main_class 任选其一，以标明程序入口。
    # deploy_manifest_lines = ["Main-Class: bzlexample.Main"]
)
