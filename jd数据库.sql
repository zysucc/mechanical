CREATE TABLE `wd_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '导航栏id',
  `category_id` bigint(20) NOT NULL COMMENT '导航栏子id',
  `title` varchar(200) DEFAULT NULL COMMENT '导航栏分类描述',
  `status` tinyint(4) NOT NULL DEFAULT '1' COMMENT '导航状态，1-正常，2-下架，3-删除',
  `sort` SMALLINT(5) NOT NULL COMMENT '导航排序',
  `created` datetime NOT NULL COMMENT '创建时间',
  `updated` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `category_id` (`category_id`),
  KEY `status` (`status`),
  KEY `updated` (`updated`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='导航栏表';


CREATE TABLE `wd_content` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `category_id` bigint(20) NOT NULL COMMENT '内容类目ID',
  `title_desc` varchar(200) DEFAULT NULL COMMENT '标题描述',
  `url` varchar(150) DEFAULT NULL COMMENT '链接',
  `pic` varchar(150) DEFAULT NULL COMMENT '图片绝对路径',
  `content` text COMMENT '内容',
  `author` varchar(50) DEFAULT NULL COMMENT '发布作者',
  `num` int(10) DEFAULT 0 COMMENT '浏览次数',
  `created` datetime DEFAULT NULL,
  `updated` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `category_id` (`category_id`),
  KEY `updated` (`updated`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品详细信息表';


CREATE TABLE `wd_answer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title_desc` varchar(200) DEFAULT NULL COMMENT '问题描述',
  `content` text COMMENT '内容',
  `author` varchar(50) DEFAULT NULL COMMENT '发布作者',
  `num` int(10) DEFAULT 0 COMMENT '浏览次数',
  `created` datetime DEFAULT NULL,
  `updated` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `updated` (`updated`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='常见问答表';

-- CREATE TABLE `jd_product` (
--   `id` bigint(20) NOT NULL AUTO_INCREMENT,
--   `category_id` bigint(20) NOT NULL COMMENT '内容类目ID',
--   `title_desc` varchar(500) DEFAULT NULL COMMENT '标题描述',
--   `pic` varchar(300) DEFAULT NULL COMMENT '图片绝对路径',
--   `content` text COMMENT '内容',
--   `author` varchar(50) DEFAULT NULL COMMENT '发布作者',
--   `num` int(10) DEFAULT 0 COMMENT '浏览次数',
--   `created` datetime DEFAULT NULL,
--   `updated` datetime DEFAULT NULL,
--   PRIMARY KEY (`id`),
--   KEY `category_id` (`category_id`),
--   KEY `updated` (`updated`)
-- ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品详细信息表';


CREATE TABLE `wd_about` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `category_id` bigint(20) NOT NULL COMMENT '内容类目ID',
  `title_desc` varchar(200) DEFAULT NULL COMMENT '标题描述',
  `content` text COMMENT '内容',
  `created` datetime DEFAULT NULL,
  `updated` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `category_id` (`category_id`),
  KEY `updated` (`updated`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='关于我们';


CREATE TABLE `wd_honor` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `category_id` bigint(20) NOT NULL COMMENT '内容类目ID',
  `title_desc` varchar(200) DEFAULT NULL COMMENT '标题描述',
  `pic` varchar(300) DEFAULT NULL COMMENT '压缩图片路径',
  `big_pic` varchar(300) DEFAULT NULL COMMENT 'big图片路径',
  `author` varchar(50) DEFAULT NULL COMMENT '发布作者',
  `num` int(10) DEFAULT 0 COMMENT '浏览次数',
  `created` datetime DEFAULT NULL,
  `updated` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `category_id` (`category_id`),
  KEY `updated` (`updated`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='荣誉资质';


CREATE TABLE `wd_call` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `category_id` bigint(20) NOT NULL COMMENT '内容类目ID',
  `address_content` text COMMENT '内容',
  `created` datetime DEFAULT NULL,
  `updated` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `category_id` (`category_id`),
  KEY `updated` (`updated`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='联系我们';