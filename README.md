Ext-doc
=======

ext-doc is a ExtJS-style JavaScript comments processor

Currently it includes only one sample (please, read sample/README.txt)
and one XSLT-based template (template/ext). 

Requires Java 1.6 to run.

Quick Start:

0. Download ExtJS source code
0. Create "sample/ext" folder
0. Copy ExtJS source to "sample/ext" (ex.: sample/sample.js)
0. Run sample/ext-doc.bat ("output" directory will be created)
0. Copy "output" to http server

Andrey Zubkov aka [oxymoron](https://github.com/oxymoron)

## 变更信息

最早在2010年接触到这个项目，但使用时发现文档中所有中文都输出为乱码，于是从[ext-doc](http://ext-doc.org/)的[项目主页](http://code.google.com/p/ext-doc/)checkout了svn的源码，把输出文件编码的地方尝试性改成了GB2312（不知道为什么原来的UTF8不行），Eclipse却提出缺少文件无法编译。然后只好尝试性的从发布的jar包反编译出Java代码，发现真有多出来的文件——居然源码中的文件不全，囧！终于使用反编代码编译成功后可以正确显示中文了！之后又对文档中`define in <file>`的逻辑做了修复，并修改了资源文件夹的路径，最终形成这个包，可谓大费周折！

由于作者并没有在github上发布，而Google code上我也推不回去，所以放在这里供有中文文档生成需求的人使用。

本项目中仅根据原项目路径提供Java代码，如需修改，请下载原项目并合并Java代码后自行处理。

另外这个项目已经过时，在Ext4发布后，新的文档生成工具[jsduck](https://github.com/senchalabs/jsduck)仍作为开源项目并已被发布在github上，基本可以替代老的ext-doc（中文仍然支持有问题），这里仅作为项目留存。

2012-3-4 by [mytharcher](https://github.com/mytharcher)