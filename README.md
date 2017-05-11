# AndroidUtils
> 本来是打算收藏工具类的,但转念一想,已经有这么多优秀的库了,就没必要再去重复造轮子了,便归纳工作中比较实用的库吧,不用在花精力去找了,也非常欢迎各位和我一起维护!<br>
简书: http://www.jianshu.com/u/a6650fb638c8
## 收藏工作中常用的android工具类,lib库等...都是非常优秀的库!<br>开发必备神器!!! 持续更新...欢迎收藏Star...<br>
****
## 目录
* [收藏网站](#收藏网站)
* [lib库](#lib库)  
   * [网络请求](#网络请求)
   * [图片相关](#图片相关)
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
### 收藏网站
-----------

| 名称 | 简介  | 
|------------|---------------|
|[free-programming-books-zh_CN][62]|免费的计算机编程类书籍(中文版)|
|[Android Studio插件整理][63]|使用好Android Studio插件能大量的减少我们的工作量。|
|[极客导航][64]|程序员自己的导航!|


### lib库
-----------
#### 网络请求

| 名称 | 简介  | 
|------------|---------------|
|[okhttp-OkGo][4]|OkHttpUtils-2.0.0 升级后改名 OkGo，全新完美支持RxJava，比Retrofit更简单易用。该库是封装了okhttp的标准RESTful风格的网络框架，支持大文件上传下载，上传进度回调，下载进度回调，表单上传（多文件和多参数一起上传），链式调用，可以自定义返回对象，支持Https和自签名证书，支持超时自动重连，支持cookie的持久化和自动管理，支持五种缓存模式缓存网络数据，支持301和302重定向，扩展了统一的上传管理和下载管理功能|
|[Retrofit][5]|star超`2w`|
|[okhttp-utils][20]|鸿神的okhttp的辅助类|



#### 图片相关

| 名称 | 简介  | 
|------------|---------------|
|[glide][9]|Google员工私人项目，Google很多项目在用。picasso能做到的它都能做到，并且还支持gif.关于Glide和Picasso这篇译文有一个比较详细的对比介绍 [Glide VS Picasso][53]|
|[Picasso][10]|这个是square 开源的一个强大的图片下载和缓存库。很受欢迎，许多项目都有在使用这个库。使用方式也很简单。[PicassoUtil][72]|
|[Fresco][11]|这个是FaceBook的开源项目，链接中有中文的详细文档。这个库除了支持的图片格式很广泛外，最大的特性就是在内存优化这块，使用这个库能有效防止OOM情况的出现。|
|[ImagePicker][14]|完全仿微信的图片选择，并且提供了多种图片加载接口，选择图片后可以旋转，可以裁剪成矩形或圆形，可以配置各种其他的参数|
|[PictureSelector][15]|android多图选择器 图片/视频 单选or多选，以及视频录制|
|[Matisse][52]|知乎开源图片选择器,支持主题切换|
|[CircleImageView][67]|一个使用很广泛的圆形图片库<br> ![](https://camo.githubusercontent.com/e17a2a83e3e205a822d27172cb3736d4f441344d/68747470733a2f2f7261772e6769746875622e636f6d2f68646f64656e686f662f436972636c65496d616765566965772f6d61737465722f73637265656e73686f742e706e67)|



#### 缓存框架

| 名称 | 简介  | 
|------------|---------------|
|[DiskLruCache][12]|[Android：跟着实战项目学缓存策略之DiskLruCache详谈][13]|


#### 数据库

| 名称 | 简介  | 
|------------|---------------|
|[greenDAO][7]|star超`7k`,存取速度快,支持数据库加密,轻量级,支持缓存,代码自动生成|
|[LitePal][18]|郭神的LitePal|


#### 权限管理

| 名称 | 简介  | 
|------------|---------------|
|[AndPermission][8]|安卓权限请求库[ Android 6.0 运行时权限管理最佳实践][60]|


#### 工具类

| 名称 | 简介  | 
|------------|---------------|
|[Android Design Support Library][57]|这个并不是一个第三方库，是谷歌官方出的支持库,[demo地址][56]|
|[Android工具类库][1]|star超`1k`|
|[Android开发人员不得不收集的代码][2]|常用工具类,超详细,star超`9k`|
|[logger][3]|优秀的log打印库|
|[Luban][26]|Luban（鲁班） —— Android图片压缩工具，仿微信朋友圈压缩策略。|
|[gson][58]|Google的  [GsonUtil][61]|
|[Fastjson][59]|阿里的 |
|[butterknife][33]|这个开源库可以让我们从大量的findViewById()和setOnclicktListener()解放出来，其对性能的影响微乎其微，其自定义注解的实现都是限定为RetentionPolicy.CLASS，也就是注解到编译出.class文件为止有效，在运行时不额外消耗性能。这个库在Android Studio上配合[android-butterknife-zelezny][54]使用更酸爽！|
|[vlayout][70]|阿里出品的基础 UI 框架，用于快速实现页面的复杂布局，在手机天猫 Android版 内广泛使用. [相关博客][71]<br>![](https://camo.githubusercontent.com/2b947a15f5502af5a4639a5927d68052ccfb54a3/687474703a2f2f696d67332e746263646e2e636e2f4c312f3436312f312f31623962666234323030393034376637356365653038616537343135303564653263373461633061)|
|[baseAdapter][32]|Android 万能的Adapter for ListView,RecyclerView,GridView等，支持多种Item类型的情况。|
|[BaseRecyclerViewAdapterHelper][36]| * 优化Adapter代码（减少百分之70%代码 <br> * 添加点击item点击、长按事件、以及item子控件的点击事件 <br> * 添加加载动画（一行代码轻松切换5种默认动画） <br> * 添加头部、尾部、下拉刷新、上拉加载（感觉又回到ListView时代）<br> * 设置自定义的加载更多布局添加分组（随心定义分组头部）<br> * 自定义不同的item类型（简单配置、无需重写额外方法） <br> * 设置空布局（比Listview的setEmptyView还要好用！） <br> * 添加拖拽item |
|[Fragmentation][37]|为"单Activity ＋ 多Fragment","多模块Activity + 多Fragment"架构而生，帮你大大简化使用过程，轻松解决各种复杂嵌套等问题，修复了官方Fragment库中存在的一些BUG。<br>![](https://github.com/YoKeyword/Fragmentation/raw/master/gif/wechat.gif)|
|[Material-Animations][50]|![](https://raw.githubusercontent.com/lgvalle/Material-Animations/master/screenshots/transition_explode.gif)|
|[RxJava][39]|[给 Android 开发者的 RxJava 详解][69]|
|[ShareUtil][28]|ShareUtil是一个综合性的分享及登录工具库，支持微信分享，微博分享，QQ分享，QQ空间分享以及Android系统默认分享，支持微信登录，微博登录以及QQ登录并获取用户信息。|
|[packer-ng-plugin][66]|下一代Android打包工具，100个渠道包只需要10秒钟|
|[leakcanary][49]|检测app内存泄露|

#### 轮播图

| 名称 | 简介  | 
|------------|---------------|
|[banner][6]|Android广告图片轮播控件，支持无限循环和多种主题，可以灵活设置轮播样式、动画、轮播和切换时间、位置、图片加载框架等!| 
|[BGABanner-Android][22]|引导界面滑动导航 + 大于等于1页时无限轮播 + 各种切换动画轮播效果| 


#### 状态栏相关

| 名称 | 简介  | 
|------------|---------------|
|[沉浸式状态栏][0]|![](https://github.com/H07000223/FlycoSystemBar/blob/master/art/5.0.gif)|  


#### 二维码

| 名称 | 简介  | 
|------------|--------------|
|[BGAQRCode-Android][17]|QRCode 扫描二维码、扫描条形码、相册获取图片后识别、生成带 Logo 二维码、支持微博微信 QQ 二维码扫描样式|
|[barcodescanner][68]|一个基于ZXing和ZBar的容易使用和扩展的条形码扫描库|  

#### 屏幕适配

| 名称 | 简介  | 
|------------|--------------|
|[AndroidAutoLayout][19]|Android屏幕适配方案，直接填写设计图上的像素尺寸即可完成适配，最大限度解决适配问题。|  

#### 下拉刷新

| 名称 | 简介  | 
|------------|--------------|
|[BGARefreshLayout-Android][16]|多种下拉刷新效果、上拉加载更多、可配置自定义头部广告位| 
|[android-Ultra-Pull-To-Refresh][29]|这是现在已经停止维护的下拉刷新项目的替代方案。继承于ViewGroup可以包含任何View。功能比SwipeRefreshLayout强大。使用起来非常简单。良好的设计，如果你想定制自己的UI样式，非常简单，就像给ListView加一个Header View那么简单。支持 API LEVEL >= 8。<br>![](https://camo.githubusercontent.com/9033435ad82be43ccddc8203450f361ee270c724/687474703a2f2f737261696e2d6769746875622e71696e6975646e2e636f6d2f756c7472612d7074722f70756c6c2d746f2d726566726573682e676966)| 

#### 视频播放

| 名称 | 简介  | 
|------------|---------------|
|[PreviewSeekBar][27]|![](https://github.com/rubensousa/PreviewSeekBar/raw/master/screenshots/playmovies.gif)| 
|[JieCaoVideoPlayer][35]|![](https://github.com/lipangit/JieCaoVideoPlayer/releases/download/v5.3/j9.jpg)| 
|[SuperPlayer][40]|SuperPlayer 是一个基于IjkPlayer的控制器，支持手势操作，滑动快进，快退，支持，上滑音量亮度的变化，支持指点位置播放，播放源的切换| 
|[jjdxm_ijkplayer][42]|基于ijkplayer简单的UI界面 当前项目是基于ijkplayer项目进行的播放器界面UI封装。 是一个适用于 Android 的 RTMP 播放界面 SDK，可高度定制化和二次开发。特色是同时支持 H.264 软编／硬编和 AAC 软编／硬编。主要是支持RIMP、HLS、MP4、M4A等视频格式的播放。<br>![](https://raw.githubusercontent.com/jjdxmashl/jjdxm_ijkplayer/master/screenshots/icon01.gif)| 


#### 自定义控件

| 名称 | 简介  | 
|------------|---------------|
|[PullZoomView][65]|![](https://raw.githubusercontent.com/Frank-Zhu/PullZoomView/master/art/pull-to-zoom.gif)| 
|[BGABadgeView-Android][21]|Android 徽章控件 ![](https://cloud.githubusercontent.com/assets/8949716/17483429/8f5ab3aa-5db8-11e6-808c-6033f5d5c4ec.gif)|  
|[LQREmojiLibrary][23]|一个超级牛逼的表情库，可使用表情及贴图功能，方便好用，抽离图片加载接口，图片加载工具可让开发者自己选择。<br>![](https://github.com/GitLqr/LQREmojiLibrary/raw/master/screenshots/1.gif)| 
|[LQRAudioRecord][24]|集成录音与播音功能，使用简单方便!<br>![](https://github.com/GitLqr/LQRAudioRecord/raw/master/screenshots/1.gif)| 
|[LQRNineGridImageView][25]|仿微信群头像九宫格控件 <br>![](https://github.com/GitLqr/LQRNineGridImageView/raw/master/screenshots/1.png)| 
|[MagicIndicator][30]|强大、可定制、易扩展的 ViewPager 指示器框架。是ViewPagerIndicator、TabLayout、PagerSlidingTabStrip的最佳替代品。支持角标，更支持在非ViewPager场景下使用（使用hide()、show()切换Fragment或使用setVisibility切换FrameLayout里的View等 <br>![](https://github.com/hackware1993/MagicIndicator/raw/master/magicindicator.gif)| 
|[SmartTabLayout][31]|![](https://raw.githubusercontent.com/ogaclejapan/SmartTabLayout/master/art/demo3.gif)<br>![](https://raw.githubusercontent.com/ogaclejapan/SmartTabLayout/master/art/demo4.gif)| 
|[PagerSlidingTabStrip][34]|![](https://raw.githubusercontent.com/jpardogo/PagerSlidingTabStrip/master/art/material_tabs.gif)| 
|[NavigationTabStrip][43]|![](https://camo.githubusercontent.com/7ead597346be3b6ae76d307ae7891d12b766f2ab/68747470733a2f2f64726976652e676f6f676c652e636f6d2f75633f6578706f72743d646f776e6c6f61642669643d304278504f5f55655337775363523346554e5452765331424a654545)| 
|[NavigationTabBar][45]|![](https://camo.githubusercontent.com/0875dc014d4ff27c9b009791bdecf2d53db98f4c/68747470733a2f2f64726976652e676f6f676c652e636f6d2f75633f6578706f72743d646f776e6c6f61642669643d304278504f5f55655337775363546d6879516c395259564979554645)| 
|[XhsEmoticonsKeyboard][38]|API > 9,表情键盘支持无闪烁自跟随系统软键盘高度,及支持自定义高度,表情支持自定义格式,支持任意来源组件支持完全自定义,样式支持任意更改支持全屏默认微信键盘样式赠QQ键盘高仿,不谢<br>![](https://github.com/w446108264/XhsEmoticonsKeyboard/raw/master/output/show.gif)| 
|[NineGridView][41]|类似QQ空间，微信朋友圈，微博主页等，展示图片的九宫格控件，自动根据图片的数量确定图片大小和控件大小，使用Adapter模式设置图片，对外提供接口回调，使用接口加载图片,支持任意的图片加载框架,如 Glide,ImageLoader,Fresco,xUtils3,Picasso 等，支持点击图片全屏预览大图。<br>![](https://github.com/jeasonlzy/Screenshots/raw/master/NineGridView/demo10.gif)| 
|[ToggleButton][44]|![](https://github.com/zcweng/SwitchButton/raw/master/21879.gif)| 
|[JellyToggleButton][48]|![](https://github.com/Nightonke/JellyToggleButton/raw/master/img/JellyToggleButton4.gif?raw=true)| 
|[GoodView][47]|Android点赞+1效果，支持文本和图像<br> ![](https://github.com/venshine/GoodView/raw/master/screenshot/screenshot.gif)| 
|[Android-ObservableScrollView][46]|![](https://raw.githubusercontent.com/ksoichiro/Android-ObservableScrollView/master/samples/images/demo12.gif) ![](https://raw.githubusercontent.com/ksoichiro/Android-ObservableScrollView/master/samples/images/demo10.gif) ![](https://raw.githubusercontent.com/ksoichiro/Android-ObservableScrollView/master/samples/images/demo13.gif)| 
|[android-pickers][55]|安卓选择器类库，包括日期及时间选择器（可设置范围）、单项选择器（可用于性别、职业、学历、星座等）、城市地址选择器（分省级、地级及县级）、数字选择器（可用于年龄、身高、体重、温度等）等……可以切换不同的模式（目前有普通模式，3d滚轮模式）  <br>![](https://github.com/addappcn/android-pickers/raw/master/screenshots/Screenshot_2017-04-21-15-45-59.png)| 
|[XCL-Charts][51]|Android图表库(XCL-Carts is a free charting library for Android platform.),基于Android Canvas来绘制各种图表,使用简便,定制灵活。目前支持3D/非3D/背向式/横向/竖向柱形图(Bar Chart)、3D/非3D饼图(Pie Chart)、堆叠图(Stacked Bar Chart)、面积图(Area Chart)、 折线图(Line Chart)、曲线图(Spline Chart)、环形图(Dount Chart)、南丁格尔玫瑰图(Rose Chart)、仪表盘(Dial Chart)、刻度盘(Gauge Chart)、雷达图(Radar Chart)、漏斗图(Funnel Chart)、圆形图(Cir…)| 






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
[35]: https://github.com/lipangit/JieCaoVideoPlayer
[36]: https://github.com/CymChad/BaseRecyclerViewAdapterHelper
[37]: https://github.com/YoKeyword/Fragmentation
[38]: https://github.com/w446108264/XhsEmoticonsKeyboard
[39]: https://github.com/ReactiveX/RxJava
[40]: https://github.com/Haxine/SuperPlayer
[41]: https://github.com/jeasonlzy/NineGridView
[42]: https://github.com/jjdxmashl/jjdxm_ijkplayer
[43]: https://github.com/Devlight/NavigationTabStrip
[44]: https://github.com/zcweng/SwitchButton
[45]: https://github.com/Devlight/NavigationTabBar
[46]: https://github.com/ksoichiro/Android-ObservableScrollView
[47]: https://github.com/venshine/GoodView
[48]: https://github.com/Nightonke/JellyToggleButton
[49]: https://github.com/square/leakcanary
[50]: https://github.com/lgvalle/Material-Animations
[51]: https://github.com/xcltapestry/XCL-Charts
[52]: https://github.com/zhihu/Matisse
[53]: http://jcodecraeer.com/a/anzhuokaifa/androidkaifa/2015/0327/2650.html
[54]: https://github.com/avast/android-butterknife-zelezny
[55]: https://github.com/addappcn/android-pickers
[56]: https://github.com/chrisbanes/cheesesquare
[57]: http://www.jcodecraeer.com/a/anzhuokaifa/developer/2015/0531/2958.html?mType=Group
[58]: https://github.com/google/gson
[59]: https://github.com/alibaba/fastjson/wiki/Android%E7%89%88%E6%9C%AC
[60]: http://blog.csdn.net/yanzhenjie1003/article/details/52503533
[61]: https://github.com/Blizzard-liu/AndroidUtils/blob/master/utils/src/main/java/com/example/utils/GsonUtil.java
[62]: https://github.com/justjavac/free-programming-books-zh_CN
[63]: http://www.jianshu.com/p/c76b0d8a642d
[64]: http://www.jikedaohang.com/
[65]: https://github.com/Frank-Zhu/PullZoomView
[66]: https://github.com/mcxiaoke/packer-ng-plugin
[67]: https://github.com/hdodenhof/CircleImageView
[68]: https://github.com/dm77/barcodescanner
[69]: http://gank.io/post/560e15be2dca930e00da1083
[70]: https://github.com/alibaba/vlayout
[71]: http://www.jianshu.com/p/6b658c8802d1
[72]: https://github.com/Blizzard-liu/AndroidUtils/blob/master/utils/src/main/java/com/example/utils/PicassoUtil.java

[73]: https://github.com/google/gson
[74]: https://github.com/google/gson
[75]: https://github.com/google/gson
[76]: https://github.com/google/gson
[77]: https://github.com/google/gson
[78]: https://github.com/google/gson
[79]: https://github.com/google/gson
[80]: https://github.com/google/gson
[81]: https://github.com/google/gson
[82]: https://github.com/google/gson
[83]: https://github.com/google/gson
[84]: https://github.com/google/gson
