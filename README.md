# AndroidUtils
## 收藏工作中常用的android工具类,lib库等...都是非常优秀的库!<br>开发必备神器!!! 持续更新...欢迎收藏Star...<br>
****
## 目录
* [lib库](#lib库)  
   * [网络请求](#网络请求)
   * [图片加载框架](#图片加载框架)
   * [图片选择器](#图片选择器)
   * [缓存框架](#缓存框架)
   * [数据库](#数据库)
   * [权限管理](#权限管理)
   * [工具类大全](#工具类)
   * [轮播图](#轮播图)
   * [状态栏相关](#状态栏相关)
   * [二维码](#二维码)
   * [屏幕适配](#屏幕适配)
   * [下拉刷新](#下拉刷新)
   * [视频播放](#视频播放)
   * [自定义控件](#自定义控件)
  
****

### lib库
-----------
#### 网络请求

|#| 名称 | 简介  | 
|---------|------------|:---------------:|
|1|[okhttp-OkGo][4]|OkHttpUtils-2.0.0 升级后改名 OkGo，全新完美支持RxJava，比Retrofit更简单易用。该库是封装了okhttp的标准RESTful风格的网络框架，支持大文件上传下载，上传进度回调，下载进度回调，表单上传（多文件和多参数一起上传），链式调用，可以自定义返回对象，支持Https和自签名证书，支持超时自动重连，支持cookie的持久化和自动管理，支持五种缓存模式缓存网络数据，支持301和302重定向，扩展了统一的上传管理和下载管理功能|
|2|[Retrofit][5]|star超`2w`|
|3|[okhttp-utils][20]|鸿神的okhttp的辅助类|

#### 图片加载框架

|#| 名称 | 简介  | 
|----|------------|:---------------:|
|1|[glide][9]|star超`14k`|
|2|[Picasso][10]|star超`13k`|
|2|[Fresco][11]|star超`12k`|

#### 图片选择器

|#| 名称 | 简介  | 
|----|------------|:---------------:|
|1|[ImagePicker][14]|完全仿微信的图片选择，并且提供了多种图片加载接口，选择图片后可以旋转，可以裁剪成矩形或圆形，可以配置各种其他的参数|
|2|[PictureSelector][15]|android多图选择器 图片/视频 单选or多选，以及视频录制|

#### 缓存框架

|#| 名称 | 简介  | 
|----|------------|:---------------:|
|1|[DiskLruCache][12]|[Android：跟着实战项目学缓存策略之DiskLruCache详谈][13]|


#### 数据库

|#| 名称 | 简介  | 
|----|------------|:---------------:|
|1|[greenDAO][7]|star超`7k`,存取速度快,支持数据库加密,轻量级,支持缓存,代码自动生成|
|2|[LitePal][18]|郭神的LitePal|


#### 权限管理

|#| 名称 | 简介  | 
|----|------------|:---------------:|
|1|[AndPermission][8]|安卓权限请求库|


#### 工具类

|#| 名称 | 简介  | 
|----|------------|:---------------:|
|1|[Android工具类库][1]|star超`1k`|
|2|[Android开发人员不得不收集的代码][2]|常用工具类,star超`9k`|
|3|[logger][3]|优秀的log打印库|
|4|[Luban][26]|Luban（鲁班） —— Android图片压缩工具，仿微信朋友圈压缩策略。|
|5|[ShareUtil][28]|ShareUtil是一个综合性的分享及登录工具库，支持微信分享，微博分享，QQ分享，QQ空间分享以及Android系统默认分享，支持微信登录，微博登录以及QQ登录并获取用户信息。|
|6|[baseAdapter][32]|Android 万能的Adapter for ListView,RecyclerView,GridView等，支持多种Item类型的情况。|
|7|[butterknife][33]|JakeWharton大神的强大的注解库|

#### 轮播图

|#| 名称 | 简介  | 
|---------|------------|:---------------:|
|1|[banner][6]|Android广告图片轮播控件，支持无限循环和多种主题，可以灵活设置轮播样式、动画、轮播和切换时间、位置、图片加载框架等!| 
|2|[BGABanner-Android][22]|引导界面滑动导航 + 大于等于1页时无限轮播 + 各种切换动画轮播效果| 


#### 状态栏相关

|#| 名称 | 简介  | 
|---------|------------|:---------------:|
|1|[沉浸式状态栏][0]|![](https://github.com/H07000223/FlycoSystemBar/blob/master/art/5.0.gif)|  


#### 二维码

|#| 名称 | 简介  | 
|---------|------------|:---------------:|
|1|[BGAQRCode-Android][17]|QRCode 扫描二维码、扫描条形码、相册获取图片后识别、生成带 Logo 二维码、支持微博微信 QQ 二维码扫描样式|  

#### 屏幕适配

|#| 名称 | 简介  | 
|---------|------------|:---------------:|
|1|[AndroidAutoLayout][19]|Android屏幕适配方案，直接填写设计图上的像素尺寸即可完成适配，最大限度解决适配问题。|  

#### 下拉刷新

|#| 名称 | 简介  | 
|---------|------------|:---------------:|
|1|[BGARefreshLayout-Android][16]|多种下拉刷新效果、上拉加载更多、可配置自定义头部广告位| 
|2|[android-Ultra-Pull-To-Refresh][29]|这是现在已经停止维护的下拉刷新项目的替代方案。继承于ViewGroup可以包含任何View。功能比SwipeRefreshLayout强大。使用起来非常简单。良好的设计，如果你想定制自己的UI样式，非常简单，就像给ListView加一个Header View那么简单。支持 API LEVEL >= 8。<br>![](https://camo.githubusercontent.com/9033435ad82be43ccddc8203450f361ee270c724/687474703a2f2f737261696e2d6769746875622e71696e6975646e2e636f6d2f756c7472612d7074722f70756c6c2d746f2d726566726573682e676966)| 

#### 视频播放

|#| 名称 | 简介  | 
|---------|------------|:---------------:|
|1|[PreviewSeekBar][27]|![](https://github.com/rubensousa/PreviewSeekBar/raw/master/screenshots/playmovies.gif)| 


#### 自定义控件

|#| 名称 | 简介  | 
|---------|------------|:---------------:|
|1|[BGABadgeView-Android][21]|Android 徽章控件 ![](https://cloud.githubusercontent.com/assets/8949716/17483429/8f5ab3aa-5db8-11e6-808c-6033f5d5c4ec.gif)|  
|2|[LQREmojiLibrary][23]|一个超级牛逼的表情库，可使用表情及贴图功能，方便好用，抽离图片加载接口，图片加载工具可让开发者自己选择。<br>![](https://github.com/GitLqr/LQREmojiLibrary/raw/master/screenshots/1.gif)| 
|3|[LQRAudioRecord][24]|集成录音与播音功能，使用简单方便![](https://github.com/GitLqr/LQRAudioRecord/raw/master/screenshots/1.gif)| 
|4|[LQRNineGridImageView][25]|仿微信群头像九宫格控件 <br>![](https://github.com/GitLqr/LQRNineGridImageView/raw/master/screenshots/1.png)| 
|5|[MagicIndicator][30]|强大、可定制、易扩展的 ViewPager 指示器框架。是ViewPagerIndicator、TabLayout、PagerSlidingTabStrip的最佳替代品。支持角标，更支持在非ViewPager场景下使用（使用hide()、show()切换Fragment或使用setVisibility切换FrameLayout里的View等 <br>![](https://github.com/hackware1993/MagicIndicator/raw/master/magicindicator.gif)| 
|6|[SmartTabLayout][31]|![](https://raw.githubusercontent.com/ogaclejapan/SmartTabLayout/master/art/demo3.gif)| 
|7|[PagerSlidingTabStrip][34]|![](https://raw.githubusercontent.com/jpardogo/PagerSlidingTabStrip/master/art/material_tabs.gif)| 










[0]: https://github.com/H07000223/FlycoSystemBar
[1]: https://github.com/jingle1267/android-utils
[2]: https://github.com/Blankj/AndroidUtilCode/blob/master/README-CN.md
[3]: https://github.com/orhanobut/logger
[4]: https://github.com/jeasonlzy/okhttp-OkGo
[5]: https://github.com/square/retrofit
[6]: https://github.com/youth5201314/banner
[7]: https://github.com/greenrobot/greenDAO
[8]: https://github.com/yanzhenjie/AndPermission
[9]: https://github.com/bumptech/glide
[10]: https://github.com/square/picasso
[11]: https://github.com/facebook/fresco
[12]: https://github.com/JakeWharton/DiskLruCache
[13]: http://www.jianshu.com/p/4320597ebd7e
[14]: https://github.com/jeasonlzy/ImagePicker
[15]: https://github.com/LuckSiege/PictureSelector
[16]: https://github.com/bingoogolapple/BGARefreshLayout-Android
[17]: https://github.com/bingoogolapple/BGAQRCode-Android
[18]: https://github.com/LitePalFramework/LitePal
[19]: https://github.com/hongyangAndroid/AndroidAutoLayout
[20]: https://github.com/hongyangAndroid/okhttputils
[21]: https://github.com/bingoogolapple/BGABadgeView-Android
[22]: https://github.com/bingoogolapple/BGABanner-Android
[23]: https://github.com/GitLqr/LQREmojiLibrary
[24]: https://github.com/GitLqr/LQRAudioRecord
[25]: https://github.com/GitLqr/LQRNineGridImageView
[26]: https://github.com/Curzibn/Luban
[27]: https://github.com/rubensousa/PreviewSeekBar
[28]: https://github.com/shaohui10086/ShareUtil
[29]: https://github.com/liaohuqiu/android-Ultra-Pull-To-Refresh/blob/master/README-cn.md
[30]: https://github.com/hackware1993/MagicIndicator
[31]: https://github.com/ogaclejapan/SmartTabLayout
[32]: https://github.com/hongyangAndroid/baseAdapter
[33]: https://github.com/JakeWharton/butterknife
[34]: https://github.com/jpardogo/PagerSlidingTabStrip
[35]: https://github.com/ogaclejapan/SmartTabLayout
[36]: https://github.com/ogaclejapan/SmartTabLayout
[37]: https://github.com/ogaclejapan/SmartTabLayout
[38]: https://github.com/ogaclejapan/SmartTabLayout
[39]: https://github.com/ogaclejapan/SmartTabLayout
[40]: https://github.com/ogaclejapan/SmartTabLayout
[41]: https://github.com/ogaclejapan/SmartTabLayout


