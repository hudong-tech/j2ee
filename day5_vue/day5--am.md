```
知识回顾：
1、网站交互技术javascript，效率低，代码量太大，jQuery js代码更加简洁。它没太大创建，封装js。随着新的框架Vue，它们是有新的革命。jQuery淡出市场。Vue借鉴了jQuery很多特点，简写。

javascript 奠基人		基本语法		javase(jdk)
jQuery 提升js应用，工具包	工具包api		二维码google api
Vue革命性提升，框架	框架frame	三大框架，微服务框架
NodeJS 平台，		架构		分布式架构，互联网架构，大数据，人工智能

2、jQuery 简洁作用
$()
$(document)
$("#name")
$(".name")
$.ajax()
几乎把整个所有javascript要干的事情，它都进行封装

原生javascript是浏览器直接支持
jQuery它是第三方实现，导入文件支持。js文件
<script src="js/jquery.min.js"></script>

jquery文件已两种方式呈现：
1）jquery-1.7....js（日常我们写代码方式一样）	开发阶段，看看源码，修改jquery
2）jquery.min.js（压缩版，代码压缩，空格+换行+tab+注释）   生产环境，提升性能
网站静态资源：html、css、js，可以进行压缩	专门压缩工具，文件小，网络传输快

$().ready(function(){})
javascript body onload事件，在页面加载完毕触发调用
构建页面还未完成就会执行onload，不够精确，安全问题

.css	操作style
.attr	属性，早期
.prop	属性，1.6+，细分attr，checked/disabled
.text	文字 innerText，纯文本，如果内容有html标签不生效
.html	它支持html标签，它会解析
.click	绑定onclick事件

区分：html页面写法和jquery写法
html (onclick,onkeyup)  disabled（写=disabled配置，不配置不写）
jquery( click,keyup）      disbaled（true/false）
不同的世界有不同规则，html中要遵守html规则，jquery中要遵守jquery规则

jquery有没有学习成本？单独花时间来学习，成本高，难度高

$("#pay").click(function(){}
javascript强大，支持动态绑定事件，后期绑定（主流方式）
程序更加灵活，程序结构复杂，不易读程
<div onclick="doLogin()"></div> 前期绑定

$("[id=ck]")  	jQuery选择器，对某个某几个标签进行处理，找到它
[id=ck]
[name=ck]
input[id=ck]
input[type=text]

Vue，直接对数据进行处理，不去关心数据在哪？

jquery只是javascript延伸
页面只是美化，只是方便，最终要和后台系统进行交互

发起请求ajax异步请求方式，无需刷新整个页面，实现局部刷新
异步：同步请求后，如果结果没有返回，你不能干其他事情
	从控制台输入，如果没有输入，阻塞（等待）这种方式同步
	异步，无需等待。回调机制callback
刷新整个页面？打开新页面，刷新整个页面（早期技术）
局部刷新？
	局部刷新，去改变div颜色，字体大小（速度快，效果好，主流方式）

ajax局部刷新的技术
	原生javascript XmlHttpRequest（xhr对象）api
	jQuery封装xhr对象，语法简洁

7个参数
$.ajax({
	type		GET（?skuIds=123）/POST(携带很多参数）form表单
	url		http://www.jd.com
	contentType	"application/json;charset=utf-8;" 防止中文乱码
	data		参数 { name:'tony'}
	dataType		html/xml/json（本网站）/jsonp（跨域，外网站）
	success		如果成功，触发这个事件
	error		如果失败，触发这个事件
})

json 特殊纯文本的数据结构
[]	数组
{}	一条记录
kv	“k”:”v”
用这种简单方式把xml中的标签就干掉，替代xml这种技术
json传输效率高

浏览器直接支持JSON
1）json字符串转换js对象：var str = JSON.parse(obj)
2）js对象转换json字符串：var obj = JSON.stringiry(jsonstr)

jquery+ajax+json

jquery从页面发起ajax请求，请求后台系统，后端系统进行业务处理，
处理完成返回，把java对象转成json字符串，ajax把返回结果作为回调方法的参数
succes: function(data){} data就是后台返回的结果，ajax把拿到json字符串，自动转换js对象
data是json字符串，还是js对象？data已经是js对象
在succes回调函数中对data进行解析。
data[0].p，在这设置，页面改变，这种方式：回显

下面我们要安装git，大家先找到安装文件，之前已经下放
大家安装下，
包括注册码云账号，

今日任务：
1）码云，代码管理工具，团队协作工具
git、github、码云，需要自己的账号
命令很多，无需记忆
2）Vue，Bootstrap
Bootstrap特点响应式布局，Vue-element-admin参照bootstrap也支持响应式布局
同时支持pc电脑和ipad，手机，大小屏幕（理想状态）
UI界面美化，没有交互效果

Vue-element-admin响应式布局（大屏幕，小屏幕）支持，
UI界面美化支持（饿了吗ui，elementui），基于Vue交互
一个软件系统基础功能，权限管理，基础字典kv

培优学习后端技术，大前端，

文件备份，术语：版本控制
1）备份网上（副本3份，分散不同服务器）
2）多个历史备份，一个文件备份多次（代码）
3）多个人可以同时编写一个文件，可以查看代码文件差异，标识出来，手工解决

SVN，CVS，git
svn擅长项目所有的文档管理（合同，代码），加权限
git擅长代码管理，粗权限，开源：公用

git/github/码云
git是一种技术规范
github国外网站，基于git技术实现网站，管理全球开源代码vue-element-admin
码云和github类似，实际是github镜像（复制）区域化，本地化 taobao，10分钟同步一次

通过码云实现代码管理
1）在电脑上git客户端。它的执行命令行方式，dos黑窗口
	IDE开发工具都有集成，eclipse、idea整合
2）码云（外网）必须注册账号，手机号
	如何让它和本地git连接起来
连接只连接一次

整个过程：git（本地）+码云（外网）

系统菜单：git bash，进入git环境黑窗口
目录的右键菜单：git bash

需要码云账号，在git中填写账号信息就和远程仓库（中央github，镜像码云）建立关系


权限：当前登录操作系统的账号会有权限访问问题
hbuilderx创建项目目录下，这个能创建文件，就可以操作git

打开码云创建仓库，不能直接使用，要执行下面命令：
mkdir cgb2007 	mkdir创建一个目录
cd cgb2007	cd进入目录
git init		git命令，init初始化

touch README.md		touch dos命令，创建一个新文件，空文件没有内容
git add README.md	add命令把这个文件保存暂存区（本地索引）
git commit -m "first commit"	commit提交，把标识过的文件保存到本地仓库（复制文件）
			参数-m "字符串"，给这次提交写个备注信息
	git remote add origin https://gitee.com/nutony/cgb2007.git
			remote远程 add新增 origin原始分支
	https://gitee.com/nutony（改成你的名称）/cgb2007（仓库名称）.git
		改成你自己的仓库
git push -u origin master	push从本地仓库（推送）保存远程仓库（master主分支）
一般项目无需分支，默认主分支

如果判断成功，上面列名命令界面消失，变成仓库管理的界面

如果密码写错，先执行下面语句，重新重头做
git config --system --unset credential.helper
然后提交操作时，会出现询问框，重新输入码云用户名的命令行

如果提示用户名密码不正确，可以参考下面网站改下码云配置
https://www.cnblogs.com/allyh/p/10416066.html
```