# AndroidUtils
> 收藏工作中常用的android工具类,lib库等...都是非常优秀的库!<br>开发必备神器!!! 持续更新...欢迎收藏Star...<br>
简书: http://www.jianshu.com/u/a6650fb638c8

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
   * [视频相关](#视频相关)
   * [自定义控件](#自定义控件)
   * [完整项目](#完整项目)
  
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
|[Retrofit][5]|star超`2w` [RxJava 和 Retrofit 结合使用的几个最常见使用方式举例][98]|
|[okhttp-utils][20]|鸿神的okhttp的辅助类|



#### 图片相关

| 名称 | 简介  | 
|------------|---------------|
|[glide][9]|Google员工私人项目，Google很多项目在用。picasso能做到的它都能做到，并且还支持gif.关于Glide和Picasso这篇译文有一个比较详细的对比介绍 [Glide VS Picasso][53]|
|[Picasso][10]|这个是square 开源的一个强大的图片下载和缓存库。很受欢迎，许多项目都有在使用这个库。使用方式也很简单。[PicassoUtil][72]|
|[Fresco][11]|这个是FaceBook的开源项目，链接中有中文的详细文档。这个库除了支持的图片格式很广泛外，最大的特性就是在内存优化这块，使用这个库能有效防止OOM情况的出现。|
|[ImagePicker][14]|完全仿微信的图片选择，并且提供了多种图片加载接口，选择图片后可以旋转，可以裁剪成矩形或圆形，可以配置各种其他的参数<br>![](https://github.com/jeasonlzy/Screenshots/raw/master/ImagePicker/demo2.gif)|
|[PictureSelector][15]|android多图选择器 图片/视频 单选or多选，以及视频录制<br>![](https://github.com/LuckSiege/PictureSelector/raw/master/image/1.jpg)|
|[Matisse][52]|知乎开源图片选择器,支持主题切换<br>![](https://github.com/zhihu/Matisse/raw/master/image/screenshot_zhihu.png)|
|[transferee][92]|一个帮助您完成从缩略图到原图无缝过渡转变的神奇组件<br> ![](https://github.com/Hitomis/transferee/raw/master/preview/transferee_1.gif)|
|[BigImageViewer][93]|基于Subsampling Scale Image View, Fresco, Glide, 和 Picasso的大图加载，支持缩放，可以使用不同的加载库。<br> ![](https://github.com/Piasy/BigImageViewer/raw/master/art/fresco_big_image_viewer_demo.gif)|
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
|[RxPermissions][103]|Android runtime permissions powered by RxJava|


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
|[RxJava][39]|[给 Android 开发者的 RxJava 详解][69]  [RxJava-Android-Samples][102]|
|[MVPArms][104]|Lifecycle handling APIs for Android apps using RxJava|
|[MVPArms][101]|一个整合了大量主流开源项目的 Android Mvp 快速搭建框架|
|[ShareUtil][28]|ShareUtil是一个综合性的分享及登录工具库，支持微信分享，微博分享，QQ分享，QQ空间分享以及Android系统默认分享，支持微信登录，微博登录以及QQ登录并获取用户信息。|
|[update][76]|清晰灵活简单易用的应用更新库<br>![](https://github.com/czy1121/update/raw/master/screenshot4.png)|
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
|[android-Ultra-Pull-To-Refresh][29]|这是现在已经停止维护的下拉刷新项目的替代方案。继承于ViewGroup可以包含任何View。功能比SwipeRefreshLayout强大。使用起来非常简单。良好的设计，如果你想定制自己的UI样式，非常简单，就像给ListView加一个Header View那么简单。支持 API LEVEL >= 8。[android-Ultra-Pull-To-Refresh/SwipeRefreshLayout嵌套ViewPager/ScrollView滑动冲突解决][74]<br>![](https://camo.githubusercontent.com/9033435ad82be43ccddc8203450f361ee270c724/687474703a2f2f737261696e2d6769746875622e71696e6975646e2e636f6d2f756c7472612d7074722f70756c6c2d746f2d726566726573682e676966)| 

#### 视频相关

| 名称 | 简介  | 
|------------|---------------|
|[PreviewSeekBar][27]|![](https://github.com/rubensousa/PreviewSeekBar/raw/master/screenshots/playmovies.gif)| 
|[AndroidVideoPlayer][95]|![](https://raw.githubusercontent.com/xiongwei-git/AndroidVideoPlayer/master/img/Screenshot_20151028-195113.png)| 
|[UniversalVideoView][96]|![](https://github.com/linsea/UniversalVideoView/raw/master/screenshot/screen1.png)| 
|[easy-video-player][94]|<一个使用非常简单的视频播放器。基于原生的MediaPlayer API，支持本地和远程视频。br>![](https://raw.githubusercontent.com/afollestad/easy-video-player/master/art/showcase2.png)| 
|[JieCaoVideoPlayer][35]|![](https://github.com/lipangit/JieCaoVideoPlayer/releases/download/v5.3/j9.jpg)| 
|[SuperPlayer][40]|SuperPlayer 是一个基于IjkPlayer的控制器，支持手势操作，滑动快进，快退，支持，上滑音量亮度的变化，支持指点位置播放，播放源的切换<br>![](http://www.jcodecraeer.com/uploads/160926/1-16092610135M20.gif)| 
|[jjdxm_ijkplayer][42]|基于ijkplayer简单的UI界面 当前项目是基于ijkplayer项目进行的播放器界面UI封装。 是一个适用于 Android 的 RTMP 播放界面 SDK，可高度定制化和二次开发。特色是同时支持 H.264 软编／硬编和 AAC 软编／硬编。主要是支持RIMP、HLS、MP4、M4A等视频格式的播放。<br>![](https://raw.githubusercontent.com/jjdxmashl/jjdxm_ijkplayer/master/screenshots/icon01.gif)| 
|[ijkplayer][78]|Ijkplayer 是Bilibili发布的基于 FFplay 的轻量级 Android/iOS 视频播放器。实现了跨平台功能，API 易于集成；编译配置可裁剪，方便控制安装包大小；支持硬件加速解码，更加省电；提供 Android 平台下应用弹幕集成的解决方案。| 
|[GSYVideoPlayer][81]|视频播放器（IJKplayer），HTTPS支持，支持弹幕，支持基本的拖动，声音、亮度调节，支持边播边缓存，支持视频本身自带rotation的旋转（90,270之类），重力旋转与手动旋转的同步支持，支持列表播放 ，直接添加控件为封面，列表全屏动画，视频加载速度，列表小窗口支持拖动，5.0的过场效果，调整比例，多分辨率切换，支持切换播放器，进度条小窗口预览，其他一些小动画效果<br>![](https://github.com/CarGuo/GSYVideoPlayer/raw/master/01.gif)| 
|[WeiXinRecordedDemo][80]|仿微信视频拍摄UI, 基于ffmpeg的视频录制编辑<br>![](http://upload-images.jianshu.io/upload_images/2582948-06a1126d949b92b6.gif?imageMogr2/auto-orient/strip)| 






#### 自定义控件

| 名称 | 简介  | 
|------------|---------------|
|[PullZoomView][65]|![](https://raw.githubusercontent.com/Frank-Zhu/PullZoomView/master/art/pull-to-zoom.gif)| 
|[BGABadgeView-Android][21]|Android 徽章控件 ![](https://cloud.githubusercontent.com/assets/8949716/17483429/8f5ab3aa-5db8-11e6-808c-6033f5d5c4ec.gif)|  
|[SlantedTextView][79]|一个倾斜的TextView,适用于标签效果。<br>![](https://github.com/HeZaiJin/SlantedTextView/raw/master/screen_shot/screenshot.png)|  
|[LQREmojiLibrary][23]|一个超级牛逼的表情库，可使用表情及贴图功能，方便好用，抽离图片加载接口，图片加载工具可让开发者自己选择。<br>![](https://github.com/GitLqr/LQREmojiLibrary/raw/master/screenshots/1.gif)| 
|[LQRAudioRecord][24]|集成录音与播音功能，使用简单方便!<br>![](https://github.com/GitLqr/LQRAudioRecord/raw/master/screenshots/1.gif)| 
|[LQRNineGridImageView][25]|仿微信群头像九宫格控件 <br>![](https://github.com/GitLqr/LQRNineGridImageView/raw/master/screenshots/1.png)| 
|[AlphaTabsIndicator][75]|高仿微信底部状态栏的轻量级库，没有MagicIndicator那么臃肿，符合大多数BottomTabBar应用设计需求 <br>![](https://github.com/yingLanNull/AlphaTabsIndicator/raw/master/show/show.gif)| 
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
|[ExpandableTextView][100]|ExpandableTextView 是一个让你轻松实现“展开收起（expand/collapse）功能的控件 <br> ![](https://github.com/Manabu-GT/ExpandableTextView/raw/master/art/readme_demo.gif?raw=true)|  
|[TimePickerDialog][73]|Android时间选择器，支持年月日时分，年月日，年月，月日时分，时分格式，可以设置最小时间和最大时间（精确到分）<br> ![](https://github.com/JZXiang/PickerView/raw/master/preview/timepickerdialog_demo.gif)| 
|[android-pickers][55]|安卓选择器类库，包括日期及时间选择器（可设置范围）、单项选择器（可用于性别、职业、学历、星座等）、城市地址选择器（分省级、地级及县级）、数字选择器（可用于年龄、身高、体重、温度等）等……可以切换不同的模式（目前有普通模式，3d滚轮模式）  <br>![](https://github.com/addappcn/android-pickers/raw/master/screenshots/Screenshot_2017-04-21-15-45-59.png)| 
|[Android-ObservableScrollView][46]|![](https://raw.githubusercontent.com/ksoichiro/Android-ObservableScrollView/master/samples/images/demo12.gif) ![](https://raw.githubusercontent.com/ksoichiro/Android-ObservableScrollView/master/samples/images/demo10.gif) ![](https://raw.githubusercontent.com/ksoichiro/Android-ObservableScrollView/master/samples/images/demo13.gif)|
|[XCL-Charts][51]|Android图表库(XCL-Carts is a free charting library for Android platform.),基于Android Canvas来绘制各种图表,使用简便,定制灵活。目前支持3D/非3D/背向式/横向/竖向柱形图(Bar Chart)、3D/非3D饼图(Pie Chart)、堆叠图(Stacked Bar Chart)、面积图(Area Chart)、 折线图(Line Chart)、曲线图(Spline Chart)、环形图(Dount Chart)、南丁格尔玫瑰图(Rose Chart)、仪表盘(Dial Chart)、刻度盘(Gauge Chart)、雷达图(Radar Chart)、漏斗图(Funnel Chart)、圆形图(Cir…)| 
|[hellocharts-android][99]|Charts/graphs library for Android compatible with API 8+, several chart types with support for scaling, scrolling and animations<br> ![](https://github.com/lecho/hellocharts-android/raw/master/screens/scr_dependecy_preview.gif)<br> ![](https://github.com/lecho/hellocharts-android/raw/master/screens/scr-pie1.png)| 







#### 完整项目

| 名称 | 简介  | 
|------------|---------------|
|[LQRWeChat][77]|本项目仿最新版微信6.5.7（除图片选择器外），基于融云SDK，使用目前较火的 Rxjava+Retrofit+MVP+Glide 技术开发。相比上个版本，加入发送位置消息，红包消息等功能。<br> ![](https://github.com/GitLqr/LQRWeChat/raw/master/screenshots/1.gif)|
|[cniao5-news][82]|菜鸟新闻 客户端是一个仿照36Kr官方,实 时抓取36Kr官网数据的资讯类新闻客户端。包括首页新闻,详情,发现,活动,实时数据抓取,侧滑效果,第三方登录以及分享,消息推送等相关功能客户端。课程地址： http://www.cniao5.com/clazz/view/10076.html 视频下载链接： http://pan.baidu.com/s/1eQLyQxc 密码：3ts1<br> ![](https://github.com/yxs666/cniao5-news/raw/master/screenshot/pull_4%20(2).gif)|
|[KuaiChuan][83]|仿茄子快传的一款文件传输应用， 涉及到Socket通信，包括TCP，UDP通信<br> ![](https://github.com/mayubao/KuaiChuan/raw/master/ScreenShot/home.gif)|
|[CoolShopping][84]|一个仿拉手团购的购物App，采用Bmob后台实现短信验证码注册、登录、收藏、订单管理、自动更新等功能，数据抓取自拉手团购<br> ![](https://github.com/myxh/CoolShopping/raw/master/ScreenCapture/0.png)|
|[RNPolymerPo][85]|RNPolymerPo 是一个基于 React Native 的生活类聚合实战项目，目前由于没有 MAC 设备，所以没有适配 iOS，感兴趣的可以自行适配 app 目录下相关 JS 代码即可。<br> ![](https://github.com/yanbober/RNPolymerPo/raw/master/doc/home_page.png)|
|[bilibili][86]|仿 bilibili 的客户端<br> ![](https://github.com/HotBitmapGG/bilibili-android-client/raw/master-x/art/03.png)|
|[Android精准计步器][88]|亲测在小米.魅族.华为上可用<br> ![](https://github.com/linglongxin24/DylanStepCount/raw/master/screenshots/%E9%94%BB%E7%82%BC%E8%AE%A1%E5%88%92.jpg)|
|[菜鸟微博][89]|有新浪微博的主要功能，有Toolbar,RecyclerView等最新控件的用法；各种快速开发框架的使用，比如 Glide,PhotoView ，EventBus ，OKHttp，pullToRefresh等。 学习视频+源码 视频中还会讲到MVP设计模式以及一些架构师的入门知识。课程地址： http://www.cniao5.com/clazz/view/10075.html  视频下载链接： http://pan.baidu.com/s/1gexq3VP 密码：f0t9<br> ![](https://github.com/yxs666/cniao5-weibo/raw/master/screenshot/10.jpg)|
|[在线云打印平台][90]|一个在线云打印平台（android部分）含订单管理、百度地图、二维码等等<br> ![](https://github.com/LehmanHe/A4print/raw/master/picture/a1.png)|
|[CloudReader 云阅][91]|一款基于网易云音乐UI，使用Gank.Io及豆瓣api开发的符合Google Material Design的Android客户端。项目采取的是MVVM-DataBinding架构开发，现主要包括：干货区、电影区和书籍区三个子模块。DIY网易云音乐原来是如此Cool<br> ![](https://github.com/youlookwhat/CloudReader/raw/master/file/cloudreader.gif)|
|[StockChart][87]|采用主流rxjava+retrofit+dagger2框架，StockChart看股票的分时图，k线图。|
|[MVP][97]|MVP快速开发框架,App based on Material Design + MVP + Rxjava + Retrofit + Okhttp + RecyclerView + Glide + cache + theme + others + 全民直播 + 高德选址|











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
[73]: https://github.com/JZXiang/TimePickerDialog
[74]: http://blog.csdn.net/yanzhenjie1003/article/details/51319181
[75]: https://github.com/yingLanNull/AlphaTabsIndicator
[76]: https://github.com/czy1121/update
[77]: https://github.com/GitLqr/LQRWeChat
[78]: https://github.com/Bilibili/ijkplayer
[79]: https://github.com/HeZaiJin/SlantedTextView
[80]: https://github.com/Zhaoss/WeiXinRecordedDemo
[81]: https://github.com/CarGuo/GSYVideoPlayer
[82]: https://github.com/yxs666/cniao5-news
[83]: https://github.com/mayubao/KuaiChuan
[84]: https://github.com/myxh/CoolShopping
[85]: https://github.com/yanbober/RNPolymerPo
[86]: https://github.com/HotBitmapGG/bilibili-android-client
[87]: https://github.com/AndroidJiang/StockChart
[88]: https://github.com/linglongxin24/DylanStepCount
[89]: https://github.com/yxs666/cniao5-weibo
[90]: https://github.com/LehmanHe/A4print
[91]: https://github.com/youlookwhat/CloudReader
[92]: https://github.com/Hitomis/transferee
[93]: https://github.com/Piasy/BigImageViewer
[94]: https://github.com/afollestad/easy-video-player
[95]: https://github.com/xiongwei-git/AndroidVideoPlayer
[96]: https://github.com/linsea/UniversalVideoView
[97]: https://github.com/SuperMan42/MVP
[98]: https://github.com/rengwuxian/RxJavaSamples
[99]: https://github.com/lecho/hellocharts-android
[100]: https://github.com/Manabu-GT/ExpandableTextView
[101]: https://github.com/JessYanCoding/MVPArms
[102]: https://github.com/kaushikgopal/RxJava-Android-Samples
[103]: https://github.com/tbruyelle/RxPermissions
[104]: https://github.com/trello/RxLifecycle
[105]: https://github.com/google/gson
[106]: https://github.com/google/gson
[107]: https://github.com/google/gson
