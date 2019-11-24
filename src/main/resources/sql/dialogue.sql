/*
 Navicat Premium Data Transfer

 Source Server         : MySQL8
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3308
 Source Schema         : dialogue

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 24/11/2019 22:42:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dialog
-- ----------------------------
DROP TABLE IF EXISTS `dialog`;
CREATE TABLE `dialog`  (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `type` int(3) NOT NULL COMMENT '类型: 0: 顶级目录 1: 子目录 2: 对话文章',
  `parent_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '父节点ID  -1: 顶级父节点',
  `creat_date` bigint(13) NOT NULL COMMENT '创建时间',
  `update_date` bigint(13) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for dialog_detail
-- ----------------------------
DROP TABLE IF EXISTS `dialog_detail`;
CREATE TABLE `dialog_detail`  (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '对话详情ID',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '对话标题',
  `attach_file` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '关联文件',
  `create_date` bigint(13) NOT NULL COMMENT '创建时间',
  `update_date` bigint(13) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for dialog_sentence
-- ----------------------------
DROP TABLE IF EXISTS `dialog_sentence`;
CREATE TABLE `dialog_sentence`  (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '句子ID',
  `ref_detail_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理详情ID',
  `sentence` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '句子英文',
  `sentence_trans` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '句子翻译',
  `begin_time` bigint(13) NOT NULL COMMENT '句子语音开始时间',
  `end_time` bigint(13) NOT NULL COMMENT '句子语音结束时间',
  `create_time` bigint(13) NOT NULL COMMENT '创建时间',
  `update_time` bigint(13) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for dialog_user
-- ----------------------------
DROP TABLE IF EXISTS `dialog_user`;
CREATE TABLE `dialog_user`  (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户ID',
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名称',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `statue` int(1) NOT NULL DEFAULT 1 COMMENT '用户状态 1: 正常 0:禁止登录  -1: 已删除',
  `grade` int(3) NOT NULL COMMENT '年级',
  `create_time` bigint(13) NOT NULL COMMENT '创建时间',
  `update_time` bigint(13) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
