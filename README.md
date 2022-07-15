## 在 WORKSPACE 目录下运行

### 构建 maps 的命令

`bazel build //src/main/java/bzlexample/maps:maps`

### 编译 Position_test 的命令

`bazel build :position_test`


### 执行测试用例的命令

`bazel build :alltests`

### 编译 Rover 的命令

`bazel build :rover`

说明：

target `:Rover` 依赖于 targe `//src/main/java/bzlexample/maps:maps`

### 编译 Main 的命令

`bazel build :main`


## Target maps

所有 Target 的依赖图参见 `all-tree.png`.

### 生成 alltests 依赖关系图的命令

`bazel query  --notool_deps --noimplicit_deps "deps(//:all)" --output graph`

### 生成 main 依赖关系图的命令

`bazel query  --notool_deps --noimplicit_deps "deps(//:main)" --output graph`


### 生成 alltests 依赖关系图的命令

`bazel query  --notool_deps --noimplicit_deps "deps(//:alltests)" --output graph`

