# StatusBar

## 特此鸣谢	[jgilfelt/SystemBarTint](https://github.com/jgilfelt/SystemBarTint)

本类库是基于上文的类进行了相应的一些内容处理，所以特此感谢此的作者！

## 使用方式和效果图

1. 配置根目录的build.gradle
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

2. 配置app module的build.gradle
```
	dependencies {
		implementation 'com.github.User:Repo:Tag'
	}
```

3. 效果与代码实现

```
StatusBarUtil.setTranslucentStatus(this);
```
![Drawer使用的效果图1](https://github.com/AngleLong/StatusBar/blob/master/images/device-2018-12-01-172227.png)

![Drawer使用的效果图2](https://github.com/AngleLong/StatusBar/blob/master/images/device-2018-12-01-172257.png)


```
StatusBarUtil.setTranslucentStatus(this);
```

![顶部图片使用的效果图](https://github.com/AngleLong/StatusBar/blob/master/images/device-2018-12-01-172314.png)

```
StatusBarUtil.setStatusBarColor(this, "#D81B60");
```

![指定顶部状态栏颜色的效果图](https://github.com/AngleLong/StatusBar/blob/master/images/device-2018-12-01-172337.png)


```
StatusBarUtil.setStatusBarMode(this, true, "#ffffff");
```

![状态栏文字修改的效果图](https://github.com/AngleLong/StatusBar/blob/master/images/device-2018-12-01-172358.png)

关于修改状态栏文字颜色这里说明一些问题：
1. 因为在4.0~6.0的部分手机是无法修改状态栏文字的颜色的，所以这里我是在你传入的相应颜色上添加了10%的透明度；
2. 一般只有在状态栏比较浅（接近于白色的时候才会把状态栏的文字修改成深色）；
3. 如果对10%的蒙层不是很满意，请修改StatusBarUtil的96行处的内容。

## 本人联系方式
> 具体内容请参阅代码，以上代码都来源于网络。作者只是站在巨人的肩膀上进行处理。

[简书地址](https://www.jianshu.com/u/4a99c9554afc)

[掘金地址](https://juejin.im/user/5ad0c6a45188257ddb100ae6)

[csdn地址](https://blog.csdn.net/qq_15538877)

欢迎骚扰。。。