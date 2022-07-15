
## 仅对 WORKSPACE 目录下的 Package 可见
package(default_visibility = ["//:__pkg__"])

java_library(
    name = "rover",
    ################################################
    # 'srcs' 这里一定要注意：
    # 写的文件路径是相对于当前 Package BUILD 文件的相对路径。
    # 如果使用相对于 WORKSPACE 的路径，也可以构建成功，
    # 然而，依赖于它的其它 Package 会找不到其中的Class 
    ################################################
    srcs = glob(["*.java"]),
    deps =[
        "//src/main/java/bzlexample/maps:maps"
    ],
)