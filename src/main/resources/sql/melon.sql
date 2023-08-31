/*
 Navicat Premium Data Transfer

 Source Server         : MySQL57
 Source Server Type    : MySQL
 Source Server Version : 50734
 Source Host           : localhost:3306
 Source Schema         : melon

 Target Server Type    : MySQL
 Target Server Version : 50734
 File Encoding         : 65001

 Date: 31/08/2023 11:02:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_reply
-- ----------------------------
DROP TABLE IF EXISTS `tb_reply`;
CREATE TABLE `tb_reply`  (
  `rpid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '评论id',
  `vid` bigint(20) NOT NULL COMMENT '视频id',
  `name` varchar(400) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '评论人姓名',
  `reply` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '评论',
  `liked` int(11) NULL DEFAULT NULL COMMENT '点赞数量',
  `ctime` timestamp(0) NULL DEFAULT NULL COMMENT '评论时间',
  `platform` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '平台',
  PRIMARY KEY (`rpid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
